
public class maze {
	public static int countPaths(int temp[][],int i,int j)
	{
        int c=0;
        if(temp[i][j]==-1)
            return 0;
        if(temp[i][j]==0&&i==temp.length-1 &&temp[i].length-1==j){
            return 1;
        }
        if(i<temp.length-1)
            c+=countPaths(temp,i+1,j);
        if(j<temp[i].length-1){
            c+=countPaths(temp,i,j+1);
        }
        return c;
	}
}


//print digonal
public class solution {
	
	public static void PrintDiagonals(int[][] mat, int row, int col) {
        int i=0,j=0;
        int t=row*col;
        while(t!=0){
            int tempI=i;
            int tempJ=j;
            while(i>=0&&j<col){
                t--;
                System.out.print(mat[i][j]+" ");
                i=i-1;
                j=j+1;
            }
            System.out.println();
            if(tempI==row-1){
                i=tempI;
                j=tempJ+1;
            }else{
                i=tempI+1;
                j=tempJ;
            }
        }
	}
	
}


//print sprial
public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
        spiral(matrix,matrix.length,matrix[0].length);
	}
    static void spiral(int matrix[][],int n,int m){
        if(n<=2||m<=2){
            for(int i=0;i<m;i++){
                System.out.print(matrix[0][i]+" ");
            }
            for(int i=1;i<n;i++){
                System.out.print(matrix[i][m-1]+" ");
            }
            for( int i=m-2;i>=0;i--){
                System.out.print(matrix[n-1][i]+" ");
            }
            for(int i=n-2;i>0;i--){
                System.out.print(matrix[i][0]+" ");
            }
            return;
        }
            for(int i=0;i<m;i++){
                System.out.print(matrix[0][i]+" ");
            }
            for(int i=1;i<n;i++){
                System.out.print(matrix[i][m-1]+" ");
            }
            for( int i=m-2;i>=0;i--){
                System.out.print(matrix[n-1][i]+" ");
            }
            for(int i=n-2;i>0;i--){
                System.out.print(matrix[i][0]+" ");
            }
        int newMatrix[][]=new int[n-2][m-2];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                newMatrix[i-1][j-1]=matrix[i][j];
            }
        }
        spiral(newMatrix,n-2,m-2);
    }
}


//longestPath one test case doesn't run
	
import java.util.*;
import java.lang.Math;
public class LongestLength {
    
    public static int finLongestOverAll(int mat[][], int N){
      ArrayList<me> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                list.add(new me(mat[i][j],i,j));
            }
        }
        Collections.sort(list ,new Comparator<me>(){
            public int compare(me a,me b){
                return a.v-b.v;
            }
        });
        int max=0;
        int c=0;
        me old=list.get(0);
        for(me k:list){
            int diff=Math.abs(old.i-k.i)+Math.abs(old.j-k.j);
            if(old.v+1==k.v&& diff==1){
                c++;
            }else{
                if(c>max){
                    max=c;
                }
                c=0;
            }
            old=k;
        }
        return max;
    }
    
}

class me{
    int v;
    int i;
    int j;
    me(int v,int i,int j){
        this.v=v;
        this.i=i;
        this.j=j;
    }
}


//Find Row K
public class findKRow {
	
	public static int FindSpecialRow(int arr[][], int n){
		//t sumR[]=new int[n];
        int flag=0;
        int i;
        for( i=0;i<n&&flag==0;i++){
            int sumT=0;
            for(int j=0;j<n;j++){
                sumT+=arr[i][j];
            }
            if(sumT==0||sumT==1){
                int sumC=0;
                for(int j=0;j<n;j++){
                    sumC+=arr[j][i];
                }
                if(sumC==n||sumC==n-1){
                    flag=1;
                }
            }
        }
        if(flag==1)
            return i-1;
		return -1;
	}
}

//Consecutive chars
public class consChar {
	
