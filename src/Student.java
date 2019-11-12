public class Student {
    private int rno;
    private String name;
    private String branch;
    private int sem;

    public Student(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    public void showInfo(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }
    
}
