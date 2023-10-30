import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionApplication {

	
			public static void main(String[] args) {
				List<Integer> lst=new LinkedList<Integer>();
				lst.add(10);
				lst.add(20);
				lst.add(30);
				System.out.println(lst);
				lst.remove(1);
				System.out.println(lst);
				System.out.println(lst.contains(50));
			
				//set interface
				Set<Integer> st=new TreeSet<Integer>();
				st.add(10);
				st.add(20);
				st.add(10);
				st.add(40);
				st.add(5);
				System.out.println("tree set "+st);
				
				//hash interface
				
				Set<Integer> hst=new HashSet<Integer>();
				hst.add(10);
				st.add(20);
				st.add(10);
				st.add(40);
				st.add(5);
				System.out.println("Hash set "+hst);
				
				
				
				
			}

		}

