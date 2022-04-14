/**
 * Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, calcule e apresente
 * a soma destes valores.
 */

fun main() {

soma()
}

fun soma (){
    var soma1 =0
    for (listaNumeros : Int in 1..5) {
        println("Informe um $listaNumeros número: ")
        val n = readln().toInt()
        var listaN1 = arrayListOf<Int>(n)

        listaN1.forEach{somaN ->
            soma1 += somaN
        }
    }
    println(soma1)
}




