package man2lebak.belajarjava.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (var i = 0; i < 10; i++) {
            int value = random.nextInt(100);
            System.out.println(value);
        }
    }
}
