import kotlin.math.pow
import kotlin.random.Random

/**
 * This class models a qubit
 * @author Paul Rodriguez-Ch
 */
class Qubit(alpha: Complex, beta: Complex){
    var alpha: Complex
    var beta: Complex
    var ketZero: Array<Int>
    var ketOne: Array<Int>
    var value: Int
    var isObserved: Boolean

    init {
        this.alpha = alpha
        this.beta = beta
        this.ketZero = arrayOf(1, 0)
        this.ketOne = arrayOf(0, 1)
        this.value = 1
        this.isObserved = false
    }

    fun observe(){
        if(!isObserved){
            if(this.alpha.module().pow(2) < this.beta.module().pow(2)){
                this.setQubitToOne()
            }else if(this.alpha.module().pow(2) > this.beta.module().pow(2)){
                this.setQubitToZero()
            }else{
                if(Random.nextInt(0, 1)==1) this.setQubitToOne() else this.setQubitToZero()
            }
            this.isObserved = true
        }
        println("\n ...OBSERVING THE QUBIT... \n")
        println("The value of the Qubit is: " + this.value)

    }

    fun analyzeWaveFunction(){
        println("WaveFunction: ")
        println("|S> = (" + this.alpha.getComplexValue() + ")|0> + ("+ this.beta.getComplexValue() + ")|1>")
        println("Probabilities: ")
        println("|S> = (" + (this.alpha.module().pow(2)*100) + "%)|0> + (" + (this.beta.module().pow(2)*100) + "%)|1>")
    }

    fun probabilisticDensity(){
        println("Density: " + (this.alpha.module().pow(2) + this.beta.module().pow(2)))
    }

    private fun setQubitToOne(){
        this.value = 1
        this.alpha.setValues(0f, 0f)
        this.beta.setValues(1f, 0f)
    }

    private fun setQubitToZero(){
        this.value = 0
        this.alpha.setValues(1f, 0f)
        this.beta.setValues(0f, 0f)
    }

}