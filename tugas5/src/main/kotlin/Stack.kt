interface StackInterace<T> {
    val count: Int
    val isEmpty: Boolean
        get() = count == 0
    fun push(element: T)
    fun pop(): T?
}

class Stack<T>: StackInterace<T> {
    private val storage: ArrayList<T> = arrayListOf<T>()
    override val count: Int
        get() = storage.size

    override fun pop(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }


    override fun push(element: T) {
        storage.add(element)
    }

    override fun toString(): String = buildString {
        appendLine("-----Visualisasi Stack Last in First Out-----")
        appendLine("-----top-----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-------------")
    }
}