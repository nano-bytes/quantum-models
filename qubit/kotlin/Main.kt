/**
 * Main Kotlin file
 */


fun main(args: Array<String>) {
    println("============= RANDOM QUBIT =============")
    var qubitOne: Qubit = QubitBuilder.buildRandomQubit()
    analyzeQubit(qubitOne)
    analyzeQubit(qubitOne)

    print("\n============= EQUAL-OPPORTUNITY QUBIT =============")
    var qubitTwo: Qubit = QubitBuilder.buildEqualOpportunityQubit()
    analyzeQubit(qubitTwo)
    analyzeQubit(qubitTwo)
}

fun analyzeQubit(qubit: Qubit){
    qubit.probabilisticDensity()
    qubit.analyzeWaveFunction()
    qubit.observe()
}