package complete;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Attempt 1 -> 05/25/2022
public class Question500 {

    // Had something similar, looked at a hint and decided to use it.
    public String[] findWords(String[] words) {
        Set<Character> row1 = stringToCharSet("qwertyuiop");
        Set<Character> row2 = stringToCharSet("asdfghjkl");
        Set<Character> row3 = stringToCharSet("zxcvbnm");

        List<String> res = new ArrayList<>();
        for(String word: words){
            if(isValid(row1, word) || isValid(row2, word) || isValid(row3, word)){
                res.add(word);
            }
        }

        return res.toArray(new String[0]);
    }

    boolean isValid(Set<Character> row, String word){
        for(char c: word.toCharArray()){
            if(!row.contains(Character.toLowerCase(c))) return false;
        }
        return true;
    }

    Set<Character> stringToCharSet(String str){
        Set<Character> set = new HashSet<>();
        for(char c: str.toCharArray()){
            set.add(c);
        }
        return set;
    }

}
