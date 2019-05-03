public double runSimulations(int num){
    double passed = 0.0;
    
    for(int i = 0; i < num; i++){
        if(simulate()){
            passed += 1.0;
        }
    }

    return passed / num;
}
