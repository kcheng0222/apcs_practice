public class Test{
    public static String reverse(String s){
        if(s.length() == 1){
            return s;
        }
        return s.substring(s.length() - 1, s.length() - 2) + reverse(s.substring(0, s.length() - 1));
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("After: " + reverse(s));
    }
}
