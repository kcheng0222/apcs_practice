public boolean contains(int n){
    for(NumberGroup x : groupList){
        if(x.contains(n)){
            return true;
        }
    }
    return false;
}
