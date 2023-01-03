import java.util.Scanner;
public class A10task7{//9.37
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*String word=in.nextLine();
        //malika==ikamal етип шыгарып береди
		int a = word.length();
		String b1 = word.substring(a/2,a);
		String b = word.substring(0,a/2);
		System.out.print(b1);
		System.out.print(b);*/





		System.out.println("enter the word");
		String word = in.nextLine();
		int length = word.length();

		if(length%2==0){
			String word1 = word.substring(0,length/2);
			String word2 = word.substring(length/2,length);
			System.out.println(word2+""+word1);
	     }else{
            System.out.println("nechotnyi");
		}
	}
}


