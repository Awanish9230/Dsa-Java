package Practice;

public class StringToInteger {

    static int convert(String s, int index) {
        if (index == s.length()) {
            return 0;
        }

        int currentDigit = s.charAt(index) - '0';
        int remaining = convert(s, index + 1);

        return currentDigit * (int)Math.pow(10, s.length() - index - 1) + remaining;
    }

    public static void main(String[] args) {
        String s = "2048";
        int result = convert(s, 0);
        System.out.println(result);
    }
}

