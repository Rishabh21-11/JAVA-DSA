
import java.util.HashSet;

public class day3 {
    public static int lengthOf(String s){
        HashSet<Character>set = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for(int right = 0;right<s.length();right++){
            char curr = s.charAt(right);
            while(set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            maxlength = Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        
    }
}
