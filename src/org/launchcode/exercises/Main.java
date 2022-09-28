package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

//        System.out.println(Divide(12,2));
        // Test out your CheckFileExtension() function!

       for(Map.Entry<String, String>student: studentFiles.entrySet()){
           System.out.println(student.getKey() + ", " + CheckFileExtension((student.getValue())));
       }
    }

    public static int Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Can't divide by zero!");
            } catch (ArithmeticException a) {
                a.printStackTrace();
            }
            System.out.println("Value is zero");
        }
            int z = x / y;
            return z;
    }

    public static int CheckFileExtension(String fileName) {
        int grade = 0;

        if (fileName == "" || fileName == null) {
            grade -= -1;
            try {
                throw new Exception("Invalid file! Minus one point.");
            } catch (Exception a) {
                a.printStackTrace();
            }
            System.out.println();
        }
        if (fileName.contains(".java")) {
            grade = +1;
        } else if (!fileName.contains(".java")) {
            grade += 0;
        }
        return grade;
        }
    }


