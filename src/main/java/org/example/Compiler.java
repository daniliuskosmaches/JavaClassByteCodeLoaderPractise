package org.example;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Compiler {





    private String className;



    public void CompileCode(String className, String code) throws IOException {
        File file = new File(className + ".java");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(code);
            writer.flush();
        }
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new RuntimeException("No Java compiler available");

        }
        int result = compiler.run(null, null, null, file.getPath());
        if (result != 0) {
            throw new RuntimeException("Compilation failed");

        }


    }

    public void ExecuteCode(String className) throws Exception {
        File folder = new File("./");
        URL url = folder.toURI().toURL();
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});
        Class<?> clazz = classLoader.loadClass(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod("main");
        method.invoke(obj);


    }

}
