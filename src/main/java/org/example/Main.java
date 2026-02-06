package org.example;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public Main() {
        this.compiler = compiler;

    }
    private Compiler compiler;

   public static void main(String[] args) throws Exception {





    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter the class name:");
    String className = scanner.nextLine();
    System.out.println("please enter the code:");
    String code = scanner.nextLine();
    Compiler compiler = new Compiler();
    compiler.CompileCode(className,code);
    if (className == null && code == null) {
        throw new InterruptedException("Error code and className null");
    }
    compiler.ExecuteCode(className);






    scanner.close();




}  }

