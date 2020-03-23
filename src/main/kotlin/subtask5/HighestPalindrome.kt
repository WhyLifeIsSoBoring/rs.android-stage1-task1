package subtask5

import java.lang.StringBuilder

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val sB = StringBuilder(digitString)
        var count = 0

        for (i in 0 until digitString.length / 2) {
            if (digitString[i] != digitString[digitString.length - i - 1]) {
                count++
            }
        }

        count = k - count
        val result = if (count >= 0) {
            for (i in 0..digitString.length / 2) {
                if (count > 1 && sB[i] !='9') {
                    if (sB[i] != '9') {
                        if (sB[i] == sB[sB.length - i - 1]) {
                            count -= 2
                        } else {
                            count--
                        }
                        sB[i] = '9'
                        sB[sB.length - i - 1] = '9'
                    }
                }   else if (sB[i] != sB[sB.length - i - 1]) {
                    if (count == 1 && sB[i] != '9') {
                        sB[i] = '9'
                        sB[sB.length - i - 1] = '9'
                        count--
                    }   else if (sB[i] > sB[sB.length - i - 1]) {
                        sB[sB.length - i - 1] = sB[i]
                    }   else {
                        sB[i] = sB[sB.length - i - 1]
                    }
                }
            }
            if (sB.length % 2 == 1 && count > 0) {
                sB[(sB.length - 1) / 2] = '9'
            }
            sB.toString()
        }   else {
            "-1"
        }
        return  result
    }
}
