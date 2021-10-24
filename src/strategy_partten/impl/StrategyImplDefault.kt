package strategy_partten.impl

import strategy_partten.IStrategy

class StrategyImplDefault: IStrategy {
    override fun calculation() {
        println("StrategyImplDefault")
    }

    override fun print() {
        println("I'm StrategyImplDefault")
    }
}