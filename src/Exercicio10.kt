/*Escreva um algoritmo que calcule a soma dos números de 1 a 15.
Utilize o comando de repetição Do While
* */

fun main() {
    var i = 1
    var soma = 0
    while (i in 1..15){
        soma += i
        i++
    }

    println("O valor da soma de 1 á 15 é $soma")
}