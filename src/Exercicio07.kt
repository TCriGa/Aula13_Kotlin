/*Escreva um programa que pergunte para a pessoa usuária quantos alunos
tem na sala dela. Em seguida, através de um laço while, pessa a pessoa
usuária para que entre com as notas de todos os alunos da sala, um por
vez. Por fim, o programa mostra a nota média da turma
* */

fun main() {
    println("Quantas alunos tem na sua sala? ")
    val n = readln().toDouble()

    val numAlunos = DoubleArray(n.toInt())

    notasAlunos(numAlunos)
}

fun notasAlunos(numAlunos: DoubleArray) {

    var notas = 0
    var media = 0.0
    var soma = 0.0

    while (notas in numAlunos.indices) {
        println("Informe a nota do ${(notas + 1)} aluno:")
        numAlunos[notas] = readln().toDouble()
        soma += numAlunos[notas]

        notas++
   }

    media = soma / notas
    println(media)

}




