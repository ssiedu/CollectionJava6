
import java.util.ArrayList;


public class CollectionInCollection {

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        ArrayList<Integer> list5=new ArrayList<>();
        
        list1.add(50);list1.add(60);list1.add(70);
        list2.add(55);list1.add(65);list1.add(75);
        list3.add(56);list1.add(66);list1.add(76);
        list4.add(57);list1.add(67);list1.add(77);
        list5.add(58);list1.add(68);list1.add(78);
        
        ArrayList<ArrayList<Integer>> marks=new ArrayList<>();
        marks.add(list1); marks.add(list2);
        marks.add(list3); marks.add(list4); marks.add(list5);
        
        
        
        for(ArrayList<Integer> list:marks){
            for(Integer mark:list){
                System.out.print(mark+"\t");
            }
            System.out.println();
        }
        
        
        
    }
}
