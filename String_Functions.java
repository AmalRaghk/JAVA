/*
length()-to find the size of a string
cocat()-to concat a string
equals()-to compare string
equalsIgnoreCase()-to compare strings without case difference
compareTo()-Unicode character from each String is compared
indexOf()- we want to know the index of the first occurence of a character in a string
charAt()- method returns the character located at a String‘s specified index.
subString()-The substring begins with the character at the specified index and extends to the end of the string.
toUpperCase(): returns the string value converted to uppercase
toLowerCase(): returns the string value converted to lowercase
*/
public class Review {
  
  public static void main(String[] args) {
    String name="github";
    //to print the size of the string
    System.out.println(name.length());
    //to print a concated string the string doesn't change
    System.out.println(name.concat("repo"));
    //to print the index of a char
    System.out.println(name.indexOf("u"));
    //to print the character at an index
    System.out.println(name.charAt(2));
    //to check equals
    System.out.println(name.equals("github"));
    //to print the substring from index 3 onto
    System.out.println(name.substring(3));
    //to print the upper case
    System.out.println(name.toUpperCase());
    //to print the lower case
    System.out.println(name.toLowerCase());
    
    
    
  }
  
}
