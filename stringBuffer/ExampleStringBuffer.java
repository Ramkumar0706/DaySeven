package stringBuffer;

public class ExampleStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sf=new StringBuffer("hello");
		System.out.println(sf);
		StringBuffer append = sf.append(" world");
		System.out.println(sf);
		
		System.out.println(sf==append);
		System.out.println(sf.equals(append));
		
		sf.insert(5," ram");
		System.out.println(sf);
		
	}

}
