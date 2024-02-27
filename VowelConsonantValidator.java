import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelConsonantValidator {
    public static void main(String[] args) {

        String password = "aaaaabba";
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int vowelcount = 0;
        int consonants = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (vowels.contains(c)) {
                vowelcount++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }

        if (consonants > vowelcount) {
            System.out.println((consonants - vowelcount) / 2);
        } else {
            System.out.println((vowelcount - consonants) / 2);
        }
    }
}
