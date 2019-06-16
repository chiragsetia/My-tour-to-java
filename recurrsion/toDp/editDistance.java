/*
Edit Distance
Level MEDIUM
Given two strings s and t of lengths m and n respectively,
find the Edit Distance between the strings. 
Edit Distance of two strings is minimum number of steps required to make one string equal to other. 
In order to do so you can perform following three operations only :

*/
public class Solution {

	
	public static int editDistance(String s1, String s2){
	int arr[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<s1.length()+1;i++){
            arr[i][0]=i;
        }
        for(int i=1;i<s2.length()+1;i++){
            arr[0][i]=i;
        }
        for(int i=1;i<s1.length()+1;i++){
            for(int j=1;j<s2.length()+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else{
                    arr[i][j]=1+Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
                }
            }
        }
        return arr[s1.length()][s2.length()];
        //         if(s1.length()==0){
//             return s2.length();
//         }
//         if(s2.length()==0){
//             return s1.length();
//         }
//         if(s1==s2){
//             return 0;
//         }
//         if(s1.charAt(0)==s2.charAt(0)){
//             return editDistance(s1.substring(1),s2.substring(1));
//         }
//         int m=editDistance(s1.substring(1),s2);
//         m=Math.min(m,editDistance(s1.substring(1),s2.substring(1)));
//         m=Math.min(m,editDistance(s1,s2.substring(1)));
//         return 1+m;
	}

	
}
