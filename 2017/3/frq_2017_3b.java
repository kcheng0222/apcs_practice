public int findLastOccurrence(String str){
    for(int i = currentPhrase.length() - str.length(); i > 0; i--){
        int x = findNthOccurrence(str, i);
        if(x >= 0){
            return x;
        }
    }
    return -1;
}
