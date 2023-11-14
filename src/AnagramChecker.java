import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "";
        String word2 = "";

        System.out.println("Input in your first word.");
        word1 = scan.nextLine();
        System.out.println("Input your second word.");
        word2 = scan.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.length() == word2.length()) {

            char[] array1 = word1.toCharArray();
            char[] array2 = word2.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            if(Arrays.equals(array1, array2)) {
                System.out.println("Your words are anagrams.");
            } else {
                System.out.println("Not anagrams.");
            }
        } else {
            System.out.println("Your words aren't anagrams.");
        }
    }
}