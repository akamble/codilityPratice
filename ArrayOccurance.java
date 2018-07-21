/*
*
* @akamble
*
* example for a permutation is a sequence containing each element from 1 to N once, and only once.
*
* this code is only for practice purpose.
*
* */


public class ArrayOccurance {

    private  static final  String PERMUTATION="PERMUTATION";
    private static final String NOT_PERMUTATION="NOT_PERMUTATION";


    public static  String  solution(int[] A) {
        int temp[] = new int[A.length];

        int counter = 0;

        for (int i = 0; i < A.length; ++i) {
            int value = A[i];
            if(value >= temp.length) {
                return NOT_PERMUTATION;
            }
            if(temp[value] == 0) {
                temp[value]=1;
                ++counter;
            } else {
                return NOT_PERMUTATION;
            }
        }

        return counter == A.length ? PERMUTATION : NOT_PERMUTATION;

    }

    public static void main(String[] args) {


        int A[] = { 3,1,2,0};

        System.out.println( solution(A));

    }
}