	public static void LongestLetterChain(char[][] mat, char[] letters) {
        int max[]=new int[letters.length];
        for(int i=0;i<max.length;i++){
            max[i]=1;
        }
        
        for(int i=0;i<letters.length;i++){
            int maxL=1;
            for(int j=0;j<mat.length;j++){
                for(int k=0;k<mat[j].length;k++){
                    if(letters[i]==mat[j][k]){
                        maxL=Math.max(maxL,callFunc(mat,j,k));
                    }
                }
            }
            max[i]=maxL;
        }
        for(int i=0;i<max.length;i++){
         System.out.println(max[i]);
        }
    }
    static int callFunc(char [][]mat,int i,int j){
        if(i<0||j<0||i>=mat.length||j>=mat[i].length){
            return 0;
        }
        int max=1;
        if(i>0 && j>0 && mat[i-1][j-1]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i-1,j-1));
        if(i>0 && mat[i-1][j]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i-1,j));
        if(j>0 && mat[i][j-1]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i,j-1));
        if(i>0 && j<mat[i].length-1 && mat[i-1][j+1]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i-1,j+1));
        if(i<mat.length-1 && j>0 && mat[i+1][j-1]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i+1,j-1));
        if(i<mat.length-1 && mat[i+1][j]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i+1,j));
        if( j<mat[i].length-1 && mat[i][j+1]==mat[i][j]+1){
           // System.out.println(i+" "+j);
            max=Math.max(max,1+callFunc(mat,i,j+1));
        }
        if(i<mat.length-1&& j<mat[i].length-1 && mat[i+1][j+1]==mat[i][j]+1)
            max=Math.max(max,1+callFunc(mat,i+1,j+1));  
    
    return max;
    }
}


//commom element in everyrow
import java.util.*;
public class CommonElement {
	
	public static int FindCommonEleInRows(int[][] mat, int Row, int Col){
        if(Row==1){
            return mat[0][Col-1];
        }
		List<Integer> list=new ArrayList<>();
        List<Integer> newList=new ArrayList<>();
        if(found(mat[1],mat[0][0])){
            list.add(mat[0][0]);
        }
        for(int i=1;i<Col;i++){
            if(mat[0][i-1]!=mat[0][i]&&found(mat[1],mat[0][i])){
                list.add(mat[0][i]);
            }
        }
        if(list.size()==0)
            return -1;
       // System.out.println(list);
        for(Integer i:list){
            int flag=0;
            for(int j=2;j<Row;j++){
                if(!found(mat[j],(int)i)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
               newList.add(i); 
            }
        }
        if(newList.size()!=0){
            return newList.get(newList.size()-1);
        }
		return -1;
	}
    public static boolean found(int []arr,int v){
       // System.out.println(v);
        int s=0;
        int e=arr.length-1;
        while(e>=s){
            int mid=s+(e-s)/2;
            if(arr[mid]==v){
                return true;
            }else if(arr[mid]>v){
                e=mid-1;
            }else
                s=mid+1;
        }
        return false;
    }
	
}



/*Return in Row wave form
Level EASY
Given an N*M 2D integer array, write a method that read rows of the matrix alternatively from left to right and right to left and return them as a 1 dimensional array.
That is, read 1st row from left to right, 2nd row from right to left, 3rd row from left to right and so on and save then in 1D array.
*/


import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> readRowsAlternatively(int[][] input, int row, int col) {
        ArrayList<Integer> list=new ArrayList<>();
        int d=0;
        input[row][col]=0;
            for(int i=0;i<row;i++){
            if(d==0){
                for(int j=0;j<col;j++){
                   list.add(input[i][j]); 
                }
            }
            else if(d==1){
                for(int j=col-1;j>=0;j--){
                   list.add(input[i][j]); 
                }
            }
            d=(d+1)%2;
        }
        return list;
	}
}


/*Print Matrix
Level EASY
Write a code which inputs two numbers m and n and creates a matrix of size m x n (m rows and n columns) in which every elements is either X or O. The Xs and Os must be filled alternatively, the matrix should have outermost rectangle of Xs, then a rectangle of Os, then a rectangle of Xs, and so on.
See the sample input.
Input format :
Line 1 : Number of rows M and cols N in the matrix
Line 2 : MXN elements of the matrix separated by space 
Output Format :
 Print the matrix
Constraints :
 1 <= M <= 10^3
 1 <= N <= 10^3
Sample Input :
3 3
Sample Output :
XXX
XOX
XXX*/



public class solution {
	
	public static void PrintPattern(int m, int n) {
        char arr[][]=new char[m][n];
        int update=0;
        int s1=0,s2=0;
        char r='X';
        int a=m,b=n;
        while(update<a*b){
           // System.out.println(update);
            for(int i=s2;i<n;i++){
                update++;
                arr[s1][i]=r;
            }
            for(int j=s1+1;j<m;j++){
                update++;
                arr[j][n-1]=r;
            }
            for(int i=s2;i<n-1;i++){
                update++;
                arr[m-1][i]=r;
            }
            for(int j=s1+1;j<m-1;j++){
                update++;
                arr[j][s2]=r;
            }
            s1++;
            s2++;
            m--;
            n--;
            r=(r=='X')?'O':'X';
            //System.out.println(update);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	}
	
}
