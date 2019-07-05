import java.util.*;
import java.io.*;
import java.lang.*;

public class rat_maze{
	public static int arr2[][];

	public static boolean path_finder(int arr[][],int i,int j,int dest)
	{
		boolean ans1=false,ans2=false;
		if(i==dest && j==dest){
			if(arr[i][j]==0)
			{
				return(false);
			}
			arr2[i][j]=1;
			return(true);
		}
		else{

			if(arr[i][j]==0)
			{
				return(false);
			}
			else
			{
				if(j<dest){
					ans1=path_finder(arr,i,j+1,dest);
				}
				if(i<dest){
					ans2=path_finder(arr,i+1,j,dest);
				}
			}
		}

		if(ans1 || ans2)
		{
			arr2[i][j]=1;
			return(true);
		}

		return(false);
	}

	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		arr2=new int[n+1][n+1];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
				arr2[i][j]=0;
			}	
		}

		if(path_finder(arr,0,0,n-1))
		{
			System.out.println("YES");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(arr2[i][j]+" ");
				}	
				System.out.println();
			}
		}
		else
		{
			System.out.println("NO");
		}



	}
}