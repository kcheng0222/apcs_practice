public static boolean isLatin(int[][] square){
    if(containsDuplicates(square[0])){
        return false;
    }

    for(int r = 1; r < square.length; r++){
        if(!hasAllValues(square[0], square[r])){
            return false;
        }
    }
    for(int c = 0; c < square.length; c++){
        if(!hasAllValues(square[0], getColumn(square, c))){
            return false;
        }
    }

    return true;

}
