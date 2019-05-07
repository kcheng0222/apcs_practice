public static boolean isDiverse(int[][] arr2D){
    
    List<Integer> sums = new ArrayList<Integer>();
    for(int i = 0; i < arr2D.length; i++){
        int s = arraySum(arr2D[i]);
        
        sums[i] = s;
        
        for(int y = 0; y < sums.length; y++){
            if(sums[y] == s){
                return false;
            }
        }
    }
    return true;
}
