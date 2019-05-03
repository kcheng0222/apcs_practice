public CodeWordChecker implements StringChecker{
    String bad;
    int lower;
    int upper;

    public CodeWordChecker(String b){
        bad = b;
        lower = 6;
        upper = 20;
    }

    public CodeWordChecker(int l, int u, String b){
        lower = l;
        upper = u;
        bad = b;
    }

    public boolean isValid(String s){
        if((l > s.length()) || (s.length() > u)){
            return false;
        }
        return s.contains(bad)
    }
}
