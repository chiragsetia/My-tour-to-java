public class Solution {
    long max=1000000007L;
    public int solve(ArrayList<Integer> A) {
        long sum=0L;
        int n=A.size();
        long ans=sq(n-1);
        for(int i=0;i<A.size();i++){
            long temp=((long)(A.get(i)*A.get(i)))%max;
            sum+=(temp*ans)%max;
            sum=sum%max;
        }
        return (int)sum;
    }
    long sq(int n){
        long mul=2L;
        long ans=1L;
        long b=(long)n;
        while(b!=0L){
            if(b%2L==1L){
                ans=(ans*mul)%max;
            }
            b=b>>1L;
            mul=(mul*mul)%max;
        }
        return ans%max;
    }
}
