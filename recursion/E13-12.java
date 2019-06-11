
import java.util.*;
import java.lang.*;
import java.io.*;

class SubstringGenerator
{   
    public static List<String> calc(String s, List<String> arr){
    	System.out.println(arr);
        
        if(s.length() < 1){
        	return arr;
        }
        
        for(int i = 1; i <= s.length(); i++){
        	arr.add(s.substring(0, i));
        }

        return calc(s.substring(1), arr);
    }
    
    public static void main(String [] args){
        String s = "Why are we doing this";
        s = "rum";
        System.out.println(s);
        System.out.println(calc(s, new ArrayList<String>()));
    }
}
