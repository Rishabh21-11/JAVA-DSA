
class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        this.next = null;
    }
}



public class day9{

    


    public static void main(String[] args){

        Node n1 = new Node(10);
       

        Node n2 = new Node(20);
      

        n1.next = n2;

        System.out.println(n1.data);
        System.out.println(n1.next.data);
        
        
        // LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        // l.add("One");
        // l.add("Two");
        // l.add("Three");
        // l.add("Four");
        // l.add("Five");

        // System.out.println(l);

        // l.set(1,"Seven");
        // System.out.println(l);

        // l.remove(1);
        // System.out.println(l);

        // l.addFirst("Rishabh");
        // System.out.println(l);

        // l.addLast("Rishabh");
        // System.out.println(l);

    }
}