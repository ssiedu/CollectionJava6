
import java.util.HashMap;


public class GTest<T1,T2> {

    public void add(T1 p){}
    public void sub(T2 p){}
    
    public static void main(String[] args) {
        
        HashMap map;
        
        GTest<Integer,Double> ob1=new GTest<>();
        
        GTest<String,Long> ob2=new GTest<>();
        
        GTest ob3=new GTest();
        
        
    }
}
