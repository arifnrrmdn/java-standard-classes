package man2lebak.belajarjava.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("|", "[", "]");

        joiner.add("Arif");
        joiner.add("Nur");
        joiner.add("Ramadhan");

        System.out.println(joiner.toString());
    }
}
