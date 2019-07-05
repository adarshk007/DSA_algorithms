
import java.util.*;
import java.io.*;
import java.lang.*;

class bfs{

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=sc.nextInt();
		int test=e;

		// Queue<Integer> q=new LinkedList<>();
		Stack<Integer> q=new Stack<>();

		HashMap<Integer,ArrayList<Integer>> graph=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			graph.put(i,new ArrayList<Integer>());
		}


		while(test-->0)
		{
			int oo=sc.nextInt();
			int pp=sc.nextInt();

			graph.get(pp).add(oo);
			graph.get(oo).add(pp);
		}

		int visit[]=new int[n];
		visit[0]=1;
		// q.add(0);
		q.push(0);


		while(!q.isEmpty())
		// while(q.size()!=0)
		{
			int val=q.peek();
			// q.remove();
			q.pop();
			System.out.println(val);
			for(Integer i : graph.get(val))
			{
				if(visit[i]!=1)
				{
					// q.add(i);
					q.push(i);
					visit[i]=1;
				}
			}
		}

	}
	
}