public class OthelloBoard {

	private int BoardArray[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;

	public OthelloBoard() {
		BoardArray = new int[8][8];
		BoardArray[3][3] = player2Symbol;
		BoardArray[3][4] = player1Symbol;
		BoardArray[4][3] = player1Symbol;
		BoardArray[4][4] = player2Symbol;
	}

	public void print() {
		System.out.print("_ ");
		for(int i = 0; i < 8; i++)
		{
			System.out.print(i+" ");

		}
		System.out.println();
		for(int i = 0; i < 8; i++) {
			System.out.print(i+" ");
			for(int j = 0; j < 8; j++) {
				System.out.print(BoardArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean move(int Symbol, int x, int y){

		if(x<0||x>8||y<0||y>8||BoardArray[x][y]!=0)
          return false;
      /*if(Symbol==player1Symbol&&(x+y)%2==0)
        return false;
      else if(Symbol==player2Symbol&&(x+y)%2!=0)
			return false;*/
      boolean c=false;
      boolean check=false;
      boolean check2=false;
      int i=x-1;
	int lastIndexX=i;
	//top1
	while(i>=0 && BoardArray[i][y]!=0)
	{
		
		if(BoardArray[i][y]==Symbol&&c==true)
			{
          		check=true;
          		lastIndexX=i;
            }
      if(BoardArray[i][y]!=Symbol)
      {
        c=true;
        check2=true;
      }
		i--;
	}
	i=x-1;
	for(int k=i;k>lastIndexX;k--)
	{
		//System.out.println("2");
		BoardArray[k][y]=Symbol;
	}
	//---------------
	i=x-1;
	int j=y+1;
	lastIndexX=i;
	int lastIndexY=j;
      c=false;
	//topright2
	while(i>=0&&j<8&&BoardArray[i][j]!=0)
	{
		if(BoardArray[i][j]==Symbol&&c==true)
		{check=true;
			lastIndexX=i;
			lastIndexY=j;
		}
            
      if(BoardArray[i][j]!=Symbol)
      {
        c=true;
        check2=true;
      }
		i--;
		j++;
	}
	i=x-1;
	j=y+1;
	for(int k=i;k>lastIndexX;k--)
	{
		for(int l=j;j<lastIndexY;j++)
			BoardArray[k][l]=Symbol;
	}
	
	
	//---------------
	
	j=y+1;
	lastIndexY=j;
	//right3
      c=false;
	while(j<8&&BoardArray[x][j]!=0)
	{
		if(BoardArray[x][j]==Symbol&&c==true)
        {check=true;
          lastIndexY=j;}
            
      if(BoardArray[x][j]!=Symbol)
      {c=true;
        check2=true;
      }
		j++;
      
	}
	j=y+1;
	for(int k=j;k<lastIndexY;k++)
	{
		BoardArray[x][k]=Symbol;
	}
	
	//.........
	i=x+1;
	j=y+1;
	lastIndexX=i;
	lastIndexY=j;
	//downright4
      c=false;
	while(i<8&&j<8&&BoardArray[i][j]!=0)
	{
		if(BoardArray[i][j]==Symbol&&c==true)
		{
          check=true;
			lastIndexX=i;
			lastIndexY=j;
		}
            
      if(BoardArray[i][j]!=Symbol)
      {c=true;
        check2=true;
      }
		i++;
		j++;
	}
	i=x+1;
	j=y+1;
	for(int k=i;k<lastIndexX;k++)
	{
		for(int l=j;j<lastIndexY;j++)
			BoardArray[k][l]=Symbol;
	}
	
	//.............
	i=x+1;
	lastIndexX=i;
	c=false;
	//down5
	while(i<8&&BoardArray[i][y]!=0)
	{
		if(BoardArray[i][y]==Symbol&&c==true)
        {
          check=true;
          lastIndexX=i;
        }
            
      if(BoardArray[i][y]!=Symbol)
      {c=true;
        check2=true;
      }
		i++;
	}
	i=x+1;
	for(int k=i;k<lastIndexX;k++)
	{
		BoardArray[k][y]=Symbol;
	}
	
	//............
	
	
	//downleft6
	i=x+1;
	j=y-1;
	lastIndexX=i;
	lastIndexY=j;
      c=false;
	while(i<8&&j>=0&&BoardArray[i][j]!=0)
	{
		if(BoardArray[i][j]==Symbol&&c==true)
        {
          check=true;
			lastIndexX=i;
			lastIndexY=j;
		}
            
      if(BoardArray[i][j]!=Symbol)
      {
        c=true;
        check2=true;
      }
		i++;
		j--;
	}
	i=x+1;
	j=y-1;
	for(int k=i;k<lastIndexX;k++)
	{
		for(int l=j;j>lastIndexY;j--)
			BoardArray[k][l]=Symbol;
	}
	
	
	//..........................
	
	//left7
	j=y-1;
      c=false;
	lastIndexY=j;
	while(j>=0&&BoardArray[x][j]!=0)
	{
		if(BoardArray[x][j]==Symbol&&c==true)
        {
          check=true;
          lastIndexY=j;
        }
            
      if(BoardArray[x][j]!=Symbol)
      {
        c=true;
        check2=true;
      }
		j--;
	}
	j=y-1;
	for(int k=j;k>lastIndexY;k--)
	{
		BoardArray[x][k]=Symbol;
	}
	
	//..............................
	
	
	//topleft8
	i=x-1;
	j=y-1;
	lastIndexX=i;
	lastIndexY=j;
	c=false;
	while(i>=0&&j>=0&&BoardArray[i][j]!=0)
	{
		if(BoardArray[i][j]==Symbol&&c==true)
		{
          	check=true;
			lastIndexX=i;
			lastIndexY=j;
		}
            
      if(BoardArray[i][j]!=Symbol)
      {
        c=true;
        check2=true;
      }
		i--;
		j--;
	}
	i=x-1;
	j=y-1;
	for(int k=i;k>lastIndexX;k--)
	{
		for(int l=j;j>lastIndexY;j--)
			BoardArray[k][l]=Symbol;
	}
      if(check&&check2)
        BoardArray[x][y]=Symbol;
		return check&&check2;
	}

}

