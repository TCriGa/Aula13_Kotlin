/*Escreva um algoritmo que leia um número inteiro (de 1 a 7)
representando o dia da semana e informe o nome do dia correspondente.
* */

fun main() {
diasSemana()
}
fun diasSemana (){

    val diasDaSemana = intArrayOf(1)
    val soma = 0


    for (numSemana : Int in diasDaSemana.indices){
        println("Infome um número inteiro de 01 a 07")
        diasDaSemana[numSemana] = readln().toInt()

        if (diasDaSemana[numSemana] == 1){
            println("É Segunda-Feira")
        }
        else if (diasDaSemana[numSemana] == 2){
            println("É Terça-Feira")
        }
        else if (diasDaSemana[numSemana] == 3) {
            println("É Quarta-Feira")

        }
        else if (diasDaSemana[numSemana] == 4) {
            println("É Quinta-Feira")
        }
        else if (diasDaSemana[numSemana] == 5) {
            println("É Sextouuu")
        }
        else if (diasDaSemana[numSemana] == 6) {
            println("É Sábado")
        }
        else if (diasDaSemana[numSemana] == 7) {
            println("É domingo")
        }
        else println("Número inválido")
    }

}