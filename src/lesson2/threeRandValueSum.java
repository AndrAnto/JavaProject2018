package lesson2;

public class threeRandValueSum {

    public static void main(String[] args){

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);

        int sumOfThreeRandNumbers = a + b + c;
        System.out.println("Sum of three random numbers: " + "first number = " + a + "; second number = "+ b + "; third number = " + c);
        System.out.println("Total Sum of three random number are: " + sumOfThreeRandNumbers);
    }
}
