public static boolean find(String text, String str){
    if(text.startsWith(str)){
        return true;
    }
    if(text.length() < str.length()){
        return false;
    }
    return find(text.substring(1), str);
}
