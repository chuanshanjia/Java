/**
* 冒泡排序
*/
import java.util.Arrays;


public class Bubble{
	public static void main(String[] args){
		int[] src = new int[]{12, 56, 4 ,62, 8};

		
		System.out.println("原有数组内容:");
		for(int i : src){
			System.out.print(i + "\t");
		}
		System.out.println("");

		int swap=0;
		for(int i=0; i < src.length; i++){
			for(int j=i; j < src.length; j++){
				if(src[i] > src[j]){
					swap = src[i];
					src[i] = src[j];
					src[j] = swap;
				}
			}
		}
		System.out.println("从大到小排序后的结果:");
		for(int i : src){
			System.out.print(i + "\t");
		}
		System.out.println("");
		
	}
}
