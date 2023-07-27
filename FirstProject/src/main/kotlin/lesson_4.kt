fun main() {

    // логические операторы
//    val a = 1 + 1 // оператор присваивания
//    val b = (1 == 1) // оператор сравнения

    // <, >, >=, <=, ==, !=
    // true
    // false

    // операторы ссылочного сравнения ===, !==

    val userAge = 20
//    var comparisonResult = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    /* взятие в скобки нужно для удобства чтения или для инфиксных функций (and, or)*/
    var comparisonResult = userAge in AGE_OF_MAJORITY .. RETIREMENT_AGE // тру когда в промежутке (!in когда вне промежутка)
    println("Результат проверки возраста пользователя: $comparisonResult")

    // &&, ||, ! (и, или, не)

    val a = true
    val b = !a
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65