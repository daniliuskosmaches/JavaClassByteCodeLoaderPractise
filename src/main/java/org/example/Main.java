import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;



public class Main {
    private String className;
    public Main(String className) {
        this.className = className;
    }

    public void CompileCode(String className,String code) throws IOException {
        File file = new File(className + ".java");

       try( FileWriter writer = new FileWriter(file)) {
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
   public static void main(String[] args) throws InterruptedException {


}
