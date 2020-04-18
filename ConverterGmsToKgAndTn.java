package Tasks1;

public class ConverterGrammsToKgAndTn {
    public static void main(String[] args){
        ConverterGrammsToKgAndTon con = new ConverterGrammsToKgAndTon();
        con.convertToKg(200);
        con.convertToTn(10000);

    }
    public static double convertToKg(double gramms){
        return gramms * 0.001;
    }
    public static double convertToTon(double gramms){
        return gramms * 0.000001;
    }

}
