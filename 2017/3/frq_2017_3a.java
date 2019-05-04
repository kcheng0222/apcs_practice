public void replaceNthOccurrence(String str, int n, String repl){
    int x = findNthOccurrence(str, n);
    if(x >= 0){
        currentPhrase = currentPhrase.sustring(0, x) + repl + currentPhrase(str.length() + x);
    }
}

/*
public void replaceNthOccurrence(String str, int n, String repl){
    int count = 0;
    for(int i = 0; i < currentPhrase.length() - str.length(); i++){
        if(currentPhrase.substring(i, i+str.length()).equals(str)){
            count += 1;

            if(count == n){
                currentPhrase = currentPhrase.substring(0, i) + repl + currentPhrase.substring(i + str.length());
            }
        }
    }
}
*/
