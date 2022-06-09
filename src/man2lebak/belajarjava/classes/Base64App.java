package man2lebak.belajarjava.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Base64App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan kalimat yang akan di encode: ");
        String query = scanner.nextLine();

        // encode
        String encode = Base64.getEncoder().encodeToString(query.getBytes());

        // decode
        byte[] bytes = Base64.getDecoder().decode(encode);
        // dikonversi ke string
        String result = new String(bytes);

        System.out.println(encode + " | " + result);

    }
}
