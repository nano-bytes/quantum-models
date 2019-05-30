import kotlin.math.pow

/**
 * This class builds several types of qubits
 * @author Paul Rodriguez-Ch
 */
class QubitBuilder {

    companion object {

        /**
         * This method creates a qubit with random probability
         * @return a qubit with random probability
         */
        fun buildRandomQubit(): Qubit {
            var normalizedVector: ArrayList<Float> = Utilities.randomDistributionGeneration(4)
            var alphaFunction: Complex = Complex(normalizedVector[0].pow(0.5f), normalizedVector[1].pow(0.5f))
            var betaFunction: Complex = Complex(normalizedVector[2].pow(0.5f), normalizedVector[3].pow(0.5f))
            return Qubit(alphaFunction, betaFunction)
        }

        /**
         * This method creates a qubit with equal-opportunity
         * @return an equal-opportunity qubit
         */
        fun buildEqualOpportunityQubit(): Qubit {
            var equalOpportunityNumber: Float = 1.toFloat() / 2.toFloat().pow(0.5f)
            var alphaFunction: Complex = Complex(equalOpportunityNumber, 0f)
            var betaFunction: Complex = Complex(equalOpportunityNumber, 0f)
            return Qubit(alphaFunction, betaFunction)
        }
    }
}