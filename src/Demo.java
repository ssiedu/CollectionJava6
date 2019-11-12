public class Demo {
    public static void square(int n){
        System.out.println("Square of : "+n+" : "+(n*n));
    }
    public static void show(Object s){
        
    }
    public static void main(String args[]){
        Integer ob1=new Integer(5);
        square(10);
        //square(ob1.intValue());
        square(ob1);
        
        
        
        show("abc");
        show(true);//pr.boolean boxed to Boolean Object
        show(4);//pr. int boxed to Integer object
        show(2.5);//pr. double boxed to Double object
        
        
    }
}
