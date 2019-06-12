public class Tester{
    public static int gcd(int a, int b){
        if(a == 0 || b= == 0){
            return b;
        }
        return gcd(b, a % b);
    }
    public static void main(String [] args){
        System.out.println(gcd(8, 4));
        System.out.println(gcd(4, 8));
        System.out.println(gcd(8, 8));
        System.out.println(gcd(0, 4));
    }
}
