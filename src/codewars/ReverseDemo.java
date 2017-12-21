package codewars;

class Reverse {
    char Z;
    int i = 0;
    public String reverse(String str) {
        char Arr [] = str.toCharArray();
        int N = str.length();
        Z = Arr[i];
        Arr [i] = Arr [N];
        Arr[N] = Z;
        reverse(str.substring(i+1, N-1));
        String Reversed = new String(Arr);
        return Reversed;
    }
}
public class ReverseDemo{
    public static void main (String args[]){
        Reverse rev = new Reverse();
        System.out.println(rev.reverse("Harry"));
    }
}
