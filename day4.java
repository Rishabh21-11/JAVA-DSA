import java.util.ArrayList;

public class day4 {
    public static void main(String[] args){
        

        ArrayList<String>students = new ArrayList<>();
        students.add("Rishabh");
        students.add("Vikas");
        students.add("Dhruv");
        students.add("Ashish");
        System.out.println("Original list: ");
        System.out.println(students);
        students.add(2,"Vishal");
        System.out.println(students);
        students.set(2,"Vihaan");
        System.out.println(students);
        students.remove("Vihaan");
        System.out.println(students);
        System.out.println("Contains Vikas :"+students.contains("Vikas"));
        for(String name:students){
            System.out.print(name);
        }
        
        

    
    }
}
