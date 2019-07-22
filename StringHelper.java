package com.mphasis.training.assignment;

public class StringHelper {
	public String truncateInFirst2Positions(String str) {
		if(str.length()<=2) {
			return str.replaceAll("A","");
		}
			String first2chars=str.substring(0, 2);
			String remainingString=str.substring(2);
			return first2chars.replaceAll("A","")+
			remainingString;	
	}	
	public boolean areFirst2charsAndLast2charsSame(String str) {
		if(str.length()<=1)
			return false;
		if(str.length()==2)
			return true;
		String first2Chars=str.substring(0, 2);
		String last2Chars=str.substring(str.length()-2);
		return first2Chars.equals(last2Chars);
	}
}
