package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\Asus\\Desktop\\SoftUni\\FileDemo.txt";
        FileInputStream inputStream = new FileInputStream(path);
        int nextByte = inputStream.read();
        while (nextByte != -1) {
            System.out.print(Character.toChars(nextByte));
            nextByte = inputStream.read();
        }
        System.out.println();

        try {
            example(); // ако възникне exception
        } catch (IOException ex) { // улови го
            System.out.println(ex.getMessage());
        } finally{ // винаги се изпълнява накрая след горно (каквото и да се случва отгоре)
            System.out.println("Try catch finished!");
        }

    }

    public static void example() throws IOException {
        throw new IOException("I am exception in a empty method call");
    }

}
