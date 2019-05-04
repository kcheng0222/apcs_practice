public static Position findPosition(int num, int[][] intArr){
    for(int r = 0; r < intArr.length; r++){
        for(int c = 0; c < intArr[0].length; c++){
            if(intArr[r][c] == num){
                return new Position(r, c);
            }
        }
    }
    return null;
}
