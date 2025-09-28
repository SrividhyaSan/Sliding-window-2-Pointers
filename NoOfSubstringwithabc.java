package StudyOpedia;

public class NoOfSubstringwithabc {
    public static void main(String[]args){
        String s="abccba";
        StringBuilder chr=new StringBuilder();
        int i=0,j=0,count=0,n=s.length();
        int Lastseen[]={-1,-1,-1};
        for( i=0;i<n;i++){ // tc o(n)
            char ch=s.charAt(i);
            Lastseen[ch-'a']=i;
            if(Lastseen[0]!=-1 && Lastseen[1]!=-1 && Lastseen[2]!=-1 ){
                count+= 1+ Math.min(Math.min(Lastseen[0],Lastseen[1] ),Lastseen[2]);
            }
        }
//        int[] freq = new int[3]; // TC o(2n)
//        for ( j = 0; j < s.length(); j++) {
//            freq[s.charAt(j) - 'a']++;
//            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
//                count += s.length() - j;
//                freq[s.charAt(i) - 'a']--;
//                i++;
//            }
//        }
//        while(j<n || chr.length()>=3){
//            if(j<n) chr.append(s.charAt(j));
//            if(j>=n && !(chr.toString().contains("a") || !chr.toString().contains("b")|| !chr.toString().contains("c"))){
//                break;
//            }
//            // Use a loop instead of nested if to handle multiple valid substrings
//            while (chr.toString().contains("a") && chr.toString().contains("b") && chr.toString().contains("c")) {
//                count++;
//                if (j < n) count += n - j - 1;
//                chr.deleteCharAt(0);
//            }
//            System.out.println(chr+" cnt "+count+" j "+j);
//            j++;
//        }
        System.out.println(count);
    }
}
