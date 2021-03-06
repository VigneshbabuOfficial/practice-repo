/**
 * 
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author VigneshBabu
 *
 */
public class Testing1 implements Interface_Testing_1,Interface_Testing_2 {
	
	
	protected static int a = 10;
	private static int b = 20;
	static List<Integer> integerList = new ArrayList<>();

	
	/**
	 * 
	 */
	public Testing1() {
		// TODO Auto-generated constructor stub
	}
	
	private static void check(int ab) {
		System.out.println("ab="+ab);
		ab=15;
		System.out.println("ab="+ab);
	}
	
	private static void check(List<Integer> integerList1) {
		System.out.println("integerList-1="+integerList1.stream().map(String::valueOf).collect(Collectors.joining(",")));
		integerList1.add(15);
		System.out.println("integerList-1="+integerList1.stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("static variable");
		System.out.println("a="+a);
		check(a);
		System.out.println("a="+a);
		System.out.println("-------------------------------------------------");
		
		System.out.println("local variable");
		int c=10;
		System.out.println("c="+c);
		check(c);
		System.out.println("c="+c);
		System.out.println("-------------------------------------------------");
		
		
		System.out.println("static list");
		System.out.println("integerList="+integerList.stream().map(String::valueOf).collect(Collectors.joining(",")));
		check(integerList);
		System.out.println("integerList="+integerList.stream().map(String::valueOf).collect(Collectors.joining(",")));
		System.out.println("-------------------------------------------------");
		
		System.out.println("local list");
		List<Integer> integerListLocal = new ArrayList<>();
		System.out.println("integerListLocal="+integerListLocal.stream().map(String::valueOf).collect(Collectors.joining(",")));
		check(integerListLocal);
		System.out.println("integerListLocal="+integerListLocal.stream().map(String::valueOf).collect(Collectors.joining(",")));
		System.out.println("-------------------------------------------------");
		
		
		String s = new String("hi");
		System.out.println(s.getClass().getName() + "@" + s.hashCode());
		
		String s1 = "hi";
		System.out.println(s1.getClass().getName() + "@" + s1.hashCode());
		
		s1.concat("vicky");
		System.out.println("after concat="+s1.getClass().getName() + "@" + s1.hashCode());
		
		String s2 = "hi";
		System.out.println(s2.getClass().getName() + "@" + s2.hashCode());
		
		System.out.println("s.equals(s1)"+s.equals(s1));
		System.out.println("num="+s==s1);

		System.out.println("s1.equals(s2)"+s1.equals(s2));
		System.out.println("s1==s2 = "+s1==s2);

		String s3 = new String("hi");
		System.out.println("s1==s3 = "+s1==s3);
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		

		Integer i = 95;
		System.out.println(i.getClass().getName() + "@" + i.hashCode());

		i++;
		System.out.println(i.getClass().getName() + "@" + i.hashCode());
		
		
		Integer j = 95;
		System.out.println(j.getClass().getName() + "@" + j.hashCode());
		
		System.out.println(i==j);
		System.out.println("i=j"+i.equals(j));
		
		
		
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return null;
	}

}
