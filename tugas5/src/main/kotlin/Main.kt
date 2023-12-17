fun main() {
    // Soal 2
    println("Soal 2")
    "Insert pada Linked List" example {
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        println("Before inserting: $list")
        var lastNode = list.nodeAt(list.size-1)!!
        for (i in 1..3) {
            lastNode = list.insert(-1 * i, lastNode)
        }
        println("Linked List saat ini ${list.display()}")
    }

    // Soal 3
    println("Soal 3")
    val stack = Stack<String>()
    val kondisi = if (stack.isEmpty) "Kosong" else "Tidak Kosong"
    println("Kondisi stack saat ini $kondisi")
    stack.push("Terima")
    stack.push("Kasih")
    stack.push("Pak")
    stack.push("Yohannes")
    stack.push("^_^")
    println("Stack saat ini")
    print(stack)
    val poppedElement = stack.pop()
    if (poppedElement != null) {
        println("Elemen yang dikeluarkan : $poppedElement")
    }
    println("Stack saat ini")
    print(stack)
    // Soal 4
    println("Soal 4")
    val queue = Queue<Int>()
    val kondisi2 = if (queue.isEmpty) "Kosong" else "Tidak Kosong"
    println("Kondisi queue saat ini $kondisi2")
    queue.enqueue(13)
    queue.enqueue(51)
    queue.enqueue(35)
    queue.enqueue(47)
    queue.enqueue(89)
    println("Queue saat ini")
    print(queue)
    val dequeueElement = queue.dequeue()
    if (dequeueElement != null) {
        println("\nElemen yang dikeluarkan : $dequeueElement")
    }
    println("Queue saat ini")
    print(queue)
}



