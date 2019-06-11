
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{   
    public static List<String> calc(String s, int start, int end, List<String> arr){
    	System.out.println(arr);
    	arr.add(s.substring(start, end));
        
        if(s.length() == 1){
        	return arr;
        }
        end ++;

        return calc(s.substring(1), start, end, arr);
    }
    
    public static void main(String [] args){
        String s = "Why are we doing this";
        s = "rum";
        System.out.println(s);
        System.out.println(calc(s, 0, 1, new ArrayList<String>()));
    }
}
