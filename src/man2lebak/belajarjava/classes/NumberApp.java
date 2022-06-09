package man2lebak.belajarjava.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 1000;

        Double doubleValue = intValue.doubleValue();
        System.out.println(doubleValue.getClass().getSimpleName());

        Byte byteValue = intValue.byteValue();
        System.out.println(byteValue.getClass().getSimpleName());

        Float floatValue = intValue.floatValue();
        System.out.println(floatValue.getClass().getSimpleName());

        Long longValue = intValue.longValue();
        System.out.println(longValue.getClass().getSimpleName());

        Short shortValue = intValue.shortValue();
        System.out.println(shortValue.getClass().getSimpleName());

        String umur = "17";

        int umurPr = Integer.parseInt(umur);
        System.out.println(umurPr);

        String yes = "yes";
        System.out.println(yes.getClass().getSimpleName());

        Integer no = 10;
        System.out.println(no.getClass().getSimpleName());


    }
}
