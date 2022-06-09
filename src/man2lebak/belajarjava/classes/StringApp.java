package man2lebak.belajarjava.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Arif Nur Ramadhan";

        System.out.println(name);

        String toLower = name.toLowerCase();
        System.out.println(toLower);

        System.out.println(name.toUpperCase());

        int panjang = name.length();
        System.out.println(panjang);

        System.out.println(name.startsWith("Arif"));
        System.out.println(name.endsWith("an"));

        String[] names = name.split(" ");
        for(var value : names) {
            System.out.println(value);
        }

        char[] chars = name.toCharArray();
        for (var value : chars) {
            System.out.println(value);
        }

        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));


    }

}
