
public class Student {

	String name;
	int age;
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Student)) return false; 
		Student st = (Student) obj;
		if(this.getName().equals(st.getName()) && this.getAge() == st.getAge()) return true;
		return false;
	}
	
	@Override
	public int hashCode(){
		return name.length();
	}
	
	@Override
	public String toString(){
		return "Name is" + this.name + " Age is " + this.age;
	}
	
	
}
