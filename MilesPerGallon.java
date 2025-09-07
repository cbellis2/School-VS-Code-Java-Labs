import java.util.Scanner;

public class MilesPerGallon {
     public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;

        Scanner keyboard = new Scanner(System.in);
   
        System.out.print ("Enter the miles driven: ");
        miles = keyboard.nextDouble(); 

        System.out.print("Enter the gallons used: ");
        gallons = keyboard.nextDouble();

        mpg = miles / gallons;
        System.out.println("The MPG is " + mpg);
        
        keyboard.close();
    } 
}
