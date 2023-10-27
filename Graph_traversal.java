import java.util.*;
public class er {
static class Edge
{
int src;
int dest;
int wt;

public Edge(int s,int d,int w)
{
this.src=s;
this.dest=d;
this.wt=w;
}

}

public static void main(String[]args) throws Exception
{
    int k=0;
    int c=0;
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    ArrayList<Edge> graph[]=new ArrayList[m];
    int a,b,ji=0;
    for(int i=0;i<graph.length;i++)
    {
        graph[i]=new ArrayList<Edge>();
    }
    while(ji<n)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        graph[a].add(new Edge(a,b,c));
        ji++;
    }
    for(int j=0;j<graph.length;j++)
    {
    for(int i=0;i<graph[j].size();i++)
    {
      Edge e=graph[j].get(i);
      c++;
    }
    if(c>1)
    {
        k++;
    }
    c=0;
    }
    System.out.println(k);
}
}
