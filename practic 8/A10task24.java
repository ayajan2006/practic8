import java.util.Scanner;//9.151
public class A10task24{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String sozder = "youuuuuu bfdjl/W .";
		int array[] = new int[sozder.length()];
		int max = 0;
		char a;
		int l;
		for ( int i = 0; i<sozder.length(); i++) {
			a = sozder.charAt(i);
			l = Character.digit(a,10);
			if (l>=0 && l<=9){
				array[i] = l;
			}
		}
		for (int i = 0; i<sozder.length(); i++){
			if (max<array[i]) max = array[i];
		}
		System.out.println(max);
	}
}