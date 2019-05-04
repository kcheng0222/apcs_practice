public class RandomLetterChooser extends RandomStringChooser{
    
    public RandomLetterChoose(String str){
        super(getSingleLetters(str));
    }
    
}
