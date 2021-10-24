package visitor_partten.impl

import visitor_partten.IVisitor

class VisitorHappy :IVisitor {
    override fun manReaction(man: Man) {
        println("${man.gender}开心时打游戏")
    }

    override fun womenReaction(women: Women) {
        println("${women.gender}开心时买买买")
    }
}