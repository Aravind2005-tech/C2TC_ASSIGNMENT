package ACTIVITY;

import java.util.Scanner; // ✅ Import Scanner class

public class ACTIVITY {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // ✅ Correct variable name
        System.out.println("Enter your name:");
        String n = scan.nextLine(); // ✅ Use the correct Scanner object
        System.out.println("Hello " + n);
    }
}