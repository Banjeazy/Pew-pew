import java.util.Scanner;

public class GramsToKilogramsConverter {
    public static void convertGramsToKg() {
        System.out.print("Введите граммы: ");
         Scanner scan = new Scanner(System.in);
         int grams = scan.nextInt();
         double kilograms = grams * 0.001;
        System.out.println("Килограмм: " +  kilograms);
      }
}

// Должно быть
public class GramsToKilogramsConverter {
    
    public static double convertGramsToKg(double grams) {
        double kilograms = grams * 0.001;
        
        return kilograms;
    }
}
