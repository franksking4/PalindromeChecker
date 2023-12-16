public class Main {
  public static void main(String[] args) {
    String[] possiblePals = { "racecar", "tacocat", "goat", "bob", "malayalam", "kayak", "madam", "rabbit", "radar",
        "level", "amanaplanacanalpanama" };

    // Check the array and eliminate strings that are not
    // palindromes
    String[] palArray = palChecker(possiblePals);

    // Use a for-each loop to print the pal array
    // Your array must contain only palindromes
    for (String pal : palArray) {
      if (pal != null){
        System.out.println(pal);
      }
    }

    // Return the longest palindrome in the array
    String longPal = longestPal(palArray);
    System.out.println("Longest Palindrome: " + longPal);
  }
  // Read the input String array, make a new array that // only contains
  // palindroms and return that

  public static String[] palChecker(String[] possPals) {
    String[] pals = new String[possPals.length];

    for (int stringLocation = 0; stringLocation<possPals.length; stringLocation++){
      boolean isPalindrome = true;
      for (int characterLocation = 0; characterLocation<possPals[stringLocation].length()/2; characterLocation++){
        
        if (possPals[stringLocation].charAt(characterLocation) != possPals[stringLocation].charAt(possPals[stringLocation].length()-characterLocation-1)){
          isPalindrome = false;
        }
        if (isPalindrome){
          pals[stringLocation] = possPals[stringLocation];
        }
      }
    }
    return pals;
  }

  public static String longestPal(String[] arr) {
    String longest = "";
    for (String pal : arr) {
      if (pal != null){
        if (pal.length() > longest.length()) {
          longest = pal;
        }
      }
    }
    return longest;
  }
}