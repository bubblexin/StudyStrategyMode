package strategy_mode

class StrategyImpl1:IStrategy {
    override fun calculation() {
        println("strategyImpl1")
    }

    override fun print() {
        println("I'm StrategyImpl1")
    }
}