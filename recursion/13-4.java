public String reverse(String s){
    if(s.length() == 1){
        return s;
    }
    return s.substring(s.length() - 1, s.length() - 2) + reverse(s.substring(0, s.length() - 1));
}
