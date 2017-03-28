package test2;

public class LogicalOpTabe2 {
	public static void main(String args[]) {

		boolean p, q;
		String a, b, c, d;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true;
		q = true;
		a = ((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + ((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t"
				+ ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
		System.out.println(a);

		p = true;
		q = false;
		b = ((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + ((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t"
				+ ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
		System.out.println(b);
		
		p = false;
		q = true;
		c = ((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + ((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t"
				+ ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
		System.out.println(c);

		p = false;
		q = false;
		d = ((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + ((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t"
				+ ((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
		System.out.println(d);
	}
}