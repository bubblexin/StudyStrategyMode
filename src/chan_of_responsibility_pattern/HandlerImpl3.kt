package chan_of_responsibility_pattern

class HandlerImpl3 : Handler() {
    override fun proceed(intParam:Int) {
        if (intParam in 11..20) {
            println("HandlerImpl3 proceed $intParam")
        } else {
            mSuccessor?.proceed(intParam)
        }
    }
}