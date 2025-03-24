package javapractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("C:\\Users\\admin\\OneDrive\\Documents\\interviewslist.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write ("Innominds interview on 17-03-2025");
	bw.write("Face to face");
	System.out.println("Finished!!!!");
	bw.close();
	}

}
