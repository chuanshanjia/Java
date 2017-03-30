/**
* 正则匹配
*  手机号:13581733600
*   创建规则-> 编译规则 -> 创建匹配器
*/
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class MobilePattern {
	public static void main(String[] args){
		String mobile = "13581733600";
		// String reg = "^1\\d{10}$"; // 1.规则
		String reg = "^1[34578]\\d{9}$"; // 1.规则

		// 第二种方式
		if(Pattern.matches(reg, mobile)){
			System.out.println("匹配成功");
		}else{
			System.out.println("匹配失败");
		}



	}
}
