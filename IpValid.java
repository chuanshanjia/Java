/**
* ip地址校验
*/
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class IpValid{
	public static void main(String[] args){
		String ip = "192.163.1.129";
		String reg = "([0-9]{1,3}\\.){3}.[0-9]{1,3}"; // 1.规则

		if(Pattern.matches(reg, ip)){
			System.out.println("是一个合法的IP");
		}else{
			System.out.println("不合法的IP");
		}



	}
}
