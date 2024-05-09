package pack1;

import java.util.Arrays;

public class ClassHandling {
	public void methd1() {
		String s1="anuhya";
		String s2=" Anuhya love daddy";
		String s3=new String("Anuhya");
		StringBuffer s4=new StringBuffer("mutable");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println("meghana".length());
		System.out.println(s1.concat(" pendyala"));
		System.out.println(s1);
		System.out.println(s3.concat(" ammu"));
		System.out.println(s3);
		System.out.println(s4.append("String"));
		System.out.println(s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1==s2);
		System.out.println(s1=="anuhya");
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println(s1.charAt("anuhya".length()/2));
		System.out.println(s2.startsWith(s1));
		System.out.println(s2.startsWith("Anuhya"));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
        System.out.println(s2);
        System.out.println(s2.substring(12));
        System.out.println(s2.substring(7,12));
        System.out.println(s2.replace('d','D'));
        System.out.println(s2.trim( ));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        String date="06-06-2023";
        String arr1[]=date.split("-");
        System.out.println(Arrays.toString(arr1));
        String hello="hello";
        byte arr2[]=hello.getBytes();
        System.out.println(Arrays.toString(arr2));
        
	}
	public static void main(String[] args) {
		ClassHandling obj=new ClassHandling();
		obj.methd1();
	}

}

