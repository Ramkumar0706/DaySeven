package stringBuilder;

public class ExampleStringBuilder {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("My Name is ");
		System.out.println(sb);
		
		StringBuilder app = sb.append("Ramkumar");
		System.out.println(app==sb);
		System.out.println(sb);
		
		System.out.println(app.insert(app.length(), " i am Fine"));
		StringBuilder insert = app.insert(app.length(), " i am Fine");
		System.out.println(insert==app);
	}

}
