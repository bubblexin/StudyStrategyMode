package visitor_partten.impl

import visitor_partten.IVisitor

class VisitorAngry :IVisitor {
    override fun manReaction(man: Man) {
        println("${man.gender}生气时大声说话甚至打人")
    }

    override fun womenReaction(women: Women) {
        println("${women.gender}生气时大声说话并且哭泣")
    }
}