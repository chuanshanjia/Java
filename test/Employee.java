package test;
/**
*  定义员工类并输出员工属性
*/
public class Employee{
	private long code;
	private String name;
	private String sex;
	private String depth;

	public void setCode(long code){
		this.code = code;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public long getCode(){
		return this.code;
	}

	public String getName(){
		return this.name;
	}

	public String getSex(){
		return this.sex;
	}

	public String getDepth(){
		return this.depth;
	}

}
