package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            numbers.add(input.nextInt());
        }
        System.out.println((double) (numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3) + numbers.get(4)) / 5);
        System.out.println(numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3) + numbers.get(4));
    }
}
