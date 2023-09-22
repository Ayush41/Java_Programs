import java.util.Scanner;

public class PayCalculator {
    public static void main(String[] args){
        System.out.println("Started...");
        //Getting the number of hrs worked;
        System.out.println("Numbers of hrs worked by the employee :- ");
        Scanner scanner = new Scanner(System.in);
       int hours = scanner.nextInt(); //Reading the input

        //Getting the hourly pay rate;
        System.out.println("Enter the employees pay rate :-");
       double payrate = scanner.nextDouble();

        //Multiplying the hr rate & pay rate
        double grossPay = hours * payrate;

        //Displaying the results
        System.out.println("The Gross Pay is :-"+grossPay);
    }
}
