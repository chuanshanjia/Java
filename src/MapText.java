
/**
* Map使用技巧
*/
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;


public class MapText{
	public static void main(String[] args){
		Map<String, String>  map = new HashMap<String,String>();
		map.put("001", "张三");
		map.put("005", "李四");
		map.put("004", "王一");
		map.put("003", "周八");


		System.out.println("HashMap==================");
		Set set = map.keySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(".HashMap==================");

		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.putAll(map);

		System.out.println("TreeMap==================");
		Set tset = treeMap.keySet();
		iterator = tset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(".TreeMap==================");
	}
}
