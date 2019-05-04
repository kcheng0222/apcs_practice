public class MultPractice implements StudyPractice{
    private num;
    private count;

    public MultPractice(int x, int y){
        num = x;
        count = y;
    }

    public void nextProblem(){
        count += 1;
    }

    public String getProblem(){
        return num + " TIMES " + count;
    }
}
