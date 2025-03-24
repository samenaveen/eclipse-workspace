package javapractice;

import java.util.Scanner;

public class Switchcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter an type of day");
int day = sc.nextInt();
sc.close();
String dayName;

switch (day) {
case 1:
	
 dayName = "Monday";
break;
case 2:
	
	 dayName = "Tuesday";
break;
case 3:
	
	 dayName = "wednesday";
	break;
	case 4:
		
		 dayName = "Thursday";
	break;
	case 5:
		
		 dayName = "friday";
		break;
		case 6:
			
			 dayName = "saturday";
		break;
		case 7:
			
			 dayName = "sunday";
		break;
		default:
	dayName="innvalid input enter number between 1 and 7";
}
System.out.println(dayName);
	}}
	
	
	
	
	
	
	
	
	
	
