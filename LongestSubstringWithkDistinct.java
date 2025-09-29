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

package StudyOpedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringWithkDistinct {
    public static void main(String args[]){
        String s="abccab";
        int i=0,k=4,j,maxlen=0,n=s.length();
        ArrayList<Character> chr=new ArrayList<>();
        for(j=0;j<n;j++){
            char ch=s.charAt(j);
            if(!chr.contains(ch) && chr.size()<k){
                chr.add(ch);
            }
            else if(chr.size()==k){
                break;
            }
        }
        maxlen = Math.max(maxlen, j - i);
        System.out.print(Arrays.toString(chr.toArray())+j);
        while(j<n){
            char ch=s.charAt(j);
            if(chr.size()<=k){
                maxlen = Math.max(maxlen, j - i + 1);
            }
            if(!chr.contains(ch) && chr.size()==k){
                chr.remove((Character) s.charAt(i));
                i++;
                chr.add(s.charAt(i));
            }

            j++;
        }
        System.out.println(maxlen);
    }
}

