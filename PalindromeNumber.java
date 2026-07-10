package sample.java;

public class PalindromeNumber {
	public static void main(String[] args) {
    int num=121;
    int original=num;
    int pal=0;

    for(;num!=0;num=num/10) {
    	 int digit=num%10;
    	 pal=pal*10+digit;
   
}
    if(original==pal) {
    	System.out.println(original+" is a palindrome");
    }
    else {
    	System.out.println(original+" is not a palindrome");
    }
}
}
