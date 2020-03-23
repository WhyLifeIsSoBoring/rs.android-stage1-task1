package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val correctBill = (bill.sum() - bill[k]) / 2
        val result: String

        if (correctBill == b) {
            result = "Bon Appetit"
        }
        else  {
            result = (b - correctBill).toString()
        }
        return result
    }
}
