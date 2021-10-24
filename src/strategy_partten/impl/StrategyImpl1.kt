package strategy_partten.impl

import strategy_partten.IStrategy

class StrategyImpl1: IStrategy {
    override fun calculation() {
        println("strategyImpl1")
    }

    override fun print() {
        println("I'm StrategyImpl1")
    }
}