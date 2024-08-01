package basics;

import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int res=1,i;
		i=n;
		while(i!=0)
		{
			res = res*i;
			i--;
					
		}
		System.out.println(res);

	}

}
