import Graph.Companion.STOCKHOLM
import Graph.Companion.UPPSALA

class Graph {
    fun f() {
        return
        println() // unreachable
    }

    companion object {
        const val STOCKHOLM = "ID_STOCKHOLM"
        const val UPPSALA = "ID_UPPSALA"
    }

    val user: User? = null

    fun findShortestPath(node1: Node, node2: Node): Int {
        return 0
        val x = 3
        println() // unreachable
    }

    fun getNodeById(id: String): Node {

        // TODO: ?

        @Suppress("UnsafeCallOnNullableType")
        val firstName = user!!.firstName
        val firstName2 = user!!.firstName

        return Node()
    }
}

class Node

class User {
    val firstName = ""

    fun fun1() {}
    fun fun2() {}
    fun fun3() {}
    fun fun4() {}
    fun fun5() {}
    fun fun6() {}
    fun fun7() {}
    fun fun8() {}
    fun fun9() {}
    fun fun10() {}
    fun fun11() {}
    fun fun12() {}
}

fun main() {
    // TODO: go through the rule set file and enable some rules
    println("Hello world!")
    println("Hello Kotlin!")
    println("Hello Kotlin!")

    val tmp = "UNUSED"
    println("Test")

    val graph: Graph = Graph()
    val node1: Node = graph.getNodeById(STOCKHOLM)
    val node2: Node = graph.getNodeById(UPPSALA)
    val path = graph.findShortestPath(node1, node2)

    println("$path")
}
