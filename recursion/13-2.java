public class Tester{
    public static String foo(String s, int i){
        if(i >= s.length()){
            return s;
        }
        return foo(s.substring(1, s.length()), i) + s.substring(0, 1);
    }
    public static void main(String [] args){
        System.out.println(foo("gummy bears", 5));
        System.out.println(foo("gummy bears", 7));
        System.out.println(foo("gummy bears", 1));
    }
}
