fun main(args: Array<String>) {
//    println("Hello World!")

    val expString: String = "Hello"
    val impString = "World"
    var changeString = "Hello World"
    changeString = "Hello World 2"

    val intInferred = 2
    val longNum = 999999999999999999
    val impInt: Int = 4
    val explicitLong = 42L

    val doubleNum = 2.1
    val floatNum: Float = 2.2F

    val trueVal: Boolean = true
    val falseVal = false

//    println(trueVal || falseVal) //true
//    println(falseVal && trueVal) // false
//    println(!falseVal) //true

    val charEx: Char = 'a'

    var stringEx: String = "hello"
//    println(stringEx.uppercase())

    for (ch in stringEx) {
//        println(ch)
    }

    stringEx = """
        Moving
            All
                About
                    The
                        Place
    """

//    println(stringEx)

    val testNum = 5
    if (testNum > 5) {
//        println("$testNum is more than 5")
    } else if (testNum > 2) {
//        println("$testNum is more than 2")
    } else {
//        println("$testNum")
    }

    val numMessage = if (testNum > 4) "$testNum is more than 4" else "$testNum"
//    println(numMessage)

    val x = 3

//    when (x) {
//        1 -> print("x is 1")
//        2-> print("x is 2")
//        else -> println("The answer is neither 1 nor 2")
//    }

    when {
        10<0 -> print("Obviously fake")
//        5>2 -> print("5 is more than 2")
    }

    val storedWhen = when {
        10<0 -> "Will not be stored"
        5>2 -> "5 is more than 2"
        else -> "Anything else"
    }

    val nullString:String? = null

//    println(nullString.length) //does not even compile
//    println(nullString?.length)

    var numArray = arrayOf(1,2,3)
//    println(collection[0])

//    for (item in numArray) {
//        println(item)
//    }

//    for (i in 0..5) {
//        println(i)
//    }

//    for (i in 20 downTo 0 step 5) {
//        println(i)
//    }

    var y = 1

//    while(true) {
//        if(y%3==0) {
//            y += 2
//        } else if (y>100) {
//            break
//        }
//        y += 2
//        println(y)
//    }

//    do{
//        println("Hello")
//    } while (false)

    val square = squareNums(2,2)
//    println(square)

    val addNums = defValsEx()
//    println(addNums)

    val namedVals = namedValues(num2 = 7, str = "Something")
    println(namedVals)

    val totals = varArgsTotals(1,2,3,4,5)
    println(totals)

    val newArr = arrayOf(1,2,3)
    println(newArr[0]) //1

    val arrayWithCon = Array(10) {i -> i+1}
    println(arrayWithCon[9]) //10

}

fun squareNums(num1: Int, num2: Int): Int {
    return num1 * num2
}

fun defValsEx(num1: Int = 1, num2: Int = 2): Int {
    return num1 + num2
}

fun namedValues(num: Int = 0, str: String = "", num2: Int): String {
    return "$num is the first number, $str is the string, and $num2 is the second number."
}

fun varArgsTotals(num: Int=0,vararg numList: Int): Int {

    var total = 0
    total += num

    for(i in numList) {
        total += i
    }

    return total
}