public class A10task2{//9.16
	public static void main(String[] args) {
		String word = "Ayazhan";
        //2 жане 4 ариптердин бирдейлигин шыгарып береди
		char a = word.charAt(2);
		char b = word.charAt(4);

		if(a==b || b==a){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}