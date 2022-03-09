public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="   java Strings ";
		System.out.println("Length of string before using trim method is "+str.length());
				String str2=str.trim();
		System.out.println("Length of string after using trim method is "+str2.length());
		System.out.println(str2.toUpperCase());
			System.out.println(str2.charAt(3));
			System.out.println(str2.indexOf("v"));
	}
}