package com.stringTockenizer;

import java.util.StringTokenizer;

public class Tockenizer {

	public static void main(String[] args) {
		String str="This is java String Program";
		String res="";
		
		StringTokenizer tock=new StringTokenizer(str," ");
		while(tock.hasMoreElements())
		{
			res=tock.nextToken()+"\n"+res ;
		}
		System.out.println(res);
		
	}

}
