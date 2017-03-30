/**
* 
* 
* 
*/

import test.Dog;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class SetText{
	public static void main(String[] args){
		Set<Dog> set = new HashSet<Dog>();
		Dog d2 = new Dog(2);
		Dog d1 = new Dog(1);
		Dog d3 = new Dog(3);
		
		set.add(d2);
		set.add(d1);
		set.add(d3);

		System.out.println("HashSet===================");
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(".HashSet===================");

		Set<Dog> tset = new TreeSet<Dog>();
		tset.addAll(set);

		System.out.println("TreeSet===================");
		iterator = tset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(".TreeSet===================");
	}
}
