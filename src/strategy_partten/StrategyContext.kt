package strategy_partten

import strategy_partten.impl.StrategyImpl1
import strategy_partten.impl.StrategyImpl2
import strategy_partten.impl.StrategyImplDefault

/**
 * 算法上下文类，持有具体的算法对象
 */
class StrategyContext(type: Int) : IStrategyContext {
    // 策略模式结合简单工厂模式
    private var strategy: IStrategy = when (type) {
        0 -> {
            StrategyImpl1()
        }
        1 -> {
            StrategyImpl2()
        }
        else -> {
            StrategyImplDefault()
        }
    }

    override fun getCalculationResult() {
        strategy.calculation()
    }

    override fun doPrint() {
        strategy.print()
    }
}

interface IStrategyContext {
    fun getCalculationResult()
    fun doPrint()
}