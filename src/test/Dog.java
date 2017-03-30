package test;

/**
*  定义类
*/
public class Dog implements Comparable{
	int size;
	public Dog(int size){
		this.size = size;
	}

	public String toString(){
		return "" + this.size;
	}

	public int getSize(){
		return this.size;
	}
	
	//TreeSet的时候才调用
	@Override 
	public int compareTo(Object object){
		Dog other = (Dog)object;
		return other.getSize() == this.size ? 0 : (other.getSize() > this.size ? -1 : 1);
	}
}
