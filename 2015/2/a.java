public class HiddenWord{
    
    private String word;
    
    public HiddenWord(String s){
        word = s;
    }
    
    public getHint(String guess){
        String result = "";
        
        for(int x = 0; x < guess.length(); x++){
            if(word.substring(x, x+1).equals(guess.substring(x, x+1))){
                result += word.substring(x, x+1);
            }
            else if(word.contains(guess.substring(x, x+1))){
                    result += "+";
                }
            else{
                result += "*";
            } 
        }
        return result;
    }
}
