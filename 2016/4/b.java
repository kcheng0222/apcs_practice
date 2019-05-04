public static int basicGapWidth(List<String> wordList, int formattedLen){
    return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
}
