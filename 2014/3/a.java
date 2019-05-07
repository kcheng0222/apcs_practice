public SeatingChart(List<Student> studentList, int rows, int cols){
    int x = 0;
    int y = 0;
    seats = new Student[rows][cols];
    for(Student s : studentList){
        seats[rows][cols] = s;
        
        x += 1;
        if(x == rows){
            x = 0;
            y += 1;
        }
    }
}
