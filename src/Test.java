public class Test{
	public void say(int number){
		System.out.println("int=" + number);
	}
	public void say(long number){
		System.out.println("long=" + number);
	}
	public static void main(String[] args){
		Test test = new Test();
		test.say(12000L);
	}
}
