package javapractice;

public class ReverseNaee {
	public static void main(String[] args) {
		
	
  String name = "gagaga";
   String reverseName=" ";
   for(int i=name.length()-1;i>=0;i--) {
	  reverseName=reverseName+name.charAt(i);
  }
	System.out.println("Reverse name is: "+reverseName);
	if(name.equals(reverseName)) {
		System.out.println("Name is palindrome");
	}
	else {
		System.out.println("Name is not palindrome");
	}
	
	}
}
