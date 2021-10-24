package visitor_partten.impl

import visitor_partten.IVisitor

class VisitorSad :IVisitor {
    override fun manReaction(man: Man) {
        println("${man.gender}难过时抽烟喝酒")
    }

    override fun womenReaction(women: Women) {
        println("${women.gender}难过时哭泣")
    }

}