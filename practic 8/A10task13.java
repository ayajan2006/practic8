import java.util.Scanner;
public class A10task13{//9.109(a,b)
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the word");
       /* String word = in.nextLine();
        String newword = word.replace(word.charAt(3),'0');
        //3 ши арипти алып тастайды 0 болады
         System.out.println(newword);*/
   


   
  
       
       String word = in.nextLine();
       System.out.println("Enter the kerek emes index");
       int n = in.nextInt();
       String newword = word.replace(word.charAt(n),'0');
       //кез келген арипти алып тастайды
        System.out.println(newword);
	}
}