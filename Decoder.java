public class Decoder {
    public static String decode(int[] input) {
        return decode(input, 0);
    }

    public static String decode(int[] input, int offset) {
        String decoded = "";
        for (int i = 0; i < input.length; i++) {
            decoded += (char) (input[i] - offset);
        }
        return decoded; // returns decoded
    }
}
