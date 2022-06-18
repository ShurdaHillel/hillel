package com.hillel.lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Begin program");
        try {
            Printer.printFloat(25.456f);
            Printer.printFloat(24.1456);
//            System.exit(0);
//            return;
            Printer.printFloat("14.879");
//            System.out.println("Continue program");
//            Printer.printFloat(null);
        } catch (NullPointerException e) {
            System.out.println("Printer can not work with NPE " + e.getMessage());
        } catch (PrinterException e) {
            System.err.println("Printer operation is failed: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Other exceptions: " + e.getMessage());
        } finally {
            System.out.println("finally execute");
        }



        System.out.println("End program");

    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }
    }
}
