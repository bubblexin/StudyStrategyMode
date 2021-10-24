package visitor_partten

import visitor_partten.impl.*

/**
 * 访问者模式（GOF 中最复杂的一个设计模式，用的比较少）
 * 概念：访问者模式，表示一个作用于某对象结构（ObjectStructure）中的各个元素（Man、Women）的操作。它使你可以在不改变各元素的类的前提下定义，定义作用
 * 与这些元素的新操作（VisitorHappy、VisitorSad...）。
 *
 * 1. 访问者模式适用于数据结构相对稳定的系统，它把数据结构和作用于数据结构之上的操作之间的耦合解耦，使得操作可以相对自由的执行演化
 * 2. 访问者模式的目的，是为了要把处理从数据结构中分离出来。如果这个系统有比较稳定的数据结构，又有易于变化的算法，使用访问者模式比较合适。
 * 3. 访问者模式的优点是增加新的操作很容易
 * 4. 访问者模式的缺点是使增加新的数据结构很困难
 *
 * Visitor 和具体的男人、女人数据结构用到了双分派的技术。首先在客户程序中将具体状态作为参数传递给“男人类”，完成第一次分派；然后男人类中调用作为参数的
 * “具体状态” 中的方法，同时将自己作为参数传递给 Visitor 中的方法，完成第二次分派。
 */
fun main() {
    val os = ObjectStructure()
    os.attach(Man())
    os.attach(Women())

    os.accept(VisitorHappy())
    os.accept(VisitorAngry())
    os.accept(VisitorSad())
}