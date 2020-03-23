package subtask4

import java.lang.StringBuilder

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val bracketsOpen = listOf('(','[','<')
        val bracketsClose = listOf(')',']','>')
        val result = ArrayList<String>()
        val sB = StringBuilder()

        for(i in inputString.indices) {
            if(bracketsOpen.contains(inputString[i])) {
                var counterOfBrackets = 1
                for(pos in i + 1 until inputString.length) {
                    if (inputString[pos] == bracketsOpen[bracketsOpen.indexOf(inputString[i])]) {
                        counterOfBrackets++
                    }
                    if (inputString[pos] == bracketsClose[bracketsOpen.indexOf(inputString[i])]) {
                        counterOfBrackets--
                        if (counterOfBrackets == 0) {
                            result.add(sB.toString())
                            sB.clear()
                            break
                        }
                    }
                    sB.append(inputString[pos])
                }
            }
        }
        return result.toTypedArray()
    }
}
