package Chapter6.array;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + "," + (int) alphabets[i]);
        }
    }
}
