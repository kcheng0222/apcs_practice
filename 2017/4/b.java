public static Position[][] getSuccessorArray(int[][] intArr){
    Position[][] ans = new Position[intArr.length][intArr[0].length];
    for(int r = 0; r < intArr.length; r++){
        for(int c = 0; c < intArr[0].length; c++){
            ans[r][c] = findPosition(intArr[r][c] + 1, intArr);
        }
    }
    return ans;
}
