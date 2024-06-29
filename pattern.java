package com.jspider.TronSoftech;
/*3
6 9
12 15 18*/

public class pattern {
	public static void main(String[] args) {
		int x=3,n=3;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(x+" ");
				x=x+3;
			}
			System.out.println();
		}
		
	}

}
