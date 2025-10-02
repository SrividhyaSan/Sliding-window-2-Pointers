Given a string s and an integer k.Find the length of the longest substring with at most k distinct characters.


Examples:
Input : s = "aababbcaacc" , k = 2

Output : 6

Explanation : The longest substring with at most two distinct characters is "aababb".

The length of the string 6.

Input : s = "abcddefg" , k = 3

Output : 4

Explanation : The longest substring with at most three distinct characters is "bcdd".

The length of the string 4.

Input : s = "abccab" , k = 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithkDistinct {
    public static void main(String args[]){
        String s="dcdabce"; // aababbcaacc
        int i=0,k=3,j=0,maxlen=0,n=s.length();
        // Using  map
//       Map<Character,Integer> map=new HashMap<>();
//       while(j<n){
//           char chr=s.charAt(j);
//           map.put(chr,map.getOrDefault(chr,0)+1);
//           if(map.size()>k){
//               map.put(s.charAt(i),map.get(s.charAt(i))-1);
//               if(map.get(s.charAt(i))==0){
//                   map.remove( s.charAt(i));
//               }
//               i++;
//           }
//           if(map.size()<=k)
//               maxlen=Math.max(maxlen,j-i+1);
//           j++;
//       }
        ArrayList<Character> distinctChars = new ArrayList<>();

        while (j < n) {
            char ch = s.charAt(j);

            // Add new character if it's not already in the list
            if (!distinctChars.contains(ch)) {
                distinctChars.add(ch);
            }
            // If we exceed k distinct characters, shrink the window
            while (distinctChars.size() > k) {
                char startChar = s.charAt(i);
                // Remove startChar only if it's not repeated in the window
                boolean stillExists = false;
                for (int m = i + 1; m <= j; m++) {
                    if (s.charAt(m) == startChar) {
                        stillExists = true;
                        break;
                    }
                }
                if (!stillExists) {
                    distinctChars.remove((Character) startChar);
                }
                i++;
            }
            maxlen = Math.max(maxlen, j - i + 1);
            j++;
        }

        System.out.println("maxlen  "+maxlen );
    }
}
