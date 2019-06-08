/*Run-length encoding is a fast and simple method of encoding strings. 
The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".*/


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();
        String s=sc.next();
        if(s==""){
            return;
            //System.out.println("yes");
        }
        int arr[]=new int[2];
        if(o==1){
            encoding(s);
        }else if(o==2){
//               arr[s.length()]=1;
            decoding(s);
        }
 }
        private static void encoding(String s){
        String output="";
        char t=s.charAt(0);
        int c=1;
        for (int i=1;i<s.length();i++ ) {
            if(t==s.charAt(i)){
                c++;
            }else{
                output+=Integer.toString(c)+t;
                c=1;
                t=s.charAt(i);
            }
        }
        output+=Integer.toString(c)+t;
        System.out.println(output);
    }
     private static void decoding(String s){
        String output="";
        for(int i=0;i<s.length();){
            int sum=0;
            int c=s.charAt(i)-'0';
            while(0<=c && c<10){
                sum=sum*10+c;
                i++;
                c=s.charAt(i)-'0';
            }
            //char t=s.charAt(i+1);
            for (int j=0;j<sum;j++) {
                output+=s.charAt(i);
            }
            i++;
        }
        System.out.println(output);
     }

}
