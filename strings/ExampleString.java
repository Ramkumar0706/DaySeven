package strings;

import java.util.Arrays;

public class ExampleString {

	public static void main(String[] args) {
		String word="Hello i am Ram";


		System.out.println(word);

		System.out.println("==============================");
		System.out.println("using getByte method");
		byte[] bytes = word.getBytes();
		String string = Arrays.toString(bytes);
		System.out.println(string);

		System.out.println("==============================");
		System.out.println("using length method");
		System.out.println(word.length());

		System.out.println("==============================");
		System.out.println("using isEmpty method");
		System.out.println(word.isEmpty());

		System.out.println("==============================");
		System.out.println("using using charAt method");
		System.out.println(word.charAt(4));

		System.out.println("==============================");
		System.out.println("using odePointAt method");
		System.out.println(word.codePointAt(8));
		System.out.println(word.codePointBefore(8));
		System.out.println(word.codePointCount(4, 8));
		//System.out.println(word.getBytes());

		String s1="tom";
		String s2="Tom";

		System.out.println("==============================");
		System.out.println("using equals method");
		System.out.println(s1.equals(s2));

		System.out.println("==============================");
		System.out.println("using equalsIgnoreCase method");
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println("==============================");
		System.out.println("using contentEquals method");
		System.out.println(s1.contentEquals(s2));

		System.out.println("==============================");
		System.out.println("using compareTo method");
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s2));

		String c1="Jerry";
		String c2="Jerry";
		System.out.println(c1.equals(c2));
		System.out.println(c1.compareTo(c2));                                     

		System.out.println("==============================");
		System.out.println("using startWith and endsWith method");
		System.out.println(c1.startsWith("J"));
		System.out.println(c1.endsWith("ry"));
		
		System.out.println("==============================");
		System.out.println("using hashcode method");
		System.out.println(c1.hashCode());

		System.out.println("==============================");
		System.out.println("using indexof method");
		System.out.println(word.indent(2));
		System.out.println(word.lastIndexOf("a"));
		
		System.out.println("==============================");
		System.out.println("using subString method");
		System.out.println(word.substring(3, 11));
		System.out.println(word.substring(5));    
		
		System.out.println("==============================");
		System.out.println("using concat method");
		System.out.println(word.concat("Content Added"));
		
		System.out.println("==============================");
		System.out.println("using replace method");
		System.out.println(word.replace("a", "z"));
		
		System.out.println("==============================");
		System.out.println("using split method");
		String[] split = word.split(" ");
		System.out.println(Arrays.toString(split));
		
		System.out.println("==============================");
		System.out.println("using toLowerCase method");
		System.out.println(word.toLowerCase());
		
		System.out.println("==============================");
		System.out.println("using toUpperCase method");
		System.out.println(word.toUpperCase());
		
		System.out.println("==============================");
		System.out.println("using trim method");
		System.out.println(word.trim());
		
		System.out.println("==============================");
		System.out.println("using Strip method");
		System.out.println(word.strip());

		System.out.println("==============================");
		System.out.println("using contains method");
		System.out.println(word.contains("Ram"));


		System.out.println("==============================");
		System.out.println("using trim method");
		String name="   ramkunar    ";
		System.out.println("before using trim");
		System.out.println(name);
		System.out.println("After using trim");
		System.out.println(name.trim());

		System.out.println("==============================");
		System.out.println("using join method");
		String join=String.join("hello","i am","Tom");
		System.out.println("using join mehod in String : "+join);


		System.out.println("==============================");
		System.out.println("using format method");
		String format=String.format("value is %32.12f", 34.44);
		System.out.println("the name is fomat : "+format);


		System.out.println("==============================");
		System.out.println("using toCharArray method");
		String to="hello Java";
		char[] ch=to.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println("==============================");
		System.out.println("using valueof method");
		String re="23";
		System.out.println(String.valueOf(re));
		String rr=new String("hello iam Tom");
		System.out.println(rr);
		System.out.println(String.valueOf(rr));
		












	}

}
