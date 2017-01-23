/**
* 集合的使用
*  手机号:13581733600
*   创建规则-> 编译规则 -> 创建匹配器
*/
import test.Person;
import test.PersonTreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class CollectionSet{
	public static void main(String[] args){
		Person a = new Person(1, "name3", "woman", "金融");
		Person b = new Person(1, "name1", "woman", "金融");
		Person c = new Person(2, "name2", "man", "金融");

		Set<Person> set = new HashSet<Person>();
		set.add(a);
		set.add(b);
		set.add(c);

		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}


		System.out.println("TreeSet=====");
		PersonTreeSet as = new PersonTreeSet(3, "name3", "woman", "金融");
		PersonTreeSet bs = new PersonTreeSet(1, "name1", "woman", "金融");
		PersonTreeSet cs = new PersonTreeSet(2, "name2", "man", "金融");
		Set<PersonTreeSet> tset = new TreeSet<PersonTreeSet>();
		tset.add(as);
		tset.add(bs);
		tset.add(cs);

		Iterator titerator = tset.iterator();
		while(titerator.hasNext()){
			System.out.println(titerator.next());
		}


	}
}
