/**
 * 
 */
package practice;

/**
 * @author VigneshBabu
 *
 */
public class Testing2 {

	protected static int a = 10;
	static int b = 20;
	
	/**
	 * 
	 */
	public Testing2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "JAVA";
		 
        String s2 = "JAVA";
        
        String s3 = "JAVA";
 
        String s4 = new String("JAVA");
        
        
        System.out.println(s1 == s2);         //Output : true
        System.out.println(s1 == s3);         //Output : true
        System.out.println(s2 == s3);         //Output : true
        System.out.println(s1 == s4);         //Output : true
 
        s1 = s1 + "J2EE";
 
        System.out.println(s1 == s2);  

	}

}
