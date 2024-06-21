package strings;

public class Strings {
	
	public static void main(String[] args) {
		String s1=new String("ram");
		String s2 =new String("ram");
		String l="ram";
		System.out.println("without using literal");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("with using literal");
		System.out.println(s1==l);
		System.out.println(s1.equals(l));
		
		System.out.println("using intern method");
		System.out.println(s1.intern()==l);
	}

}
