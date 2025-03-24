package javapractice;

public class methods {
   static int  mobilephone =500;
	public static void greetings() {
		//int currentBalance =50;
		System.out.println("welcome to mobile shop");
		//public staticdeposit()
		}
	public void buyPhone(int amount) {
		mobilephone=mobilephone-amount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetings();
		methods N=new methods();
		N.buyPhone(50);
   System.out.println("welcome " );
   System.out.println(N + " new phone");
	}

}
