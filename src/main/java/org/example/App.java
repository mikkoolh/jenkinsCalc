package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = -1;
        while (selection != 0) {
            System.out.println("0 - Exit\n1 - Calculate distance");
            selection = Integer.parseInt(scan.nextLine());

            if (selection == 1) {
                calcDistance(scan);
            } else if (selection == 0) {
                System.out.println("Bye bye!");
            }
        }
    }

    public static void calcDistance(Scanner scanner) {
        System.out.println("\nCalculate the distance between two points.\n1. point X:");
        int firstX = Integer.parseInt(scanner.nextLine());
        System.out.println("1. point Y:");
        int firstY = Integer.parseInt(scanner.nextLine());

        System.out.println("2. point X:");
        int secondX = Integer.parseInt(scanner.nextLine());
        System.out.println("2. point Y:");
        int secondY = Integer.parseInt(scanner.nextLine());

        int xDiff = calcDifference(firstX, secondX);
        int yDiff = calcDifference(firstY, secondY);

        System.out.println("The distance between point " + firstX + "," + firstY + " and point " + secondX + "," + secondY + " is " + xDiff + "," + yDiff);
    }

    public static int calcDifference(int first, int second) {
        return second - first;
    }
}