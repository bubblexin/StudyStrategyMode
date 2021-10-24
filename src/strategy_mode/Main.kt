package strategy_mode

/**
 * 简单工厂模式需要让客户端接触两个类，而策略模式与简单工厂结合的用法，可以让客户端只接触一个类即可，耦合度更低，使得具体的算法彻底的与客户端分离
 */
fun main() {
    val context = StrategyContext(4)
    context.getCalculationResult()
}