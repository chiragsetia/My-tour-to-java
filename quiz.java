import java.util.*;

class quiz{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i=1;i<101;i++) {
			list.add(i);
		}
		int i=0;
		int j=0;
		while(list.size()>1){
			//System.out.println(list.size());
			if(i%2!=0){
				list.set(j,-1);
			}
			i=(i==0)?1:0;
			j++;
			if(j==list.size()){
				list=updatedOne(list);
				j=0;
			}
		}
		System.out.println(list);
	}
	private static ArrayList<Integer> updatedOne(ArrayList<Integer> list){
		ArrayList<Integer> listR=new ArrayList<>();
		for(Integer i:list){
			if(i!=-1){
				listR.add(i);
			}
		}
		return listR;
	}
}