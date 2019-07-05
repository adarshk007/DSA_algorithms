import java.util.*;
import java.lang.*;
import java.io.*;


class Fractional_KnapSack{
	static class tt{int weight, value; public tt(int a, int b){weight=a;value=b;}}
 	

 	class cmp implements Comparator<tt> 
    { 
	    public int compare(tt a, tt b) 
	    {
	    	return(a.weight-b.value);
	    } 
    } 







	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer a = Integer.parseInt(br.readLine());
		Integer W = Integer.parseInt(br.readLine());
		Integer p[][] = new Integer[a][2];

		for (int i=0;i<a;i++)
		{
			String[] splitLine = br.readLine().split(" ");
			p[i][0]=Integer.parseInt(splitLine[0]);
			p[i][1]=Integer.parseInt(splitLine[1]);
		}

		Arrays.sort(p, new Comparator<Integer[]>(){

    	public int compare(Integer[] o1, Integer[] o2) {
    			    Double cost1=(double)o1[0]/o1[1];
    				Double cost2=(double)o2[0]/o2[1];
    				return(cost1.compareTo(cost2));
    			}});

		double cost=0;
		for (int i=0;i<a;i++)
		{
			if(W==0)
			{
				break;
			}

			if(W-p[i][0]<0)
			{
				double left;
				left= ((double)(W)*(p[i][1]))/p[i][0];
				cost+=left;
				W=0;
			}
			else
			{
				cost+=(double)p[i][1];
				W=W-p[i][0];
			}
			
		}
		System.out.println(cost);

	}


// My extra functions

/*

	StringTokenizer tk = new StringTokenizer(input.readLine());
	int a = Integer.parseInt(tk.nextToken());
	int b = Integer.parseInt(tk.nextToken());
	int c = Integer.parseInt(tk.nextToken());

	//Arrays.sort(fruits, Collections.reverseOrder());
*/


	 	private int gcd(int a, int b) {
            while (b > 0) {
                int t = a % b;
                a = b;
                b = t;
            }
            return a;
        }


}






