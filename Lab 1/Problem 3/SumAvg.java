import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Find the Sum & Avg of 3 int values------");

        System.out.println("Enter the 1st number : ");
        int first = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int second = scanner.nextInt();

        System.out.println("Enter the 3rd number : ");
        int third = scanner.nextInt();

        //For summation
        int sum = first + second + third;

        // for the average
        double avg = sum/3.00;

        //the output
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}