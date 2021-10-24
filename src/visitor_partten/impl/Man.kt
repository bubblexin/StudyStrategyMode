package visitor_partten.impl

import visitor_partten.People
import visitor_partten.IVisitor

class Man : People() {
    override var gender: String
        get() = "男人"
        set(value) {}

    override fun accept(visitor: IVisitor) {
        visitor.manReaction(this)
    }
}