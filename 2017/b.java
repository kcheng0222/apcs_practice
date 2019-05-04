public boolean isStrictlyIncreasing(){
    for(int i = 0; i < digitList.size() - 1; i++){
        if(digitList.get(i) >= digitList.get(i+1)){
            return false;
        }
    }
    return true;
}
