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
