package test;
/**
*  定义员工类并输出员工属性
*/
public class PersonTreeSet implements Comparable{
	private int code;
	private String name;
	private String sex;
	private String depth;

	public PersonTreeSet(int code, String name, String sex, String depth){
		this.code = code;
		this.name = name;
		this.sex = sex;
		this.depth = depth;
	}

	public void setCode(int code){
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

	public int getCode(){
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

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.getCode());
		sb.append("\t");
		sb.append(this.getName());
		sb.append("\t");
		sb.append(this.getSex());
		sb.append("\t");
		sb.append(this.getDepth());

		return new String(sb);
	}


	public int compareTo(Object object){
		PersonTreeSet other = (PersonTreeSet)object;
		return this.getCode() > other.getCode() ? -1 : (this.getCode()== other.getCode() ? 0 : 1);
	}

}
