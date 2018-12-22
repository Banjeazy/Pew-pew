import java.util.Scanner;

public class GramsKilograms {
    public static void main(String[] args) {
        System.out.print("Введите граммы: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double x = number * 0.001;
      System.out.println("Килограмм: " +  x);
      }

}