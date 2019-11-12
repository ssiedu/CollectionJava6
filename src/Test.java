
import java.util.Stack;

public class Test {

    public static Stack divide(int n){
        Stack stk=new Stack();
        stk.push(n/5);
        stk.push(n/10);
        return stk;
    }
    
    private static int[] calculate(int i) {
        int data[]=new int[2];
        data[0]=i*i;
        data[1]=data[0]*i;
        return data;
    }
    public static void main(String args[]){
        int res[]=calculate(10);
        System.out.println("SQUARE : "+res[0]);
        System.out.println("CUBE   : "+res[1]);
        
        Stack st=divide(100);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

}
