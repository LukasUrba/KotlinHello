//import java.lang.ArithmeticException
//import kotlin.ArithmeticException
//import java.util.Scanner

fun main() {
//    println("Hello World!")
//
//    val expString: String = "Hello"
//    val impString = "World"
//    var changeString = "Hello World"
//    changeString = "Hello World 2"
//
//    val intInferred = 2
//    val longNum = 999999999999999999
//    val impInt: Int = 4
//    val explicitLong = 42L
//
//    val doubleNum = 2.1
//    val floatNum: Float = 2.2F
//
//    val trueVal: Boolean = true
//    val falseVal = false
//
//    println(trueVal || falseVal) //true
//    println(falseVal && trueVal) // false
//    println(!falseVal) //true
//
//    val charEx: Char = 'a'
//
//    var stringEx: String = "hello"
//    println(stringEx.uppercase())
//
//    for (ch in stringEx) {
//        println(ch)
//    }
//
//    stringEx = """
//        Moving
//            All
//                About
//                    The
//                        Place
//    """
//
//    println(stringEx)
//
//    val testNum = 5
//    if (testNum > 5) {
//        println("$testNum is more than 5")
//    } else if (testNum > 2) {
//        println("$testNum is more than 2")
//    } else {
//        println("$testNum")
//    }
//
//    val numMessage = if (testNum > 4) "$testNum is more than 4" else "$testNum"
//    println(numMessage)
//
//    val x = 3
//
//    when (x) {
//        1 -> print("x is 1")
//        2-> print("x is 2")
//        else -> println("The answer is neither 1 nor 2")
//    }
//
//    when {
//        10<0 -> print("Obviously fake")
//        5>2 -> print("5 is more than 2")
//    }
//
//    val storedWhen = when {
//        10<0 -> "Will not be stored"
//        5>2 -> "5 is more than 2"
//        else -> "Anything else"
//    }
//
//    val nullString:String? = null
//
//    println(nullString.length) //does not even compile
//    println(nullString?.length)
//
//    var numArray = arrayOf(1,2,3)
//    println(collection[0])
//
//    for (item in numArray) {
//        println(item)
//    }
//
//    for (i in 0..5) {
//        println(i)
//    }
//
//    for (i in 20 downTo 0 step 5) {
//        println(i)
//    }
//
//    var y = 1
//
//    while(true) {
//        if(y%3==0) {
//            y += 2
//        } else if (y>100) {
//            break
//        }
//        y += 2
//        println(y)
//    }
//
//    do{
//        println("Hello")
//    } while (false)
//
//    val square = squareNums(2,2)
//    println(square)
//
//    val addNums = defValsEx()
//    println(addNums)
//
//    val namedVals = namedValues(num2 = 7, str = "Something")
//    println(namedVals)
//
//    val totals = varArgsTotals(1,2,3,4,5)
//    println(totals)
//
//    val newArr = arrayOf(1,2,3)
//    println(newArr[0]) //1S
//
//    val arrayWithCon = Array(10) {i -> i+1}
//    println(arrayWithCon[9]) //10
//
//    val numArray2 = intArrayOf(1,3,5) // [1,3,5]
//    val numArray3 = IntArray(5) // [0,0,0,0,0]
//    val numArray4 = IntArray(5) {it} // [0,1,2,3,4]
//
//    val mutList = mutableListOf(1,2,3,4,5) // [1,2,3,4,5]
//    mutList.add(6) // [1,2,3,4,5,6]
//    mutList.add(0,7) // [7,1,2,3,4,5,6]
//    mutList.remove(3) //[7,1,2,4,5,6]
//
//    val sets = setOf(1,2,3,4,4) // [1,2,3,4]
//
//    val numMap = mapOf("firstKey" to "firstVal", "secondKey" to 2)
//
//    print("Enter Text: ")
//    val strIn = readln() //Hello
//    println("Your input was: $strIn") //Your input was: Hello
//
//    print("Enter text 2:")
//    val scanner = Scanner(System.`in`)
//    val scannedNum:Int = scanner.nextInt() //22
//    println("Your input was: $scannedNum") //Your input was: 22
//
//    val firstNum = 20
//    val secondNum = 0
//    try {
//        divideByZero(firstNum,secondNum)
//    } catch (e : ArithmeticException) {
//        println("${e.localizedMessage}, division error")
//    } finally {
//        println("This will always print")
//    }
//
//    val person1 = PersonClassDemo("Gareth", 25)
//
//    val dog1 = Dog("Husky")
//
//    dog1.makeNoise()
//    println("Person's first name: ${person1.name} and their age: ${person1.age}")

    val bike1 = Motorbike("Kawasaki")
    val car1 = Car("Toyota")

    println(bike1.wheels)
}
//
//open class Animal() {
//    init {
//        println("Animal superclass has been reached")
//    }
//    open fun makeNoise() {
//        println("???")
//    }
//}
//
//class Dog(val breed : String): Animal() {
//    override fun makeNoise() {
//        println("Woof")
//    }
//}

//abstract class Vehicle(val wheels: Int) {
//    abstract fun showNumWheels(wheels: Int)
//}

interface VehicleInt {
    val wheels: Int
    fun showNumWheels()
}

class Motorbike(private val brand: String): VehicleInt {
    override var wheels: Int = 2
        get() {
            return field + 2
        }
        set(wheels) {
            field = wheels + 2
        }
    override fun showNumWheels() {
        println("A $brand motorbike has $wheels wheels")
    }
}

class Car(private val brand: String): VehicleInt {
    override val wheels: Int = 4
    override fun showNumWheels() {
        println("A $brand car has $wheels wheels")
    }
}

//class PersonClassDemo(var name: String, val age: Int) {
//    init {
//        println("All values are initialised")
//    }
//
//    constructor(name2: String, name3: String = "", number: Int) :this(name2,number){
//        name = name2
//        println(name) //Gareth
//        name = name3
//        println(name) //Davis
//        println(number)
//    }
//}

//@Throws(ArithmeticException::class)
//fun divideByZero(numA: Int, numB: Int): Int {
//    return if (numB == 0) {
//        throw ArithmeticException("Can't divide $numA by $numB") //Custom exception
//    } else {
//        numA/numB
//    }
//}

//fun squareNums(num1: Int, num2: Int): Int {
//    return num1 * num2
//}
//
//fun defValsEx(num1: Int = 1, num2: Int = 2): Int {
//    return num1 + num2
//}
//
//fun namedValues(num: Int = 0, str: String = "", num2: Int): String {
//    return "$num is the first number, $str is the string, and $num2 is the second number."
//}
//
//fun varArgsTotals(num: Int=0,vararg numList: Int): Int {
//
//    var total = 0
//    total += num
//
//    for(i in numList) {
//        total += i
//    }
//
//    return total
//}

