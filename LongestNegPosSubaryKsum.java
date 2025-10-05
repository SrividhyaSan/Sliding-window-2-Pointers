 TO FIND LONGEST OR COUNT SUBARRAY THAT CONTAINS ONLY +VE AND 0 , USE SLIDING WINDOW
TO FIND LONGEST OR COUNT SUBARRAY THAT CONTAINS -VE, +VE AND 0 , USE PREFIXSUM MAP
import java.util.HashMap;
import java.util.Map;

public class LongestNegPosSubaryKsum {
    public static void main(String args[]){
       int a[]={1,2,3,-2,5,-1,0,-1};
       int i,maxlen=0,sum=0,k=3;
       Map<Integer,Integer> prefixsumMap=new HashMap<>();
       for(i=0;i<a.length;i++){
           sum+=a[i];
           if(sum==k){
               maxlen=i+1;
           }
           int prefixsum=sum-k;
           if (prefixsumMap.containsKey(prefixsum)){
               maxlen = Math.max(maxlen, i - prefixsumMap.get(prefixsum));
           }
          if(!prefixsumMap.containsKey(sum)) // used to handle this case {2,0,0,3,0}
           prefixsumMap.put(sum,i);
       }
       System.out.println("maxlen "+maxlen);
    }
}



