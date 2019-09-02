class disjointSet{
    int parent[];
    disjointSet(int n){
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=-1;
        }
    }
    int parent(int a){
        if(parent[a]==-1){
            return a;
        }
        return parent(parent[a]);
    }
    void union(int a,int b){
        int x=parent(a);
        int y=parent(b);
        parent[x]=parent(y);
    }
    boolean checkCycle(int a,int b){
        if(parent(a)==parent(b)){
            return true;
        }
        union(a,b);
        return false;
    }
}
