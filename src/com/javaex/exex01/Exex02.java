package com.javaex.exex01;

public class Exex02 {
    
    public static String concatString(String[] array){
       
        //메소드 내용작성
        
    	String result = "";
    	
    	for(int i=0; i<array.length; i++) {
    		result = result + array[i];
    	}
    	
    	return result;
    	
    }

}

