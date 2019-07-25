//bsf of a graph
class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while(q.isEmpty()==false){
            int t=q.remove();
            for(Integer i:list.get(t)){
                if(!vis[i]){
                    vis[i]=true;
                    q.add(i);
                }
            }
            System.out.print(t+" ");
        }
    }
}
