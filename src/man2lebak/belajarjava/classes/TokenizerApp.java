package man2lebak.belajarjava.classes;

import java.util.StringTokenizer;

public class TokenizerApp {
    public static void main(String[] args) {
        String name = "Arif Nur Ramadhan";
        StringTokenizer tokenizer = new StringTokenizer(name," ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
