package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public Main() {
        this.compiler = compiler;

    }
    private Compiler compiler;

    public String ClassNameFinder(String code) {
        Pattern pattern = Pattern.compile("class\\s+([a-zA-Z_][a-zA-Z0-9_]*)");
        Matcher matcher = pattern.matcher(code);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new RuntimeException("No class name found");
    }

   public static void main(String[] args) throws Exception {
        Compiler compiler = new Compiler();
















}  }

