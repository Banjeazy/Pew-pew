package Tasks1;

public class ConverterGmsToKgAndTn {
    public static void main(String[] args){
        ConverterGmsToKgAndTn con = new ConverterGmsToKgAndTn();
        con.convertToKg(200);
        con.convertToTn(10000);

    }
    public static double convertToKg(double gms){
        return gms * 0.001;
    }
    public static double convertToTn(double gms){
        return gms * 0.000001;
    }

}
