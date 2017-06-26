package chapter5;

/**
 * Created by Harry on 26.06.2017.
 * �����, ����������� ������� ��� �������� ��������
 */
class Quene {
    char q[]; //������ ��� �������� ��������� �������
    int putloc, getloc; // ������� ��� ������� � ����������

    // ��������� �������
    Quene(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    // ��������� ������ � �������

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - ������� ���������");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - ������� �����");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

//������������ ������������� ������ Quene
class QDemo {
    public static void main(String args[]) {
        Quene bigQ = new Quene(100);
        Quene smallQ = new Quene(4);
        char ch;
        int i;

        System.out.println("������������� ������� bigQ ��� ���������� " +
                "��������");
        // ����c���� ��������� ������� � ������� bigQ
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("������������� ������� smallQ ��� ��������� " +
                "������");
        for (i = 0; i < 5; i++) {
            System.out.print("������� ���������� " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //�������������� ������ ��� ��������� � ������� smallQ

        System.out.print("���������� smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}




