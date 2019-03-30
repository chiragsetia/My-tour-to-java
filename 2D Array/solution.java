
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
