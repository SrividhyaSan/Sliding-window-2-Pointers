package StudyOpedia;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class LongestSunaryNoDuplicate {
    public static void main(String [] args){
        String a="akaabby";
        int maxlen=0,i=0,j=0,m=0,p=0;
        //Using array stored with index of element
        int hash[]=new int[26];
        while(j<a.length()){
            char ch=a.charAt(j);
            if(hash[ch-'a']>0){
                if(hash[ch-'a']-1>=i){
                    i=hash[ch-'a'];
                }
            }
            hash[ch-'a']=j+1;
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
       /* // using int array
        int [] seen=new int[26];//   int [] seen=new int[256];
        while(j<a.length()){
            char ch=a.charAt(j);
            seen[ch-97]++; // seen[ch]++; remove -97 from all
            while(seen[ch-97]>1){
                seen[a.charAt(i)-97]--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        */
//       Using set 
//        Set<Character> res=new LinkedHashSet<>();
//        while(j<a.length()){
//            char ch=a.charAt(j);
//            if(res.contains(ch)){
//                res.remove(a.charAt(i));
//                i++;
//            }
//            if(!res.contains(ch)){
//                res.add(ch);
//                if(res.size()>maxlen){
//                    maxlen=res.size();
//                    m=i;p=j;
//                }
//                j++;
//            }
//            System.out.println(res);
//        }
        System.out.println("maxlen "+maxlen+" start index "+m+" end index "+p);
    }
}
