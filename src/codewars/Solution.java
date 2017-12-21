package codewars;

class Solution {
    static int mark;

    static int stray(int[] numbers) {
        for(int i = 0; i < numbers.length-1; i++){
            for (int a = 0; a < numbers.length-1; a++){
                if (numbers[i] != numbers[a]){
                    mark = numbers[a];
                }
            }
        }
        return mark;
    }
}
class SolutionDemo {
    public static void main (String args[]){

        Solution sol = new Solution();
        int Arr1[] = {1, 2, 1, 1, 1};
        int Arr2[] = {3, 3, 3, 3, 3, 3, 5 ,3, 3, 3};
        System.out.println(sol.stray(Arr1));
        System.out.println(sol.stray(Arr2));
    }
}