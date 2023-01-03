public class A10pr1{//copy past "String"
	public static void main(String[] args) {
		/* task1
		String word = "Hello";//созде канша арип бар екенин санайды
		int length = word.length();
		System.out.println("String Length is : " + length);*/


	  /* task2
	  String word = "Hello, JIHC!";
		char c0 = word.charAt(0);//ариптин каншаншы турганын шыгарып береди
		char c1 = word.charAt(1);
		char c2 = word.charAt(5);

		System.out.println("Char 0: "+c0);
		System.out.println("Char 1: "+c1);
		System.out.println("Char 5: "+c2);*/


	    /*task3
	    String word = "HELLO";//ворд 2 мен 3 ти салыстырады 
		String word2 = "HELLO";
		String word3 = "hello";

		boolean res = word.equals(word2);
		boolean res2 = word.equals(word3);

		boolean res3 = word.equalsIgnoreCase(word3);

		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);*/


		/*task4
		String word = "HELLO";
		String word2 = "HELLO";
		String word3 = "hello";

		boolean res = word.startsWith("H");
		boolean res2 = word.startsWith("HEL");
		boolean res3 = word.startsWith("hi");

		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);*/


		/*task5
		String word = "HELLO";//создин соны LO немесе ok пен аякталатын болса,ло ок бар болса тру,жок болса фолс
		String word2 = "HELLO";
		String word3 = "hello";

		boolean res = word.endsWith("LO");
		boolean res2 = word.endsWith("ok");

		System.out.println(res);
		System.out.println(res2);*/


		/*task6
		String word = "abc";
        //арипти санайды,жок болса -1 болады
		int t = word.indexOf("a");
		int t2 = word.indexOf("b");
		int t3 = word.indexOf("e");

		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);*/



		/*task7
		String word = "abcdefa";
        //ариптин каншаншы турганын шыгарып береди
		int t = word.lastIndexOf("a");
		int t2 = word.lastIndexOf("b");
		int t3 = word.lastIndexOf("e");

		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);*/



		/*task8
		String word = "SDU";
		String newWord = word.replace('U','C');
        //ариптердин орнын ауыстырады,sdu - sdc;
		System.out.println(newWord);//SDC

		String word2 = "Helllooou";
		word2 = word2.replace('l','T');
		word2 = word2.replace('o','y');
		System.out.println(word2);//SDC*/



		/*task9
		String word = "I love Cpp!";
		String newWord = word.replaceAll("Cpp", "Java");
        //cpp орнын java га аусырамыз
		System.out.println("Word: "+word);//SDC
		System.out.println("New word: "+newWord);//SDC  */



		/*task10
		String word = "I love Cpp and Cpp";
		String newWord  = word.replaceAll("Cpp","Java");
        //cpp орнын биринши java&java клп озгертти сосын 2 де java&cpp болды
		System.out.println("Word: "+word);
		System.out.println("NewWord: "+newWord);

		System.out.println();
		System.out.println();

		String newWord2 = word.replaceFirst("Cpp","Java");
		System.out.println("NewWord2: "+newWord2);*/




		/*task11
		String word = "I love Java and Cpp";
		String store[]= word.split(" ");
        //текстти астына тусирип жазады,1 де I love java,2 де I love and Cpp
		for(int i = 0;i<store.length;i++){
			System.out.println(store[i]);
		}

		System.out.println();
		String store2[]=word.split("v");
		for(int i = 0;i<store2.length;i++){
			System.out.println(store[i]);
		}

		System.out.println();
		String store3[]=word.split("Java");
		for(int i = 0;i<store3.length;i++){
			System.out.println(store3[i]);
		}*/





		/*task12
		String word = "0123456789";
		String newWord = word.substring(0,5);
        // 0 ден 5 ке дейн шыгарып береди
		System.out.println(newWord);*/




		/*task13
		String word2="Hello,my name is Kydyrbek";
		String subWord = word2.substring(0,5);
		String subWord2 = word2.substring(0,16);
		String subWord3 = word2.substring(17,word2.length());
        //берилген сандардын арасындагы создерди шыгарып береди
        System.out.println(subWord);
        System.out.println(subWord2);
        System.out.println(subWord3);*/




        /*task14
        String word2 = "Hello,my name is Kydyrbek";
        String newWord = word2.toLowerCase();
        //создердин барлыгын бас ариппен жазып шыгарып береди
        System.out.println(newWord);

        System.out.println();

        String newWord2 = word2.toUpperCase();
        System.out.println(newWord2);*/
	}
}