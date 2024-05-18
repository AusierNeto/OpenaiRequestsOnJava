package com.tinit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Methods {
    
    public static void createTestFile() {
        try {
            File testFile = new File("test.txt");
            testFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readTestFile() {
        File Obj = new File("test.txt");
        Scanner Reader;
        try {
            Reader = new Scanner(Obj);
            int counter = 0;
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data + " " + counter);
                counter++;
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
