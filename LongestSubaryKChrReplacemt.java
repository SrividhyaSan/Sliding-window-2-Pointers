Given an integer k and a string s, any character in the string can be selected and changed to any other uppercase English character. This operation can be performed up to k times. After completing these steps, return the length of the longest substring that contains the same letter.


Examples:
Input : s = "BAABAABBBAAA" , k = 2

Output : 6

Explanation : we can change the B present at index 0 , 3 (0 base indexing) to A.

The new string is "AAAAAABBBAAA".

The substring "AAAAAA" is the longest substring having same letter with length 6.

Input : s = "AABABBA" , k = 1

Output : 4

Explanation : The underlined characters are changed in the new string obtained.

The new string is "AABBBBA". The substring "BBBB" is the answer.

There are other ways to achieve this answer.

Input : s = "ABCDEF" k = 1


import java.util.ArrayList;
import java.util.Collections;

public class LongestSubaryKChrReplacemt {
    public static void main(String[] args){
        String s="ABCDEF";
        int i=0,j=0,maxfreq=0,maxlen=0,k=1,n=s.length();
        ArrayList<Integer> freq=new ArrayList<>(Collections.nCopies(26,0));
        while(j<n){
            char ch=s.charAt(j);
            freq.set(ch-'A',freq.get(ch-'A')+1);
            maxfreq=Math.max(maxfreq,freq.get(ch-'A'));
            int changes=j-i+1- maxfreq;
            if(changes<=k){
                maxlen=Math.max(maxlen,j-i+1);
            }
            if(changes>k){
                freq.set(s.charAt(i)-'A',freq.get(s.charAt(i)-'A')-1);
                i++;
            }
//            System.out.println("maxfreq= "+maxfreq+" maxlen="+maxlen+" changes="+changes);
            j++;
        }
        System.out.println("maxlen "+maxlen+" "+freq);
    }
}

