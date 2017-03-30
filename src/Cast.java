/**
* int型变量和char型变量的转换，以此来获取Unicode编码和数字对应的字符。
*/
public class Cast{
	public static void main(String[] args){
		int a = 'a';
		int k = 'k';
		int L = 'L';

		char u211 = 211;
		char u79 = 79;
		char u36 = 36;
		
		System.out.println(a + "\t" + k + "\t" + L + "\t" + u211 + "\t" + u79 + "\t" + u36);
	}
}
