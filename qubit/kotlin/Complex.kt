import kotlin.math.pow

/**
 * This class models a complex number
 * @author Paul Rodriguez-Ch
 */
class Complex (realNumber: Float, imaginaryNumber: Float){

    var realNumber: Float
    var imaginaryNumber: Float

    init {
        this.realNumber = realNumber
        this.imaginaryNumber = imaginaryNumber
    }

    fun module(): Float{
        return (this.realNumber.pow(2) + this.imaginaryNumber.pow(2)).pow(0.5f)
    }

    fun getComplexValue(): String{
        return "" + this.realNumber.toString() + " + " + this.imaginaryNumber.toString() + "i"
    }

    fun setValues(realNumber: Float, imaginaryNumber: Float){
        this.realNumber = realNumber
        this.imaginaryNumber = imaginaryNumber
    }
}