package com.arnas.hw5;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        boolean salyga = true;

        // Niekada neveikiantys while/for ciklai
        System.out.println("...Niekada neveikiantys while/for ciklai");
        while(salyga = false) {
            System.out.println("Šis ciklas neturėtų niekada veikti.");
        }
        for (;salyga = false;) {
            System.out.println("Šis ciklas taip pat neturėtų niekada veikti.");
        }

        // // Amžini while/for ciklai
        // System.out.println("...Amžini while/for ciklai");
        // while(salyga = true) {
        //     System.out.println("Šis ciklas turėtų veikti amžinai.");
        // }
        // for (;salyga = true;) {
        //     System.out.println("Šis ciklas taip pat turėtų veikti amžinai.");
        // }

        Scanner userInput = new Scanner(System.in);
        String inputValue = "";
        while(!inputValue.equals("q")) {
            System.out.println("Įveskite tekstą spausdinimui į konsolę. ('q' išeina iš ciklo): ");
            inputValue = userInput.nextLine();
            System.out.println("Įvedėte: " + inputValue);
        }

        // Ciklas, spausdinantis atvirkščią tekstą vartotojo įvestam
        System.out.println("...Ciklas, spausdinantis atvirkščią tekstą vartotojo įvestam");
        inputValue = "";
        while(!inputValue.equals("q")) {
            System.out.println("Įveskite tekstą spausdinimui į konsolę. ('q' išeina iš ciklo): ");
            inputValue = userInput.nextLine();
            StringBuilder reverseInput = new StringBuilder();
            reverseInput.append(inputValue);
            reverseInput.reverse();
            System.out.println(reverseInput);
        }

        // Ciklas spausdinantis vartotojo įvestą tekstą paraidžiui
        System.out.println("---");
        System.out.println("...Ciklas spausdinantis vartotojo įvestą tekstą paraidžiui");

        inputValue = "";
        char[] charArr;
        while(!inputValue.equals("q")) {
            System.out.println("Įveskite tekstą spausdinimui į konsolę. ('q' išeina iš ciklo): ");
            inputValue = userInput.nextLine();
            charArr = inputValue.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                System.out.println(charArr[i] + " " + (i + 1));
            }
        }
    }
}