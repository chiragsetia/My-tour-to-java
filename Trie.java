class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	
	public void autoComplete(ArrayList<String> input, String word) {
		// Complete this function
		// Print the output as specified in question
       //result=new ArryList<String>();
      for(int i=0;i<input.size();i++)
      {
        add(input.get(i)); 
      }
      remain(root,word,"");
    }
  private void remain(TrieNode root, String word,String print)
  {
    if(word.length()==0)
    {
      
      remain(root,print);
    }
    int ci=word.charAt(0)-'a';
    TrieNode child = root.children[ci];
		if(child == null){
          return;
        }
    remain(child,word.substring(0),print+word.charAt(0));
    
    
  }
  private void remain(TrieNode root, String word)
  {
    if(root.childCount==0)
      return;
    
    if(root.isTerminating)
    {
      System.out.println(word);
    }
    word=word+root.data;
    //int child[]=new child[childcount];
    for(int i=0;i<26;i++)
    {
     	TrieNode child = root.children[i];
      if(child!=null)
        remain(child,word);
    }
    
  }
}