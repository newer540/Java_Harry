package test2;
//Демонстрация автоматического преобразования типа long в тип double 
class LtoD {
	public static void main (String args []) {
		int L;
		long D;
		
		L = 2_000_000_000;
		D = L;
		
		System.out.println("D & L: " + D + ", " + L);
		
	}


}
