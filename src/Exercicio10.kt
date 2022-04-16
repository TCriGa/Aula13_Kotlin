/*Escreva um algoritmo que calcule a soma dos números de 1 a 15.
Utilize o comando de repetição Do While
* */

fun main() {
    var i = 1
    var soma = 0
    do {
        soma += i
        i++
    }while (i <= 15)

    println("O valor da soma de 1 á 15 é $soma")
}