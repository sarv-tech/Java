// Sometimes it can happen that we need to store some text in our memory, for example a name, words, a sentence, or even a whole paragraph. In such cases, we use a data structure called "string", in which we can store characters, numbers, or anything that can be represented in the form of text.

// Strings => WORDS, PARAGRAPHS, SENTENCES

 // Strings are IMMUTABLE


import java.util.*;

public class whatIsStrings {

    public static void printLetters(String str) {

        for(int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
        
    }
    public static void main(String[] args) {

        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "Sarvesh Pingale";
        String str2 = new String("xyz@123");

        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("ENTER NAME: ");
        name = sc.nextLine();

        System.out.println(name);


        String fullName = "Sarvesh Pingale";
        System.out.println(fullName.length());    // to find the length of string

        // Concatenation of String
        String firstName = "Sarvesh";
        String lastName = "Pingale";

        String wholeName = firstName + " " + lastName;
        System.out.println(wholeName + " is this");

        printLetters(str);

    }
}