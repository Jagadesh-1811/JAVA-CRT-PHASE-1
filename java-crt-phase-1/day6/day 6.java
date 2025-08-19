// String Functions
class Main {
public static void main(String[] args) {
String a = "cse class";
String b = "Cse class";
System.out.println("a : "+a);
System.out.println("b : "+b);
System.out.println("a HashCode "+a.hashCode());
System.out.println("b HashCode "+b.hashCode());
System.out.println("Equal : "+a.equals(b));
System.out.println("Equal Ignore case : "+a.equalsIgnoreCase(b));
System.out.println("Length : "+a.length());
System.out.println("CharAt : "+a.charAt(0));
System.out.println("Uppercase : "+a.toUpperCase());
System.out.println("Lowercase : "+a.toLowerCase());
System.out.println("Replace : "+a.replace("Cse","Ece"));
System.out.println("Contains : "+a.contains("Cse"));
System.out.println("Empty : "+a.isEmpty());
System.out.println("startsWith : "+a.startsWith("Cs"));
System.out.println("Substring : "+a.substring(4));
System.out.println("Substring : "+a.substring(0,5));
}
}


//String to Char Array
class string_char_array {
public static void main(String[] args) {
String a = "Cse class";
char[] carry = a.toCharArray();
for(char c : carry){
System.out.println(c);
}
}
}

//Trim and Length
class string_trim_example {
public static void main(String[] args) {
String a = " Cse ";
System.out.println("Length : "+a.length());
System.out.println("a Trim :"+a.trim());
System.out.println("a Trim length :"+a.trim().length());
}
}

//Reverse a string
public class ReverseString {
    public static void main(String[] args) {
        String input = "Interview";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}

//palindrome
public class ReverseString {
    public static void main(String[] args) {
        String input = "Interview";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}

//Count occurances
import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "MOM";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
    }
}


//Remove duplicate characters
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        System.out.println("After removing duplicates: " + result);
    }
}

//Find first non repeating character
import java.util.LinkedHashMap;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String input = "swiss";
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        char result = '\0';
        for (char c : countMap.keySet()) {
            if (countMap.get(c) == 1) {
                result = c;
                break;
            }
        }
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}


//count consonents and vowels
public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Java Programming";
        int vowels = 0, consonants = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}








