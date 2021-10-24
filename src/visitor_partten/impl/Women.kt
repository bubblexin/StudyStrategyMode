package visitor_partten.impl

import visitor_partten.People
import visitor_partten.IVisitor

class Women : People() {
    override var gender = "女人"

    override fun accept(visitor: IVisitor) {
        visitor.womenReaction(this)
    }
}