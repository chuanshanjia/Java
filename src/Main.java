import test.Employee;

public class Main{
	public static void main(String[] args){
		Employee employee = new Employee();

		employee.setCode(111L);
		employee.setName("川山甲");
		employee.setSex("男");
		employee.setDepth("金融事业部");

		System.out.println("编号:" + employee.getCode() + "\n姓名:" + employee.getName()  + "\n性别:" + employee.getSex()  + "\n部门:" + employee.getDepth());
	}
}
