package chan_of_responsibility_pattern.impl

import chan_of_responsibility_pattern.Handler

class HandlerImpl2 : Handler() {
    override fun proceed(intParam:Int) {
        if (intParam in 6..10) {
            println("HandlerImpl2 proceed $intParam")
        } else {
            mSuccessor?.proceed(intParam)
        }
    }
}