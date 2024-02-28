public class Palindrome {
    public static void main(String[] args) {
        String test = "";
        String xString = Integer.toString(121);

        for (int i = xString.length() - 1; i >= 0; i--) {
            test = test + xString.charAt(i);
        }
        System.out.println(test + " " + xString);
        if (xString.equals(test)) {
            System.out.println(test + " " + xString);
        }
    }
}
