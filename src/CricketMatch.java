
import java.util.LinkedList;
import java.util.TreeSet;


public class CricketMatch {

    
    //public static void showTeamMembers(LinkedList<String> names){
    public static void showTeamMembers(TreeSet<String> names){
        System.out.println("Team Members  :");
        for(String name:names){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        
        //LinkedList<String> list=new LinkedList<>();
        //HashSet<String> list=new HashSet<>();
        TreeSet<String> list=new TreeSet<>();
        list.add("Amit");
        list.add("Manish");
        list.add("Sumit");
        list.add("Rajesh");
        list.add("Chetan");
        list.add("Manish");
        showTeamMembers(list);
    }
}
