// Stack Queue Linked List Co-routines masuk UAS
interface Stack<T> {
    val count: Int
    val isEmpty: Boolean
        get() = count == 0
    fun push(element: T)
    fun pop(): T?
    fun peek(): T?
}

class StackImpl<T>: Stack<T> {
    companion object {
        fun <T> create(items: Iterable<T>): Stack<T> {
            val stack = StackImpl<T>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }
    }
    private val storage: ArrayList<T> = arrayListOf<T>()
    override val count: Int
        get() = storage.size

    override fun pop(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun toString(): String = buildString {
        appendLine("-----top-----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-------------")
    }
}

fun <T> stackOf(vararg elements: T) : Stack<T> {
    return StackImpl.create(elements.asList())
}