package com.smu.mscda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program will capitalize the input string and generate MD5 hex! ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String capitalized = StringUtil.capitalize(input);
        String md5Hex = StringUtil.generateMD5Hex(capitalized);

        System.out.println("Capitalized string is: " + capitalized);
        System.out.println("MD5 Hex is: " + md5Hex);
    }
}