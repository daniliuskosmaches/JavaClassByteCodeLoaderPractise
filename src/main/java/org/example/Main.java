package org.example;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import static jdk.vm.ci.hotspot.HotSpotJVMCIRuntime.Option.Compiler;


public class Main {
    public void CompileCode(String className,String code) throws IOException {
        File file = new File(className + ".java");
        FileWriter writer = new FileWriter(file);
        writer.write(code);
        writer.flush();
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        String result = compiler.run(null, null, null, file.getPath());









    }
    public void ExecuteCode() throws Exception {
        File ByteCodeFile = new File(result);


        ClassLoader classLoader = ClassLoader.getSystemClassLoader();



    }




}
   public static void main(String[] args) throws InterruptedException {


}
