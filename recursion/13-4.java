public class Choose{
    public int nChooseK(int n, int k){
        if(n == 0 || n == k){
            return 1;
        }
        return nChooseK(n-1, k) + nChooseK(n-1, k-1);
    }
    public static void main(String [] args){
        System.out.println(52, 13);
        System.out.println(6, 2);
        System.out.println(10, 10);
    }
}
