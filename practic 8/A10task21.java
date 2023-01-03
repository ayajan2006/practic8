import java.util.Scanner;
public class A10task21{//9.171
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String wordd = in.nextLine();
        String[] word = wordd.split(" ");
        String kiska = word[0];//en kiska cozdi tabadi
        for (String word2 : word) {
            if (kiska.length() > word2.length())
                kiska = word2;
        }
        System.out.println(kiska);
	}
}