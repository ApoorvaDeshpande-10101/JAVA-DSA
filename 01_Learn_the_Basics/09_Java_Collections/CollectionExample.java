import java.util.*;  
  
public class CollectionExample {  
    public static void main(String[] args) {  
        Collection<String> list = new ArrayList<>();  
  
        list.add("Rahul");  
        list.add("Priya");  
        list.add("Amit");  
  
        for (String name : list) {  
            System.out.println(name);  
        }  
    }  
}
