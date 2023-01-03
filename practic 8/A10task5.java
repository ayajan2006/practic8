import java.util.Scanner;
public class A10task5{//9.22
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String word = in.nextLine();
        //жазган созди ортасынан болип шыгарып береди
		int a= word.length();
		String b = word.substring(0,a/2);
        System.out.println(b);
	}
}