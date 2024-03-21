package org.example;

import java.util.Scanner;

// Seçilen mevsime göre ingilizce ayları getiren program.

public class Main {
    public static void main(String[] args) {
        String season;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which season's months do you want to see ? (Spring - Summer - Autumn - Winter)");
        season = scanner.nextLine().toLowerCase();

        switch (season) {
            case "spring":
                System.out.println("March, April, May");
                break;
            case "summer":
                System.out.println("June, July, August");
                break;
            case "autumn":
                System.out.println("September, October, November");
                break;
            case "winter":
                System.out.println("December, January, February");
                break;
            default:
                System.out.println("Invalid season input!");
        }

        scanner.close();
    }
}