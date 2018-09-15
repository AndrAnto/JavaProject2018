package lesson2;

import java.util.Scanner;

public class raisePowerOfTwo{
    public static void main(String[] args){
        Scanner enterNumber = new Scanner(System.in);

        System.out.println("Please enter your numerialc value that you want to raise to a power:");
        int enteredNumber = enterNumber.nextInt();
        int sumResult = enteredNumber * enteredNumber;
        System.out.println("Your entered number:" + enteredNumber + " is raised to a power: " + sumResult);
    }
}
