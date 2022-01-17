
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Find Max and Min of 3 values-------");

        System.out.println("Enetr the 1st number: ");
        int first = scanner.nextInt();

        System.out.println("Enter the 2nd number: ");
        int second = scanner.nextInt();

        System.out.println("Enter the 3rd number: ");
        int third = scanner.nextInt();

        int max = 0, min = 0;

        // For the Max number
        if (first>second && first>third){
            max = first;
        }
        else if (second>first && second>third){
            max = second;
        }
        else{
            max = third;
        }

        //For the Min number

        if (first<second && first<third){
            min = first;
        }
        else if (second<first && second<third){
            min = second;
        }
        else{
            min = third;
        }

        //Print output
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}