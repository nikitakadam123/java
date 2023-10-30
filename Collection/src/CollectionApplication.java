import java.util.LinkedList;
	import java.util.List;
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
			
			}

		}

