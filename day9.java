import java.util.LinkedList;

public class day9{

    public static void main(String[] args){
        
        
        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        System.out.println(l);

        l.set(1,"Seven");
        System.out.println(l);

        l.remove(1);
        System.out.println(l);

        l.addFirst("Rishabh");
        System.out.println(l);

        l.addLast("Rishabh");
        System.out.println(l);

    }
}