package chan_of_responsibility_pattern

class HandlerImplDefault : Handler() {
    override fun proceed(intParam: Int) {
        println("HandlerImplDefault proceed $intParam")
    }
}