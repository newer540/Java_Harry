package test;
/*
Демонстрация различий между типами int и double.
Присвойте файлу с исходным кодом имя ExarnpleЗ.java.
*/
class Example3 {
	public static void main (String args[]) {
		int var; //объявить целочисленную переменную
		double x; // объявить переменную с плавающей точкой
		
		var = 10; 
		
		x = 10.0;
		
		System.out.println("Нач. значение var: " + var);
		System.out.println("Нач. значение x: " + x);
		System.out.println(); //вывод пустой строки
		
		// Разделить значения обеих переменных на 4
		var = var / 4;
		x = x / 4;
		
		System.out.println("Значение переменной var после деления: " + var);
		System.out.println("Значение переменной x после деления: " + x);
	}

}
