/**
* 正则匹配
*  手机号:13581733600
*   创建规则-> 编译规则 -> 创建匹配器
*/
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class PatternTest{
	public static void main(String[] args){
		String mobile = "13581733600";
		String reg = "^1\\d{10}$"; // 1.规则
		Pattern pattern = Pattern.compile(reg); // 2.编译
		Matcher matcher = pattern.matcher(mobile); // 3.创建匹配器
		if(matcher.matches()){
			System.out.println("匹配成功");
		}else{
			System.out.println("匹配失败");
		}

		// 第二种方式
		if(Pattern.matches(reg, mobile)){
			System.out.println("匹配成功");
		}else{
			System.out.println("匹配失败");
		}



	}
}
