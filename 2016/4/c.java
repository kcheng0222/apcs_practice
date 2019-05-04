public static String format(List<String> wordList, int formattedLen){
    String ans = "";
    String gap = "";

    int gapLength = basicGapWidth(wordList, formattedLen);
    int extra = leftoverSpaces(wordList, formattedLen);
    
    for(int x = 0; x < gapLength; x++){
        gap += " ";   
    }

    for(int x = 0; x < wordList.size() - 1; x++){
        ans += wordList.get(x) + gap;
        if(extra > 0){
            ans += " ";
            extra -= 1;
        }
    }
    ans += wordList.get(wordList.size() - 1);

    return ans;
}
