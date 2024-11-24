/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int sumEven = 0;
        int sumOdd = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        
        result.add(sumEven);
        result.add(sumOdd);
        
        return result;
}
}