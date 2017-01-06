

import java.io.*;
import java.util.*;

public class subset {

	public static void main(String[] args) {

		Scanner x=new Scanner(System.in);
    	System.out.println("enter the total elements array1");
    	int n1=x.nextInt();
    	int i=0,j=0,cnt=0;
      int a[]=new int [n1];
      System.out.println("enter the elements");
      for(i=0;i<n1;i++)
      {
    	  a[i]=x.nextInt();
      }
      System.out.println("enter the total elements for array2");
  	int n2=x.nextInt();
      int b[]=new int [n2];
      System.out.println("enter the elements");
      for(i=0;i<n2;i++)
      {
    	  b[i]=x.nextInt();
      }
      for(i=0;i<n1;i++)
      {
    	  for(j=0;j<n2;j++)
    	  {
    		  if(a[i]==b[j])
    		  {
    			  cnt++;
    			  break;
    		  }
    		  
    	  }
      if(cnt==n2)
      {
    	  System.out.println("a1 subset of a2");
    	  break;
      }
      
	}
  if(cnt!=n2)
    	  System.out.println("invalid");
}
}