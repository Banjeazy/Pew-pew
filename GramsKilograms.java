import java.util.Scanner;

public class GramsToKilogramsConverter {
    public static void main(String[] args) {
        System.out.print("Введите граммы: ");
         Scanner scan = new Scanner(System.in);
         int grams = scan.nextInt();
         double kilograms = grams * 0.001;
        System.out.println("Килограмм: " +  kilograms);
      }
}