import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        System.out.println("BASIC SALARY CALCULATOR WITH IF ELSE CONDITION");
        
        /*All salespeople get a payment of $1200 a week.
        SalesPeople who exceed 10 sales get an addition bonus of $250.
        */
        int Salary = 1200;
        int Bonus = 250;
        
        //Getting unknown val from the users such as SAles in this case 
        System.out.println("Number of sales done by employees in this week\n");
        
        Scanner scanner = new Scanner(System.in);
        int Sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(Sales >= 10){
            Salary = Salary + Bonus;
            System.out.println("The EMployees Pay is $" + Salary);
        }else{
            System.out.println("Your Salary is same" + Salary);
        }

    }
}