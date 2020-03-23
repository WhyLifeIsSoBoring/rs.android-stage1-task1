package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val happyArray = ArrayList(sadArray.asList())
        var i = 1

        while(i < happyArray.size - 1) {
            if(happyArray[i - 1] + happyArray[i + 1] < happyArray[i]) {
                happyArray.removeAt(i)
                if(i != 1) i--
            }
            else i++
        }
        return happyArray.toIntArray()
    }
}
