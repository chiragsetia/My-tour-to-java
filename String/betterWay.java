public class Solution {
    public int[] solve(String A, int[][] B) {
        int freq[][]=new int[A.length()][26];
        for(int i=0;i<A.length();i++){
            freq[i][A.charAt(i)-'a']++;
        }
        for(int i=1;i<A.length();i++){
            for(int j=0;j<26;j++){
                freq[i][j]+=freq[i-1][j];
            }
        }
        int arr[]=new int[B.length];
        for(int i=0;i<B.length;i++){
            int a=B[i][0]-2;
            int b=B[i][1]-1;
            if(b-a==1){
                arr[i]=1;
                continue;
            }
            int c=1;
            if(a==-1){
                int max=freq[b][0];
                for(int j=1;j<26;j++){
                    if(max==freq[b][j]){
                        c++;
                    }else if(max<freq[b][j]){
                        max=freq[b][j];
                        c=1;
                    }
                }
            }else{
                int max=freq[b][0]-freq[a][0];
                for(int j=1;j<26;j++){
                    if(max==freq[b][j]-freq[a][j]){
                        c++;
                    }else if(max<freq[b][j]-freq[a][j]){
                        c=1;
                        max=freq[b][j]-freq[a][j];
                    }
                }
            }
            arr[i]=c;
        }
        return arr;
    }
    
}
