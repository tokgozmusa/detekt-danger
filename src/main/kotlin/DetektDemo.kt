class DetektDemo {
    private val unusedVariable: String = "unused"

    fun isHTTPSuccess(statusCode: Int): Boolean = statusCode == 200

    fun veryLongFunction() {
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
        println("Hello")
    }

    fun fixMyStyle(x: Int): Int {
        when (x) {
                1 -> {
                println(x)
                return x
            }
            2 -> {
                println(x)
                return x
            }
            else -> { throw Exception() }
        }
    }

    fun notCompletedFunction() {
        println("completed")
    }

    // This is a tmp hack solution
    fun hackyFunction() {
        println("hack solution")
    }

    fun unsafeFunction() {
        var user: User? = null
        println(user!!.name)
    }
}

class User {
    val name = "User"
}
