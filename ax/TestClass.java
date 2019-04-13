import java.util.*;
public class TestClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		String s=sc.next();
		//System.out.println(s);
		String arrS[]=new String[c];
		for (int i=0;i<c;i++) {
			String temp=sc.nextLine();
			if(i==0){
			    arrS[i]=s+temp;
			}else
			    arrS[i]=temp;
		}
		for(int i=0;i<c;i++){
			String temp=arrS[i];
			// String temp=sc.next();
			// temp+=" "+sc.next();
			//System.out.println(temp);
			char []tempAry=temp.toCharArray();
			int j=0;
			String CardNo="";
			while(tempAry[j]!=','){
				CardNo+=tempAry[j];
				j++;
			}
			j++;
			if(tempAry[tempAry.length-1]=='1'){
				System.out.println(CardNo+","+"N/A");
				continue;
			}
			//System.out.println("1");
			String a=CardNo.substring(0,5);	
			String fiveDigits=Integer.toString(99999-Integer.parseInt(a));
			for(int k=fiveDigits.length();k<5;k++){
			    fiveDigits='0'+fiveDigits;
			}
			char v2=fiveDigits.charAt(4), v4=fiveDigits.charAt(3),v6=fiveDigits.charAt(2),v8=fiveDigits.charAt(1), v10=fiveDigits.charAt(0);
			String name="";
			while(tempAry[j]!=' '&&tempAry[j]!=','){
				name+=tempAry[j];
				j++;
			}
			if(tempAry[j]!=',')
				j++;
			char v3=(name.length()==0)?'Z':(char)('Z'-(name.charAt(0)-'A'));
			//System.out.println("2");
			name="";
			while(tempAry[j]!=','){
				name+=tempAry[j];
				j++;
			}
			j++;
			// if(i==0)
			// System.out.println(name);
			char v5=(name.length()==0)?'Z':(char)('Z'-(name.charAt(0)-'A'));
			//System.out.println("3");
			int sum=0; //amount
			String ans="";
			while(tempAry[j]!=','){
				ans+=tempAry[j];
				if(tempAry[j]!='.')
					sum+=(int)(tempAry[j]-'0');
				j++;
			}
			j++;
			//System.out.println("4");
			char v1='F';
			double sumMoney=Double.parseDouble(ans);
			if(sumMoney<25000.0D){
				System.out.println(CardNo+","+"N/A");
				continue;
			}else if(sumMoney>=25000.0D&&sumMoney<50000.0D){
				v1='S';
			}else if(sumMoney>=50000.0D&&sumMoney<100000.0D){
				v1='H';
			}else{
				v1='F';
			}

			//System.out.println(sum);
			while(sum>=10){
				int t=sum%10;
				sum=sum/10;
				sum=sum+t;
			}
			//System.out.println(sum);
			char v7=(char)(sum+'0');

			sum=0;
			ans="";
			while(tempAry[j]!='-'){
				sum+=(int)(tempAry[j]-'0');
				ans+=tempAry[j];
				j++;
			}
			j++;
			//System.out.println("5");
			int year=Integer.parseInt(ans);
			if(year<2019){
				while(tempAry[j]!=','){
					//System.out.println("this");
					if(tempAry[j]!='-')
						sum+=(int)(tempAry[j]-'0');
					j++;
				}
				j++;
			//	System.out.println("6");
			}else{
				ans="";
					while(tempAry[j]!='-'){
						sum+=(int)(tempAry[j]-'0');
						ans+=tempAry[j];
						j++;
					}
				j++;
			//	System.out.println("7");
				int month=Integer.parseInt(ans);
				if(month>=2){
					System.out.println(CardNo+","+"N/A");
					continue;
				}
				ans="";
					while(tempAry[j]!=','){
						sum+=(int)(tempAry[j]-'0');
						ans+=tempAry[j];
						j++;
					}
				j++;
			//	System.out.println("8");
				int day=Integer.parseInt(ans);
				if(day>12){
					System.out.println(CardNo+",N/A");
					continue;
				}
			}
			//System.out.println("9");
			//System.out.println(sum);
			while(sum>=10){
				int t=sum%10;
				sum=sum/10;
				sum=sum+t;
			}
			//System.out.println("10");
			//System.out.println(sum);
			char v9=(char)(sum+'0');
			String result=""+v1+v2+v3+v4+v5+v6+v7+v8+v9+v10;
			System.out.println(CardNo+","+result);
		} 
	}
}

