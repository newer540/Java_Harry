package codewars;
/*Jaden Smith, the son of Will Smith, is the star of films
such as The Karate Kid (2010) and After Earth (2013). Jaden
is also known for some of his philosophy that he delivers via
Twitter. When writing on Twitter, he is known for almost always
capitalizing every word.
Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized
in the same way he originally typed them.*/

class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase != null) {
            char JadenChar[] = phrase.toCharArray();
            for (int i = 0; i < JadenChar.length; i++)
                if (i == 0) Character.toUpperCase(JadenChar[i]);
                else if (JadenChar[i] == ' ') Character.toUpperCase(JadenChar[i + 1]);

            String JadenDoucheBag = new String(JadenChar);
            return JadenDoucheBag;
        } else return null;
    }
}
public class JadenCaseDemo{
    public static void main(String args []){
        JadenCase JC = new JadenCase();
        System.out.println(JC.toJadenCase("harry potter"));

    }
}
