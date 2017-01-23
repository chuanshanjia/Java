/**
* 集合的使用
*  手机号:13581733600
*   创建规则-> 编译规则 -> 创建匹配器
*/
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class CollectionTest{
	public static void main(String[] args){
		String a = "zhou", b = "bao", c = "xin";
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		list.add(c);

		Iterator iterator = list.iterator();
		System.out.println("ArrayList=====");
		while(iterator.hasNext()){
			System.out.printf("元素:%s\t", iterator.next());
		}
		System.out.println("");

		list.set(1, c);
		iterator = list.iterator();

		System.out.println("ArrayList=====");
		while(iterator.hasNext()){
			System.out.printf("元素:%s\t", iterator.next());
		}
		System.out.println("");


	}
}
