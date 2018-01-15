package codewars;

class Reverse {
    public String reverse(String str) {
        int len = str.length();
        if(len == 1) return str;
        return str.charAt(len - 1) + reverse(str.substring(0, len-1));


    }
}
public class ReverseDemo{
    public static void main (String args[]){
        Reverse rev = new Reverse();
        System.out.println(rev.reverse("Harry"));
    }
}
