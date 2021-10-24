package chan_of_responsibility_pattern

abstract class Handler {
    protected var mSuccessor: Handler? = null

    fun setSuccessor(successor: Handler) {
        this.mSuccessor = successor
    }

    abstract fun proceed(intParam: Int)
}