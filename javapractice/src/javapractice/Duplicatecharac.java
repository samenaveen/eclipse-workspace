package javapractice;

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="programming";
findDuplicateCharacters(input);
}
public static void findDuplicateCharacters(String str) {
	char[] charArray=str.toCharArray();
	Map<Character,Integer>charCountMap=new HashMap<>();
	for(char ch:charArray) {
		if (charCountMap.containsKey(ch)) {
			charCountMap.put(ch, charCountMap.get(ch)+1);
		}
		else {
			charCountMap.put(ch,1);
		}
	}
	System.out.println("Duplicate characters:");
	for(Map.Entry<Character,Integer>entry:charCountMap.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+ "->" +entry.getValue());
		}
	}
}
}
