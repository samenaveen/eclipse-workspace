package javapractice;

import java.util.HashMap;

public class CountDuplicatesWordsin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="java is a programing language and java is powerful";
//findDuplicateWords(input);
//	}
//
//	public static void findDuplicateWords(String str) {
//		String[]words=str.toLowerCase().split("\\s+");
//		HashMap<String,Integer>wordCountMap=new HashMap<>();
//		for(String word:words) {
//			if(wordCountMap.containsKey(word)) {
//				wordCountMap.put(word, wordCountMap.get(word)+1);
//			}
//			else {
//				wordCountMap.put(word, 1);
//			}
//		}
//		System.out.println("Duplicate words:");
//		for(HashMap.Entry<String,Integer>entry:wordCountMap.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey()+"->" +entry.getValue());
//			}}
//				
String[] words = input.toLowerCase().split("\\s+");


    
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            int wordCount = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wordCount++;
                }
            }
            if (wordCount > 0) {
                count++;
                System.out.println(words[i] + "->" + (wordCount + 1));
            }
        }
        System.out.println("Duplicate words: " + count);
    }
}

	

















			
	


