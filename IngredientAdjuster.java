import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String[] args) {
       int cookiesDesired= 24;
       double sugarNeeded = .75;
       double butterNeeded = .5;
       double flourNeeded = 1.375;
       
       Scanner keyboard = new Scanner(System.in);

       System.out.print("how many cookies do you want to make?");
       cookiesDesired = keyboard.nextInt();

       
       sugarNeeded = (1.5/48) * cookiesDesired;
       butterNeeded = (1.0/48) * cookiesDesired;
       flourNeeded = (2.75/48) * cookiesDesired;

       System.out.println("\nTo make " + cookiesDesired + " cookies, you will need:");
       System.out.println(sugarNeeded + "cups of sugar");
       System.out.println(butterNeeded + "cups of butter");
       System.out.println(flourNeeded + "cups of flour");

       keyboard.close();
    }
}