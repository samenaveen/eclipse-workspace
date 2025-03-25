package javapractice;

public class PalindromeNumber {

public static void main (String[]args) {
	int num=123;
	int i=num;
	int rev=0;
while(i!=0){
	int digit=i%10;
	rev=rev*10+digit;
	i/=10;
}
if(num==rev) {
	

System.out.println("Enter number palindrome");
}
else {
	System.out.println("Enter number  is not Palindrome");
}
}}
