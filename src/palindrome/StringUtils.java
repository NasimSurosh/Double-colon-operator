package palindrome;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringUtils {
  public static boolean isPalindrome(String palindrome) {
    int left = 0;
    int right = palindrome.length()-1;
    
    while(left < right) {
      if(palindrome.charAt(left) != palindrome.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;

  }

  public static List<String> filterPalindrome(List<String> list, Predicate<String> predicate) {
    return list.stream()
        .filter(predicate)
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    List<String> list = Arrays.asList("Kamil", "bob", "teeth", "Tot");
    System.out.println("Original list: ");
    list.forEach(System.out::println);
    
    System.out.println("\nFiltered list: ");
    List<String> filtring = filterPalindrome(list, StringUtils::isPalindrome);
    filtring.forEach(System.out::println);
    }

}
