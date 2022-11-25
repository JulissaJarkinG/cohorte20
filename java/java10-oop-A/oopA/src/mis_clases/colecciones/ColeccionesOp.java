package mis_clases.colecciones;
import java.util.*;
public class ColeccionesOp {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		  
	       
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
  
       
        System.out.println("ArrayList: " + list.get(0));
        System.out.println("ArrayList: " + list.get(2));
  
       
        HashMap<Integer, String> hm  = new HashMap<Integer, String>();
  
       
        hm.put(1, "A");
        hm.put(2, null);
        hm.put(null, null);
        hm.put(4, "D");
        hm.put(5, "E");
  
        
        System.out.print("HashMap: " + hm);
        

	}
}
