import java.util.Scanner;
public class A10task12{//9.92
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the word");
    String word = in.nextLine();
    String newword = "";
    //четный болып турган соз сандарды y га айналдырып жибереди
    for(int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if(i % 2 == 0) {
        newword = newword + "y";
        
      }else{
        newword = newword + letter;
      }
    }    
    System.out.println(newword);
  }
}