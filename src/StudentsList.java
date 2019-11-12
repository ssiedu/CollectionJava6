
import java.util.ArrayList;


public class StudentsList {
    public static void main(String[] args) {

        Student s1=new Student(111,"AA","CS",4);
        Student s2=new Student(112,"BB","IT",3);
        Student s3=new Student(113,"CC","CS",1);
        Student s4=new Student(114,"DD","EC",5);
        Student s5=new Student(115,"EE","EX",6);
        
        ArrayList<Student> list=new ArrayList<>();
        
        list.add(s1); list.add(s2); list.add(s3);
        list.add(s4); list.add(s5);
        
        for(Student s:list){
            s.showInfo();
        }
        
        
        
    }
}
