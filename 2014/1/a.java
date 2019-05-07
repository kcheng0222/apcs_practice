public static String scrambleWord(String word){
    String ans = "";
    
    if(word.length() <= 1){
        return word;
    }
    
    int i = 0;
    
    while(i < word.length() - 1){
        String a = word.substring(i, i+1);
        String b = word.substring(i+1, i+2);
        if(a.equals("A") && !b.equals("A")){
            ans += b + a;
            i += 2;
        }
        else{
            ans += a;
            i += 1
        }
    }
    return ans;
}
