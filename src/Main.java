import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Dima", 26);
		Student student2 = new Student("Vitaliy", 25);
		Student student3 = new Student("Aleksey", 26);
		
		Map<Identifecator, Student> students = new HashMap<>(); 
		
		students.put(student1.getIdentifecator(), student1);
		students.put(student2.getIdentifecator(), student2);
		students.put(student3.getIdentifecator(), student3);
		
		Iterator<Entry<Identifecator, Student>> iter = students.entrySet().iterator();
		while(iter.hasNext()){
			Entry<Identifecator, Student> pair = iter.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
	}
	

		
}
