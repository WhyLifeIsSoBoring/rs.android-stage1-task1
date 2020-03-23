package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var min = input[0]
        var max  = min
        var sum = 0
        for(i in input) {
            if (i < min)    {
                min = i
            }
            else if(i > max) {
                max = i
            }
            sum += i
        }
        return intArrayOf(sum - max,sum - min)
    }
}
