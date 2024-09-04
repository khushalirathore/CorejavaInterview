package com.rays.String;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "java"; // original string

        // Convert the string to a character array
        char[] ar1 = s1.toCharArray();

        // Sort the character array using a simple sorting algorithm (bubble sort)
        for (int i = 0; i < ar1.length - 1; i++) {
            for (int j = i + 1; j < ar1.length; j++) {
                if (ar1[i] > ar1[j]) {
                    // Swap ar1[i] and ar1[j]
                    char temp = ar1[i];
                    ar1[i] = ar1[j];
                    ar1[j] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        String sortedString = new String(ar1);

        // Print the resulting string
        System.out.println(sortedString); // Output will be "aajv"
    }
}
