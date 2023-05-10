import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a string to encode: ");
            String input = scanner.nextLine(); // 'Hello World

            int[] encoded = Encoder.encode(input, 1); // [73, 102, 109, 112, 102, 32, 88, 112, 115, 109, 101]
            System.out.println(encoded);

            System.out.println("Would you like to decode?" + " (y/n)");
            String answer = scanner.nextLine(); // y
            if (answer.equals("y")) {
                String decode = Decoder.decode(encoded, 1); // [73, 102, 109, 112, 102, 32, 88, 112, 115, 109, 101]
                System.out.println(decode);
            }
        }
    }
}
