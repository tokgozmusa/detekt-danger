

class DetektDemo {

    companion object {
        private const val SUCCESS = 200
    }

    fun isHTTPSuccess(statusCode: Int): Boolean = statusCode == SUCCESS

    fun veryLongFunction() {
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
            else -> { throw TestException("problem") }
        }
    }

    fun notCompletedFunction() {
        println("completed")
    }

    fun unsafeFunction() {
        var user: User? = null
        println(user?.name)
    }
}

class User {
    val name = "User"
}

class TestException(message: String) : Exception(message)
