package chapter4;

/**
 * Created by hbagratyan on 13.04.2017.
 */
class Help {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("O�epa�op if:\n");
                System.out.println("if{yc�o��e) ��������;");
                System.out.println("else ��������;");
                break;
            case '2':
                System.out.println("O�epa�op switch:\n");
                System.out.println("switch{��pa�e��e) {");
                System.out.println("case ���������:");
                System.out.println(" ������������������ ����������");
                System.out.println(" break;");
                System.out.println("// ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("O�epa�op for:\n");
                System.out.print("for(�����a���a���;�������;��������)");
                System.out.println("  ��������;");
                break;
            case '4':
                System.out.println("O�epa�op while:\n");
                System.out.println("while(yc�o��e) ��������;");
                break;
            case '5':
                System.out.println("O�epa�op do-while:\n");
                System.out.println("do {");
                System.out.println(" ��������;");
                System.out.println("} while {�������;)");
                break;
            case '6':
                System.out.println("O�epa�op break:\n");
                System.out.println("break; ��� break �����;");
                break;
            case '7':
                System.out.println("O�epa�op continue:\n");
                System.out.println("continue; ��� continue �����;");
                break;
        }
        System.out.println();
    }

    void showmenu() {
        System.out.println("C�pa��a:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("B��ep��e (q - �����): ");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
    class HelpClassDemo {
        public static void main(String args[])
                throws java.io.IOException {
            char choice, ignore;
            Help hlpobj = new Help();
            for (;;) {
                do {
                    hlpobj.showmenu();
                    choice = (char) System.in.read();
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                } while (!hlpobj.isvalid(choice));
                if (choice == 'q') break;
                System.out.println("\n");
                hlpobj.helpon(choice);
            }
        }
    }