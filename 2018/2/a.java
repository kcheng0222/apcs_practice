public WordPairList(String [] words){
    for(int i = 0; i < words.length - 1; i++){
        for(int j = i+1; j < words.length; j++)
        allPairs.add(new WordPair(words[i], words[j]));
    }
}
