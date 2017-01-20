/**
* 类型转换:double转换为int，降低数据的精度,导致数据不完整。
*/
public class Conversion{
	public static void main(String[] args){
		float fNum = 9.5F;
		int intNum = 5;
		System.out.println("fNum/intNum=" + fNum/intNum);

		double dNum1 = 14.48;
		double dNum2 = 78.48;
		System.out.println("int(dNum1) = " + (int)dNum1 + ", int(dNum2)=" + (int)dNum2);
	}
}

