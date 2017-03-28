package test;
/* Демонстрация применения оператора if.
Присвойте файлу с исходным кодом имя IfDemo.java.
*/
class IfDemo {
	public static void main (String args[]) {
		int a, b, c;
		a = 2;
		b = 3;
		
		if (a < b) System.out.println("a меньше b");
		// След. строка никогда не может быть выведена
		if (a == b) System.out.println("invisible");
		
		System.out.println();
		
		c = a - b; // переменная "c" содержит значение -1
		
		System.out.println("c содержит -1");
		if (c >= 0) System.out.println("c is not a negative number");
		if (c < 0) System.out.println("c - is negative");
		
		System.out.println();
		
		c = b - a; //переменная с теперь содержит значение
		
		
		System.out.println("c содержит 1");
		if(c >=  0) System.out.println("c - не отрицательное число");
		if(c < 0) System.out.println("c - отрицательное число");
		
		
	}

}
