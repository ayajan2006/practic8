import java.util.Scanner;
public class A10task10{//9.90
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the word");
    String word = in.nextLine();
    int length = word.length();
        //е арипин й мен ауыстырады
    for(int i = 0; i<length; i++) {
      if(word.charAt(i) == 'e'){
        String newword = word.replace(word.charAt(i), 'i');
        System.out.println(newword);
      }
    }
  }
}