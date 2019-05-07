public static boolean isDiverse(int[][] arr2D){
    
    int[] sums = rowSums(arr2D);
    for(int x = 0; x < arr2D.length-1; x++){
        for(int y = x+1; y < arr2D.length; y++){
            if(sums[x] == sums[y]){
                return false;
            }
        }
    }
    return true;
}
