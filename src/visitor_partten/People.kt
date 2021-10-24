package visitor_partten

abstract class People {
    open var gender: String = ""

    abstract fun accept(visitor: IVisitor)
}