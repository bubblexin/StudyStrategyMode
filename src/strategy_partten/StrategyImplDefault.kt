package strategy_partten

class StrategyImplDefault:IStrategy {
    override fun calculation() {
        println("StrategyImplDefault")
    }

    override fun print() {
        println("I'm StrategyImplDefault")
    }
}