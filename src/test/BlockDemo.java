package test;
/*
Демонстрация применения блоков кода.
Присвойте файлу с исходным кодом имя BlockDemo.java
*/
class BlockDemo {
	public static void main(String args[]) {
		double i, j, d;
		
		i = 5;
		j = 10;
		
		//Телом оператора if является целый блок кода.
		if(i!=0) {
			System.out.println("i не равно нулю");
			d = j / i;
			System.out.print("j / i равно " + d);
			System.out.println();
			System.out.print("d равно " + d);
		}
	}
}
