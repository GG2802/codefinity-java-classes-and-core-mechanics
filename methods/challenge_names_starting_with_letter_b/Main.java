package com.example;

public class Main {
    static String[] sortNamesStartWithLetterB(String[] names) {
        int size = 0;
        for (String name : names) {
            if (name.charAt(names.length) == 'B') {
                size++;
            }
        }
        String[] result = new String[___];
        int index = ___;
        for (String name : names) {
            if (name.charAt(___) == '___') {
                result[___] = name;
                index++;
            }
        }
        return ___;
    }

    public static void main(String[] args) {
        String[] names = {"Ben", "Bob", "Alice", "Mikel", "Brian", "Brandon", "Nick", "Ryan"};
        String[] namesStartsLetterB = ___;
        for (String name : namesStartsLetterB) {
            System.out.print(name + " ");
        }
    }
}