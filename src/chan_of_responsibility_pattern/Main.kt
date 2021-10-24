package chan_of_responsibility_pattern

import chan_of_responsibility_pattern.impl.HandlerImpl1
import chan_of_responsibility_pattern.impl.HandlerImpl2
import chan_of_responsibility_pattern.impl.HandlerImpl3

/**
 * 责任链模式
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，将这个对象连成一条链，直到有一个对象处理它为止。
 * 简单说就是使发送者和接受者解耦，发送者和接受者都没有对方的明确信息，简化对象的互相连接，它们仅需保持一个指向其后继者的引用。
 * 好处：当客户提交一个请求时，请求是沿链传递直至有一个 ConcreteHandler 对象负责处理它。而且由于链是在客户端形成，所以配置更加灵活。
 * eg. OkHttp 的拦截器部分的设计，就是用了责任链模式
 */
fun main() {
    val handler1 = HandlerImpl1()
    val handler2 = HandlerImpl2()
    val handler3 = HandlerImpl3()
    val handlerDefault = HandlerImplDefault()
    handler1.setSuccessor(handler2)
    handler2.setSuccessor(handler3)
    handler3.setSuccessor(handlerDefault)

    handler1.proceed(33)
}