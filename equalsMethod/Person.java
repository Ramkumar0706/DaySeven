package equalsMethod;

public class Person implements Comparable<Person> {
	int age;
	String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		
		return this.name.equals(p.name);
	}

	@Override
	public int compareTo(Person o) {

		return this.name.compareTo(o.name);
	}
	
	@Override
	public int hashCode() {
		return (int)( 10*Math.random());
	}
}
