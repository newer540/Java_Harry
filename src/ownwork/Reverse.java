package ownwork;

// Display a string backwards using recursion.
public class Reverse{
    public static void main(String args []) {
        String str = "HARRY"; //Declaring a string that should be reversed
        if (str.length() > 0) {
            Reverse(str, str.length() - 1); //If strings lenght is not zero, then use method Reverse()
        }
    }
     public static void Reverse(String str, int index){
            if (index == 0) {
            System.out.print(str.charAt(index));//The last symbol will be '0' symbol, so after printing it we returning from method
            return;
            }
            System.out.print(str.charAt(index));//Printing a symbol and using Reverse method for the next
            Reverse(str, index-1);

    }

}
