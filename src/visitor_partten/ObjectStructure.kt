package visitor_partten

class ObjectStructure {
    private val mList = arrayListOf<People>()

    fun attach(p: People) {
        mList.add(p)
    }

    fun detach(p: People) {
        mList.remove(p)
    }

    fun accept(visitor: IVisitor) {
        mList.forEach {
            it.accept(visitor)
        }
    }
}