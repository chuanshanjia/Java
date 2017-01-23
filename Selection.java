/**
* 选择排序
*/
import java.util.Arrays;


public class Selection{
	public static void main(String[] args){
		int[] src = new int[]{63, 4, 24, 1, 3, 15};

		
		System.out.println("原有数组内容:");
		for(int i : src){
			System.out.print(i + "\t");
		}
		System.out.println("");

		int end = src.length;
		int maxIndex = 0;
		int swap = 0;
		for(int i=0; end > 0; end--){
			maxIndex = i;
			for(int j=0; j < end; j++){
				if(src[j] > src[maxIndex]){ // 交换变量
					maxIndex = j;
				}
			}

			// 置换变量
			swap = src[end-1];
			src[end-1] = src[maxIndex];
			src[maxIndex] = swap;
		}
		System.out.println("从小到大排序后的结果:");
		for(int i : src){
			System.out.print(i + "\t");
		}
		System.out.println("");
		
	}
}
