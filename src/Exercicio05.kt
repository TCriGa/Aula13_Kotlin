/*Faça um programa que receba de lista de compras sendo que a
pessoa usuária irá inserir a quantidade de itens que quer adicionar
na lista de compras e após inserir a quantidade o programa deverá
permitir que o usuário insira os produtos nessa lista. Exiba a lista
completa para o usuário.
* */

fun main() {
    listaCompras()

}

fun listaCompras() {
    println("Informe a quantidade de itens que deseja adicionar a sua lista de compras")
    var listaC = readln().toInt()

    var nLista = arrayOfNulls<String>(listaC)

    itensLista(nLista)
}

fun itensLista(itens: Array<String?>) {

    for (nprodutos in itens.indices) {
        println("Informe o ${(nprodutos + 1)} º produto da sua lista ")
        itens[nprodutos] = readln()

    }

    println("-----------------*Lista de Compras*---------------------------")

    for (nprodutos in itens.indices) {
        println("O ${(nprodutos + 1)} º produto é: ${itens[nprodutos]}")

    }

}



