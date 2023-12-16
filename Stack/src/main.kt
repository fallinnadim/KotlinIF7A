fun main() {
    val stack = StackImpl<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
    }
    print(stack)

    val poppedElement = stack.pop()
    if (poppedElement != null) {
        println("Popped : $poppedElement")
    }
    print(stack)

    val list = listOf("A", "B", "C", "D")
    val stack2 = StackImpl.create(list)
    print(stack2)

    val stack3 = stackOf("A", "B", "C", "D")
    print(stack3)
}