package javapractice;

public class secondLargest {

//	private static int[] array;



	public static int findSecondLargest(int arr[]) {
	if (arr.length <2) {
	
		throw new IllegalArgumentException("Array must have atlease 2 elements");}
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	 for (int num:arr) {
		 if(num >largest) {
			 secondLargest =largest;
			 largest=num;
		 }else if (num>secondLargest && num<largest) {
			 secondLargest=num;
			 }
			 }
	 if (secondLargest==Integer.MIN_VALUE) {
		 throw new IllegalArgumentException("No second largest number exists");
	 }
	
	 return secondLargest;
	 
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[]= {12,4,45,32,11,15};
try {
	int result=findSecondLargest(array);
	System.out.println("the second largest number is :" +result);
}
catch(IllegalArgumentException e) {
	System.out.println(e.getMessage());
}
}
	}


