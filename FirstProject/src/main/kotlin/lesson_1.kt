fun main(args: Array<String>) {
    //println("Hello World!")
    val numberOfOrders1: Int  = 42 //число нельзя изменить в дальнейшем, потому, что ключевое слово val
//    val a = 0L
    var notificationText: String = "Это текст" //текст можно изменить в дальнейшем, потому, что ключевое слово var

    println(numberOfOrders1)
//    println(notificationText)

    notificationText = "Это заново присвоенный текст"
    println(notificationText)

    // числовые
    val intNum1: Int = -2147483648 //32 bit
    val intNum2: Int = 2147483647 //32 bit
    val longNum: Long //64 bit
    val shortNum: Short //16 bit
    val byteNum: Byte //8 bit
    val unsignedNum: UInt = 2147483648u //32 bit

    // вещественные
    val doubleNum: Double = 234.425 //64 bit
    val floatNum: Float = 31.57f //32 bit

    // строковые
    val stringValue: String = "Строка"
    val charValue: Char = 'f' //символ

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}