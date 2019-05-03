public static int[] getColumn(int [][] arr2D, int c){
    int[] ans = new int[arr2D.length];

    for(int i = 0; i < arr2D.length; i++){
        ans[i] = arr2D[i][c];
    }

    return ans;
}
