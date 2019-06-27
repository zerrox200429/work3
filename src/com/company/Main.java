package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Эрбол", "Адильхан", "Адам"};

        for(int i = 0; i<names.length; i++) {

            switch (i) {
                case (0):
                    System.out.println("Доброе Утро," + names[i]+ "!");
                    break;
                case (1):
                    System.out.println("Добрый День," + names[i]+ "!");
                    break;
                case (2):
                    System.out.println("Добрый Вечер," + names[i] + "!");
                    break;


            }
        }
    }
}
