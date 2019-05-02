public class RandomStringChooser{
    
    ArrayList<String> myStrings = new ArrayList<String>();
    
    public RandomStringChooser(String[] arr){
        for(int i = 0; i < arr.length; i++){
            myStrings.add(arr[i]);
        }
    }
    
    public String getNext(){
        if(myStrings.size() == 0){
            return "NONE";
        }
        
        Random gen = new Random();
        
        return myStrings.remove((new Random()).nextInt(myStrings.size()));
    }
}
