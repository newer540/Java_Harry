package codewars;


/*Usually when you buy something, you're asked whether your credit card number,
phone number or answer to your most secret question is still correct. However,
since someone could look over your shoulder, you don't want that shown on your
screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four
characters into '#'. */
class Maskify {
    public static String maskify(String str) {
        String finalString; // Result string
        String subString; // Opened part of string
        String maskedSub; // Closed part of string
        String PrivSub;



        if (str.length() > 4) {
            subString = str.substring(str.length() - 4, str.length());
            maskedSub = str.substring(0, str.length() - 4);
            char [] PrivCharArray = new char[maskedSub.length()];
            for (int i = 0; i < maskedSub.length(); i++){
                PrivCharArray[i]= '#';
            }

            PrivSub = new String(PrivCharArray);
            finalString = PrivSub.concat(subString);

            return finalString;
        }
        else return str;
    }
}

public class MaskifyCodewars {
    public static void main(String args[]) {
        System.out.println(Maskify.maskify("abcd654654654654efg"));
    }
}
