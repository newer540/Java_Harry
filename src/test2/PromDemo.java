package test2;

class PromDemo {

	public static void main(String args[]) {

		int i, j;
		boolean isprime;

		for (i = 2; i < 100; i++) {
			isprime = true;
			// проверить, делится ли число на j без остатка
			for (j = 2; j <= i / j; j++)
				// если делится, значит оно не простое
				if ((i % j) == 0)
					isprime = false;

			if (isprime)
				System.out.println(i + " - простое число.");

		}
	}
}