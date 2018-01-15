package codewars;
/*Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of
cells and carries the "instructions" for the development and
functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other,
 as "C" and "G". You have function with one side of the DNA
 (string, except for Haskell); you need to get the other complementary
 side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).*/

class DnaStrand {
    public String makeComplement(String dna) {
        char DNAArr[] = dna.toCharArray();
        for (int i = 0; i < DNAArr.length; i++) {
            switch (DNAArr[i]) {
                case 'A':
                    DNAArr[i] = 'T';
                    break;
                case 'T':
                    DNAArr[i] = 'A';
                    break;
                case 'G':
                    DNAArr[i] = 'C';
                    break;
                case 'C':
                    DNAArr[i] = 'G';
                    break;
            }
        }
        //String OtherSide = new String();
        //OtherSide = DNAArr.toString();
        //return OtherSide;
        return new String(DNAArr);
    }
}

public class DNAStrandDemo {
    public static void main(String args[]) {
        DnaStrand DNA = new DnaStrand();
        System.out.println(DNA.makeComplement("ATATATAT"));
    }

}