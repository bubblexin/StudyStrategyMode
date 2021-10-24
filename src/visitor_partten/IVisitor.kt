package visitor_partten

import visitor_partten.impl.Man
import visitor_partten.impl.Women

interface IVisitor {
    fun manReaction(man: Man)
    fun womenReaction(women: Women)
}