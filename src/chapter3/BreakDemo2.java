package chapter3;

/**
 * Created by harry on 01-Apr-17.
 */
class BreakDemo2 {
    public static void main(String args []) {

        for (int i=0; i<3; i++) {
            System.out.println("������� ������ �����: " + i);
            System.out.print("            ������� ����������� �����: " );
            int t = 0;
            while (t < 100) {
                if (t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
    }
}
