import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          		int a=123453;
		int x=0,count=1;
		while(a>0)
		{
		int c=a%10;
		if(count%2==0)
		{
			x=x+(c*c);
			
		}
		a=a/10;
		count++;
	
		}
		System.out.println(x);
		
       
    }


	}
