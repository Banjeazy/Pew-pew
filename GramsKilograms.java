import java.util.Scanner;

public class GramsKilograms { // че за название? ваще надо сделать два класса. один Раннер с public static void main методом 
    //где бы вызывался статический метод другого Который бы и содержал эту логику и назывался както типа  GramsToKilogramsConverter
    public static void main(String[] args) {
        System.out.print("Введите граммы: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); // а что за имя такое?? это может быть граммы а?
        double x = number * 0.001;  // что за X?? может это килограммы?
      System.out.println("Килограмм: " +  x); // что за отступы?
      } // что за пустая строка в конце? 

}
