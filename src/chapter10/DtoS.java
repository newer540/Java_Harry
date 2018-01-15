package chapter10;

/* A simple disk-to-screen utility that
demonstrates a FileReader. */
import java.io.*;
class DtoS {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("C:\\GIT\\Java_Harry\\src\\chapter10\\TEST.TXT");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}
