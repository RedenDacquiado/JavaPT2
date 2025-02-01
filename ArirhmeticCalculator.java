import java.util.Scanner;
public class ArirhmeticCalculator{
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        
        System.out.print("Enter First Number:");
        int number = imput.nextInt();

        System.out.print("Enter Second Number:");
        int number2 = imput.nextInt();

        int counter = number;
        counter = counter - number2;
        

        System.out.println("Values:");
        System.out.println("ADDITION: " + number + number2);
        System. out. println("SUBTRACTION = " + counter);
        System.out.println("MULTIPICATION: " + number * number2);
        System.out.println("DIVISION: " + number / number2);
    }
} 