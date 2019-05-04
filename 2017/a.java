public Digits(int num){
    digitList = new ArrayList<Integer>;

    if(num == 0){ // special case
        digitList.add(0);
    }
    else{
        while(num > 0){
            digitList.add(0, num % 10);
            num = num / 10;
        }
    }
}
