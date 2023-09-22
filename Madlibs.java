import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args){
        //Creating a program that asks user for a season of the year, then a whole number , then an adjective.
        //Use the input to complete the sentence below the output the result:
        //"On a [Adjactive] [Season of the year] day, i drink a minimum of [whole number] cup of coffee"
        
        System.out.println("Started working");

        //Asking user for the season of the year
        System.out.println("Enter the season of the year :");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        //Asking user for the Whole number
        System.out.println("Enter the whole number :");
        int num = scanner.nextInt();
        //Asking user for the Adjective
        System.out.println("Enter the Adjective  :");
        String adjective = scanner.next();
        scanner.close();
        
        //Displaying the output as "On a [Adjactive] [Season of the year] day, i drink a minimum of [whole number] cup of coffee"
        System.out.println("on a" + adjective + season + "day, i drink a minimum of"+ num + "cup of coffee");

    }
}
