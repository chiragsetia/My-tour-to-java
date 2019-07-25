class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        Stack<Integer> s=new Stack<>();
        System.out.print(src+" ");
        vis[src]=true;
        for(Integer i:list.get(src)){
            if(!vis[i]){
                dfs(i,list,vis);
            }
        }
    }
}
