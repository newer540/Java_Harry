package test;
/*
простой класс
переводит дюймы в метры
*/
 class inches_to_meters {
	 public static void main (String args[]) {
		 double inches, meters;
		 int counter;
		 
		 counter = 0;
		 for (inches = 1; inches <= 144; inches++) {
			 meters = inches / 39.37; //перевод
			 System.out.println(inches + " дюймов " + meters + " метров");
			 counter++;
			 if (counter == 12) {
				 System.out.println();
				 counter = 0; //reset counter
			 }
		 }
	 }
}
