package sample.java;
class ReverseNumber{
		public static void main(String[] args) {
		int rev=0;
		for(int num=12345;num!=0;num=num/10) {
			
			int digit=num%10;
			rev=rev*10+digit;
			
		}
		System.out.println(rev);
		}
}
		


