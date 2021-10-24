package chan_of_responsibility_pattern

class HandlerImpl1 : Handler() {
    override fun proceed(intParam:Int) {
        if (intParam in 1..5) {
            println("HandlerImpl1 proceed $intParam")
        } else {
            mSuccessor?.proceed(intParam)
        }
    }
}