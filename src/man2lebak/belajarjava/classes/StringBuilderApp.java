package man2lebak.belajarjava.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        name.append("Arif");
        name.append(" ");
        name.append("Nur");
        name.append(" ");
        name.append("Ramadhan");

        String fullName = name.toString();
        System.out.println(fullName);
    }

}
