public class Range implements NumberGroup{
    private int x;
    private int y;
    
    public Range(int a, int b){
        x = a;
        y = b;
    }
    
    public boolean contains(int n){
        return x <= n && n >= y;
    }
}
