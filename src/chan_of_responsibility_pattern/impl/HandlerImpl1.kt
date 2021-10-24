package chan_of_responsibility_pattern.impl

import chan_of_responsibility_pattern.Handler

class HandlerImpl1 : Handler() {
    override fun proceed(intParam:Int) {
        if (intParam in 1..5) {
            println("HandlerImpl1 proceed $intParam")
        } else {
            mSuccessor?.proceed(intParam)
        }
    }
}