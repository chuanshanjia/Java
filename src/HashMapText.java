
/**
*/
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;


public class HashMapText{
	public static void main(String[] args){
		Map<String,String>  map = new HashMap<String,String>();
		map.put("第一站", "康静里");
		map.put("第二站", "姚家园");
		map.put("第三站", "石佛营");
		map.put("第四站", "朝阳公园");

		Set set = map.keySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
