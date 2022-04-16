import kotlin.math.max

/*Desenvolva um programa que leia um valor e apresente o número de
Fibonacci correspondente a este valor lido. Lembre-se que os 2 primeiros
elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma
dos 2 anteriores a ele. No final imprima a mensagem "Fib(N) = X", onde X é
o N-ésimo termo da série de Fibonacci.
* */

fun main() {
    println("Informe um número")
    val fibo = readln().toInt()

    fibonacci(fibo)
    fibonacci2(fibo)


}

fun fibonacci(num: Int) {

    var x = 0
    var y = 1
    var contador = 0

    print("Sequencia Fibo = ")

    for (i in 1..num) {
        print("$x ")
        val sum = x + y
        x = y
        y = sum


    }
    println("Fibo(n) = ${(y - x)} ")


}
//Outra forma de fazer Fibonnaci

fun fibonacci2(num: Int) {
    println()
    println("............................Outra forma de fazer Fibonacci................................")
    var x = 0
    var y = 1
    var contador = 0

    print("Sequencia Fibo = ")

    for (i in 1..num) {
        print("$x ")
        x += y
        y = x - y


    }
    println("Fibo(n) = ${(y)} ")
}