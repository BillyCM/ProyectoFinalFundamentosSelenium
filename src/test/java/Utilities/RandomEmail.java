package Utilities;

import java.util.Random;

public class RandomEmail {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public String generateEmail() {
        int length = 10;
        Random random = new Random();
        StringBuilder builder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            builder.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }

        builder.append("@hotmail.com");
        String email = builder.toString();

        return email;

    }

}
