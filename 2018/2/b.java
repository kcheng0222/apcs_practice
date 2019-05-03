public int numMatches(){
    int count = 0;
    for(WordPair pair : words){
        if(pair.getFirst().equals(pair.getSecond())){
            count += 1;
        }
    }
    return count;
}
