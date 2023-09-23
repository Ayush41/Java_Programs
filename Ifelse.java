import java.util.Scanner;
public class Ifelse{
    public static void main(String[] args){
        System.out.println("IF Else demonstration :)");
        //IF STATEMENT 
        //Checking for greater number
        System.out.println("Enter the number to check odd or even");
        Scanner scanner = new Scanner(System.in);
        //TAKING INPUT VALUE 
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println(num1+ "is greater than" + num2);
        }else{
            System.out.println("num2 is greater");
        }
    }
}