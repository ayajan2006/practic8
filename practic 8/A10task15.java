import java.util.Scanner;
public class A10task15{//9.62
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word");
        String word = in.nextLine();
        int soz = word.length();
        int count = 0;//1 ариптын соз ишинде канша рет кайталатынын жане канша % курайтынын шыгарып береди
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a') {
            count++;
            }
        }
        System.out.println(count);
        System.out.println(word+": "+soz);
        int procent = (count * 100)/soz;
        System.out.println(procent + "%");
	}
}