package strategy_partten.impl

import strategy_partten.IStrategy

class StrategyImpl2: IStrategy {
    override fun calculation() {
        println("strategyImpl2")
    }

    override fun print() {
        println("I'm StrategyImpl2")
    }
}