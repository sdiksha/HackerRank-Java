import java.io.*;
import java.util.*;

public class Day23 
{

	static void levelOrder(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		
		if(root == null)
		{
			return;
		}
		else
		{
			q.add(root);
			//System.out.println(root.data + " ");
			//System.out.println(root.left.data + " ");
			//System.out.println(root.right.data + " ");
			while(!q.isEmpty())
			{
				Node n = q.remove();
				System.out.print(n.data + " ");
				
				if(n.left!= null && !q.contains(n.left))
				{
					q.add(n.left);
				}
				if(n.right!= null && !q.contains(n.right))
				{
					q.add(n.right);
				}
			}
		}
	      
	}
	
	
	public static Node insert(Node root,int data)
	{
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0)
            {
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
    }
}
