// Random Password Generator
import java.util.Random;
import java.util.*;

public class PasswordGenerator {

   private static char[] generatePassword(int minLen) {

      String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$%&*";
      String numbers = "1234567890";
      String combinedChars = capitalLetters + lowerLetters + specialCharacters + numbers;
      Random randomObj = new Random();
      char[] pass = new char[minLen];

      for (int i = 0; i < minLen; i++) {
         pass[i] = combinedChars.charAt(randomObj.nextInt(combinedChars.length()));
      }
      return pass;
   }

   public static void main(String[] args) {
      int minLen = 8;
      System.out.println("Welcome to the Random Password Generator: \n");
      System.out.println("Enter the length of your pass (Min : 8)");
      Scanner sc = new Scanner(System.in);
      int len = sc.nextInt();
      if (len < 8) {
         System.out.println("Error  :  Minimum Length must be 8");
         System.exit(0);
      }

      minLen = len;
      System.out.printf("Your Random Password : ", minLen);
      System.out.println(generatePassword(minLen));
   }
}
