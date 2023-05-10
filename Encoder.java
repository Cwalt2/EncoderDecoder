public class Encoder {
      public static int[] encode(String input) {
        return encode(input, 0);
    }

    public static int[] encode(String input, int offset) {
        int[] encoded = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            encoded[i] = input.charAt(i) + offset;
        }
        return encoded; // returns encoded
    }
}
