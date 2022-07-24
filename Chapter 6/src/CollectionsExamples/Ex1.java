package CollectionsExamples;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Ex1 {
public static void main(String[] args) {
	Set<Integer> tree = new TreeSet<Integer>();
	tree.add(3);
	tree.add(1);
	tree.add(2);
	System.out.println("tree set is : "+tree);
}
}
class Ex2{
	public static void main(String[] args) {
		//Creating and adding Elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		//Traversing elements
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
class Ex3{
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		System.out.println("Traversing element through iterator in decending order");
		Iterator i = set.descendingIterator();
		System.out.println(set);
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
class Ex4{
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("Lowest Value : "+set.pollFirst());
		System.out.println("Highest Value : "+set.pollLast());
		System.out.println(set);
	}
}
class Ex5{
	public static void main(String[] args)
	{
	TreeSet<String> ts= new TreeSet<String>();
	// Elements are added using add() method
	ts.add("AA");
	ts.add("BB");
	ts.add("CC");
	System.out.println("Tree Set is " + ts);
	String check = "BB";
// Check if the above string exists in the treeset or not
System.out.println("Contains " + check + " " + ts.contains(check));
// Print the first element in the TreeSet
System.out.println("First Value " + ts.first());
// Print the last element in the TreeSet
System.out.println("Last Value " + ts.last());
String val = "BB";
//Find the values just greater and smaller than the above string
System.out.println("Higher " + ts.higher(val));
System.out.println("Lower " + ts.lower(val));
	}

}
class Ex6{
	public static void main(String[] args)
	{
           TreeSet<String> ts= new TreeSet<String>();
		// Elements are added using add() method
		ts.add("AA");
		ts.add("BB");
		ts.add("CC");
		// Iterating though the TreeSet
		for (String value : ts)
                             System.out.print(value+ ", ");
		System.out.println();
	}
}
class Ex7{
	public static void main(String args[]){
		Set<Integer> tree = new TreeSet<Integer>(new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
		}
		});
		tree.add(3);	
		tree.add(1);		
		tree.add(2);
		System.out.println("treeSet : "+tree);
		}

}

class Employee{
String name;
String id;
public Employee(String name, String id) {
this.name = name;
this.id = id;
}
public String toString() {
return "Employee{" + "name=" + name + ", id=" + id + '}';
}}
class Main {
public static void main(String...a){
Employee emp1=new Employee("Smith","4");
Employee emp2=new Employee("Paul","2");
Employee emp3=new Employee("Charles","1");
Set<Employee> treeSet = new TreeSet<Employee>(new Comparator<Employee>() 
{
public int compare(Employee o1, Employee o2) 			
{ return o1.name.compareTo(o2.name); }
});
treeSet.add(emp1);treeSet.add(emp2);treeSet.add(emp3);
System.out.println("treeSet : "+treeSet);
}}

//Java program to demonstrate the working of a Deque in Java

class Ex8{
	public static void main(String[] args)
	{
		Deque<String> deque= new LinkedList<String>();
		// We can add elements to the queue in various ways
		// Add at the last
		deque.add("Element 1 (Tail)");
		// Add at the first
		deque.addFirst("Element 2 (Head)");
		// Add at the last
		deque.addLast("Element 3 (Tail)");
		// Add at the first
		deque.push("Element 4 (Head)");
		// Add at the last
		deque.offer("Element 5 (Tail)");
		// Add at the first
		deque.offerFirst("Element 6 (Head)");
		System.out.println(deque + "\n");
		// We can remove the first element or the last element.
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing "+ "first and last: "+ deque);
	}

}

class Ex9{
	public static void main(String[] args)
	{
		// Initializing an deque
	Deque<String> dq= new ArrayDeque<String>();
		// add() method to insert
		dq.add("AA");
		dq.addFirst("BB");
		dq.addLast("CC");
		System.out.println(dq);
	}
}

