import kotlin.math.roundToInt

/*Escreva um algoritmo que leia 15 números do usuário. Ao final exiba
a média dos 15 números. Utilize o comando de repetição Para (For)
* */

fun main() {
    media()
}

fun media() {

    var soma = 0.0
    var media = 0.0
    var contador = 0
    var num = DoubleArray(15)


    num.forEach { i ->
        println("Por gentileza, Informe o ${(contador + 1)} º números")
        num[i.toInt()] = readln().toDouble()
        soma += num[i.toInt()]
        contador++
    }
    media = soma / contador
    println("A média dos números informados é = $media")
}