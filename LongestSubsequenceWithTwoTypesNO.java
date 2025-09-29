// when condtn fails update i  value and condtn become true
public class LongestSubsequenceWithTwoTypesNO {
    public static void main(String args[]){

        int a[]={3,3,2,3,1,1,1,1};// TC o(N) SC o(1)
        int i=0,j=0,maxlen=0,type1=a[i],type2 = 0;
        while(j<a.length){
            if(a[j]!=type1){
                type2=a[j];
                break;
            }
            j++;
        }
        System.out.println(j);
        while(j<a.length){
            if(a[j]!=type1 && a[j]!=type2){
                type1=a[j-1];
                type2=a[j];
                i=j-1;
            }
            else if (a[j]==type1 || a[j]==type2){
                maxlen=Math.max(maxlen,j-i+1);
            }
            j++;
        }
        System.out.println("maxlen "+maxlen);
        /* //USING ArrayLIST
        ArrayList<Integer>num=new ArrayList<>();
        while(j<a.length){
            if(num.size()==2 && !num.contains(a[j])){
                num.set(0,a[j-1]);
                num.set(1,a[j]);
                i=j-1;
            }
            if(num.size()<2 && !num.contains(a[j])){
                num.add(a[j]);
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        */
    }
}
