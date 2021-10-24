package strategy_mode

class StrategyImplDefault:IStrategy {
    override fun calculation() {
        println("StrategyImplDefault")
    }

    override fun print() {
        println("I'm StrategyImplDefault")
    }
}