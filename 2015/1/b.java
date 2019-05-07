public static int[] rowSums(int[][] arr2D){
    int[] ans = new int[arr2D.length];
    for(int i = 0; i < arr2D.length; i++){
        ans[i] = arraySum(arr2D[i]);
    }
    return ans;
}
