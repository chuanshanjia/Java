/**
*  获取不同国家的货币
*/


import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatText{
	public static void main(String[] args){
		long money = 5l;
		String fmoney = NumberFormat.getCurrencyInstance(Locale.CHINA).format(money);
		System.out.println("中国:" + fmoney);

		fmoney = NumberFormat.getCurrencyInstance(Locale.US).format(money);
		System.out.println("美国:" + fmoney);

		fmoney = NumberFormat.getCurrencyInstance(Locale.UK).format(money);
		System.out.println("英国:" + fmoney);
	}
}
