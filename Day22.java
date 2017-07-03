import java.util.*;
import java.io.*;

public class Day22 
{
	
	public static int getHeight(Node root)
	{
	      if(root == null)
	      {
	    	  return 0;
	      }
	      else
	      {
	    	  int heightLeft = getHeight(root.left);
	    	  int heightRight = getHeight(root.right);
	    	  if(root.left != null)
	    	  {
	    		  heightLeft =  heightLeft +1;
	    	  }
	    	  if(root.right != null)
	    	  {
	    		  heightRight =  heightRight +1;
	    	  }
	    	  
	    	  if(heightLeft > heightRight)
	    	  {
	    		  return heightLeft;
	    	  }
	    	  else
	    	  {
	    		  return heightRight;
	    	  }
	      }
	}
	
	public static Node insert(Node root,int data){
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
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}