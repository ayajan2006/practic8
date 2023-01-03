import java.util.Scanner;//9.70
public class A10task20{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("soz zhaz: ");
		String soz = in.nextLine();
		char[] glasnyi = soz.toCharArray();
		int count =0;

		for (char c :glasnyi) {
			switch(c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'y':
				case 'u':
				count++;
				break;
			}
		}
		System.out.println("glasnyi sany: "+count);
	}
}