package chapter3;

class KbIn {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch;
		
		System.out.println("Нажмите нужную клавишу, а затем ENTER: ");
		ch = (char) System.in.read();
		System.out.println("Вы нажали клавишу " + ch);
	}

}
