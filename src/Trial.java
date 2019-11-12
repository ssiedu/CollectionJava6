
import java.io.File;
import java.util.LinkedList;
import java.util.Stack;
class Emp{}
public class Trial {
    public static void main(String args[]){
        
        Stack stk=new Stack();
        stk.push("abc");
        stk.push(10);
        stk.push(2.5);
        
        Double d1=(Double)stk.pop();
        System.out.println(d1.doubleValue()*2);
        System.out.println(d1*2);
        
    }
            
}
