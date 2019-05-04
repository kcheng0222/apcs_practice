public static int totalLetters(List<String> wordList){
    int ans = 0;

    for(String x : wordList){
        ans += x.length();
    }
    return ans;
}
