class GfG
{
    void countDistinct(int A[], int k, int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(;i<k;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        int j=0;
        for(;i<n;i++){
            System.out.print(map.size()+" ");
            map.put(A[j],map.get(A[j])-1);
            if(map.get(A[j])==0){
                map.remove(A[j]);
            }
            j++;
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
        }
        System.out.print(map.size());
    }
}
