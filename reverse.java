package stringreverse;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		//int b=a.length();
		StringBuffer n=new StringBuffer(a);
		StringBuffer k=new StringBuffer();
		char c []=a.toCharArray();
		char v[]={'a','e','i','o','u'};
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<v.length;j++)
			{
			if(c[i]==v[j])
			{//System.out.println("h");
				k=n.deleteCharAt(i);
			}
			}
		}
		System.out.println(k.reverse());
		
	}

}
