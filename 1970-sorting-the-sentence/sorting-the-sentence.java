import java.util.*;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        
        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '0'; 
            String actualWord = word.substring(0, word.length() - 1); 
            sorted[index - 1] = actualWord; 
        }

       
        return String.join(" ", sorted);
    }
}
