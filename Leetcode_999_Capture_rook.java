
public class Leetcode_999_Capture_rook 
{
	public static void main(String[] args) 
	{
		char a[][]={{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','p','.','p','.'},
				{'.','p','.','.','.','.','.','.'},
				{'.','p','B','.','R','.','B','p'},
				{'.','p','.','.','.','B','.','.'},
				{'.','.','p','.','.','p','.','.'},
				{'.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.'}}
;
		
		System.out.println("No. of rook captures= "+numRookCaptures(a));
	}

	public static int numRookCaptures(char board[][])
	{
		int g=0,h=0,k=0,c=0,m,n;
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]=='R')
				{
					m=i;
					n=j;
					
					for(int l=n-1;l>=0;l--)
					{
						if(board[m][l]=='p' && board[m][l]!='B')
						{
							g=g+1;
							break;
						}
						
						else if(board[m][l]=='B')
						{
							g=0;
							break;
						}
					}
					
					for(int q=n+1;q<board[i].length;q++)
					{
						if(board[m][q]=='p' && board[m][q]!='B')
						{
							h=h+1;
							break;
						}
						
						else if(board[m][q]=='B')
						{
							h=0;
							break;
						}
					}
					
					for(int w=m-1;w>=0;w--)
					{
						if(board[w][n]=='p' && board[w][n]!='B')
						{
							c=c+1;
							break;
						}
						
						else if(board[w][n]=='B')
						{
							c=0;
							break;
						}
					}
					
					for(int z=m+1;z<board.length;z++)
					{
						if(board[z][n]=='p' && board[z][n]!='B')
						{
							k=k+1;	
							break;
						}
						
						else if(board[z][n]=='B')
						{
							k=0;
							break;
						}
					}
				}
				
				
			}
		}	
		
		return g+h+k+c;
	}
	
}
