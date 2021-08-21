import java.util.Scanner;
public class uncensor {
	static String uncensorstring(String str, String vowels) {
		int n=0,nn=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='*') {
				n++;
			}
		}
		if(n==vowels.length()) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='*') {
					str = str.substring(0, j) + vowels.charAt(nn) +
				    str.substring(j + 1);
					nn++;
				}
			}
			return str;
		}
		else {
			System.out.println("Vowels are not equal to * in the string!\n");
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println("Enter your String: ");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println("Enter vowels to be replaced: ");
		String v=input.nextLine();
		System.out.println("Censored String: "+s);
		s=uncensorstring(s,v);
		System.out.println("Uncensored String: "+s);
	}
}
