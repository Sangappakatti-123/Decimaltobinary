package com.jspider.p11;

public class Mainclass4 {
   public static void main(String[] args) {
	 int x=128;
	 System.out.println(convert(x));
	 
}
   public static int convert(int n) {
	   int res=0;
	   int i=1;
	   while(n>0) {
		   int rem=n%2;
		   res=rem*i+res;
		   i=i*10;
		   n=n/2;
		   
	   }
	   return res;
   }


}


