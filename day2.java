
import java.util.ArrayList;
import java.util.Collections;


public class day2 {
    // public static void main(String[] args){
    //     ArrayList<String> fruits = new ArrayList<>();
    //     fruits.add("Apple");
    //     fruits.add("Banana");
    //     fruits.add("Mango");
    //     fruits.add("Dragonfruit");
    //     System.out.println(fruits);
    //     System.out.println("Size = "+ fruits.size());

    // }

    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);

        Collections.reverse(list);
        Collections.sort(list);

        System.out.println(list);
        System.out.println("Maximum = " + Collections.max(list));
        

    }
    
}
