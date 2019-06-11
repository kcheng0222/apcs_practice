
import java.util.*;
import java.lang.*;
import java.io.*;

class SubsetGenerator
{    
    public static List<String> calc(String s, int start, int end, List<String> arr){
        if(end >= s.length() - 1 && start == end){
            return arr;
        }
        if(end == s.length() - 1){
            arr.add(s.substring(start, end));
            end = start += 2;
            start += 1;
        }
        else{
            end += 1;
        }
        arr.add(s.substring(start, end));
        return calc(s, start, end, arr);
    }
    public static void main(String [] args){
        String s = "Why are we doing this";
        System.out.println(s);
        System.out.println(calc(s, 0, 1, new ArrayList<String>()));
    }
}