//Java program to demonstrate the removal of elements in deque
class EX10 {
	public static void main(String[] args)
	{
		// Initializing an deque
		Deque<String> dq= new ArrayDeque<String>();
		// add() method to insert
		dq.add("ABC");
		dq.addFirst("PQR");
		dq.addLast("STU");
		System.out.println(dq);
		System.out.println(dq.pop());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
	}
}
//Java program to demonstrate the iteration of elements in deque
 class Ex11 {
	public static void main(String[] args)
	{
		// Initializing an deque
		Deque<String> dq= new ArrayDeque<String>();
		// add() method to insert
		dq.add("ABC");
		dq.addFirst("PQR");
		dq.addLast("STU");
		dq.add("BB");
		for (Iterator itr = dq.iterator();
			itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		for (Iterator itr = dq.descendingIterator();
			itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
	}
}

//Java program to demonstrate the HashMap() constructor
 class Ex12 {
	public static void main(String args[])
	{
		// No need to mention the Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();
		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();
		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");
		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");
		System.out.println("Mappings of HashMap hm1 are : "+ hm1);
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

//Java program to demonstrate the HashMap(int initialCapacity) constructor
class Ex13 {
	public static void main(String args[])
	{
		// No need to mention the Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>(10);
		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2= new HashMap<Integer, String>(2);
		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");
		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");
		System.out.println("Mappings of HashMap hm1 are : "+ hm1);
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

//Java program to demonstrate the HashMap(Map map) Constructor
 class Ex14 {
	public static void main(String args[])
	{
		// No need to mention the Generic type twice
		Map<Integer, String> hm1 = new HashMap<>();
		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");
		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2= new HashMap<Integer, String>(hm1);
		System.out.println("Mappings of HashMap hm1 are : "+ hm1);
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

//Java program to add elements to the HashMap
 class Ex15 {
	public static void main(String args[])
	{
		// No need to mention the Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();
		// Initialization of a HashMap using Generics
		HashMap<Integer, String> hm2= new HashMap<Integer, String>();
		// Add Elements using put method
		hm1.put(1, "One");
		hm1.put(2, "two");
		hm1.put(3, "three");
		hm2.put(1, "AA");
		hm2.put(2, "BB");
		hm2.put(3, "CC");
		System.out.println("Mappings of HashMap hm1 are : "+ hm1);
		System.out.println("Mapping of HashMap hm2 are : "+ hm2);
	}
}

//Java program to illustrate Java.util.HashMap
class Ex16 {
	public static void main(String[] args)
	{
		// Create an empty hash map
		HashMap<String, Integer> map = new HashMap<>();
		// Add elements to the map
		map.put("ABC", 10);
		map.put("PQR", 30);
		map.put("STU", 20);
		// Print size and content
		System.out.println("Size of map is:- "+ map.size());
		System.out.println(map);
		// Check if a key is present and if present, print value
		if (map.containsKey("ABC")) {
			Integer a = map.get("ABC");
			System.out.println("Value for key"+ " \"ABC\" is:- " + a);
		}
	}
}

//Java program to remove elements from HashMap
 class Ex17{
	public static void main(String args[])
	{
		// Initialization of a HashMap
		Map<Integer, String> hm= new HashMap<Integer, String>();
		// Add elements using put method
		hm.put(1, "AA");
		hm.put(2, "BB");
		hm.put(3, "CC");
		hm.put(4, "DD");
		// Initial HashMap
		System.out.println("Mappings of HashMap are : "+ hm);
		// remove element with a key using remove method
		hm.remove(4);
		// Final HashMap
		System.out.println("Mappings after removal are : "+ hm);
	}
}

//Java program to traversal a Java.util.HashMap
 class Ex18 {
	public static void main(String[] args)
	{
		// initialize a HashMap
		HashMap<String, Integer> map = new HashMap<>();
		// Add elements using put method
		map.put("AA", 10);
		map.put("BB", 30);
		map.put("CC", 20);
		// Iterate the map using for-each loop
		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
	}
}

//Java program to traversal a Java.util.HashMap
class Ex19 {
	public static void main(String[] args)
	{
		// initialize a HashMap
		HashMap<String, Integer> map = new HashMap<>();
		// Add elements using put method
		map.put("AA", 10);
		map.put("BB", 30);
		map.put("CC", 20);
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.putAll(map);
		System.out.println(map1);
		System.out.println(map.get("AA"));
		Collection c=map.values();
		for(Object x:c)
		System.out.println(x);
		Set s=map.keySet();
		for(Object x:s)
		System.out.println(x);
		
	}
}

