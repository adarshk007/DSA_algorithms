import java.io.*;
import java.lang.*;
import java.util.*;

class graph_coloring{
	public static int color[];
	public static int m; 

	public static void graphcolor(int k,int arr[][] ,int n)
	{
		for(int i=1;i<=m;i++)
		{

			if(isSafe(k,i,arr,n))
			{
				System.out.println(k+" "+i);
				color[k]=i;
				if(k+1<n)
				{
					graphcolor(k+1,arr,n);
				}

			}
		}

	}
	public static boolean isSafe(int k, int c,int arr[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[k][i]==1 && c==color[i])
			{
				return(false);
			}
		}
		return(true);
	}



	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		m=sc.nextInt();

		int arr[][]=new int[n][n];
		color=new int[n];
		
		// for(int i=0;i<n;i++)
		// {
			for(int j=0;j<e;j++)
			{
				int p=sc.nextInt();
				int q=sc.nextInt();
				arr[p][q]=1;
				arr[q][q]=1;
				arr[p][p]=1;
			}	
		// }

		graphcolor(0,arr,n);
		
		for(int j=0;j<n;j++){
				System.out.print(color[j]+" ");
			}
			System.out.println();	
			
		}	
}