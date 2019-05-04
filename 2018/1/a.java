public boolean simulate(){
    int distance = 0;

    for(int i = 0; i < maxHops; i++){
        distance += hopDistance();
        if(distance >= goalDistance){
            return true;
        }
        if(distance < 0){
            return true;
        }
    }
    return false;
}
