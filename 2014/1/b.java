public static void scrambleOrRemove(List<String> wordList){
    int i = 0;
    
    while(i < wordList.length){
        String x = wordList.get(i);
        String y = scrambleWord(x);
        if(!x.equals(y)){
            wordList.set(i, y);
        }
        else{
            i += 1;
        }
    }
    return wordList;
}