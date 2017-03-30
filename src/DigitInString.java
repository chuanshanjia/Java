/**
* 字符串中是否含有数字
*/
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class DigitInString{
	public static void main(String[] args){
		String str = "a198801bbb";
		String reg = ".*[0-9]+.*"; // 1.规则

		if(Pattern.matches(reg, str)){
			System.out.println("含有数字");
		}else{
			System.out.println("不含有数字");
		}



	}
}
