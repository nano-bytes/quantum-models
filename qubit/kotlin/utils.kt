import kotlin.random.Random

/**
 * This class are utilities used for the calculations
 * @author Paul Rodriguez-Ch
 */
class Utilities{

    companion object {

        /**
         * This method generates a random distribution vector according to the number of elements
         * @param n: the number of elements
         * @return: the normalized vector of the distribution
         */
        fun randomDistributionGeneration(n: Int): ArrayList<Float>{
            var sum : Int = 0
            var randomNumbers = ArrayList<Int>()
            for (i in 0 until n){
                var randomNumber = Random.nextInt(0, 100)
                randomNumbers.add(randomNumber)
                sum += randomNumber
            }
            return normalizeVector(randomNumbers, sum)
        }

        /**
         * This method converts one vector into another in which all its elements add up to 1
         * @param randomNumbers: the vector of random numbers
         * @param sum: the total sum of all random numbers contained into vector
         * @return: the normalized vector
         */
        fun normalizeVector(randomNumbers: ArrayList<Int>, sum: Int): ArrayList<Float>{
            var normalizeVector = ArrayList<Float>()
            for (randomNumber in randomNumbers) {
                normalizeVector.add(randomNumber.toFloat()/sum.toFloat())
            }
            return normalizeVector
        }
    }
}