public class Finder{
    public static boolean find(String text, String str){
	    if(text.startsWith(str)){
	        return true;
	    }
	    if(text.length() < str.length()){
	        return false;
	    }
	    return find(text.substring(1), str);
    }
    
    public static void main(String [] args){
    	System.out.println(find("apple", "apple"));
    	System.out.println(find("xapplex", "apple"));
    	System.out.println(find("apple", "xapplex"));
    	System.out.println(find("apple", "appl"));
    	System.out.println(find("x", "apple"));
    }
}
