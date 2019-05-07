public int removeAbsentStudents(int allowedAbsences){
    int ans = 0;
    
    for(int r = 0; r < seats.length; r++){
        for(int c = 0; c < seats[0].length; c++){
            if(seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences){
                ans += 1;
                seats[r][c] = null;
            }
        }
    }
    return ans;
}
