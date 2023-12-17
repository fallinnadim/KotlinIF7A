interface QueueInterface<T> {
    val count: Int
    val isEmpty: Boolean
        get() = count == 0
    fun enqueue(element: T)
    fun dequeue(): T?
}

class Queue<T>: QueueInterface<T> {
    private val storage: ArrayList<T> = arrayListOf<T>()
    override val count: Int
        get() = storage.size

    override fun dequeue(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(0)
    }


    override fun enqueue(element: T) {
        storage.add(element)
    }

    override fun toString(): String = buildString {
        appendLine("-----Visualisasi Queue First in First Out-----")
        append("*Rear* ")
        storage.asReversed().forEach {
            append("|$it|")
        }
        append(" *Front*")
    }
}