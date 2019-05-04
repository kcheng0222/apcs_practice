public static String format(List<String> wordList, int formattedLen){
    String ans = "";

    int gap = basicGapWidth(wordList, formattedLen);
    int extra = leftoverSpaces(wordList, formattedLen);

    for(String x : wordList){
        ans += x;
        for(int y = 0; y < gap; y++){
            ans += " ";
        }
        if(extra > 0){
            ans += " ";
            extra -= 1;
        }
    }
    return ans;
}
