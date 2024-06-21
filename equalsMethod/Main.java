package equalsMethod;

public class Main {

	public static void main(String[] args) {
		Person p=new Person(1, "RAM");
		Person p1=new Person(1, "RAM");
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		System.out.println(p.compareTo(p1));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
}
