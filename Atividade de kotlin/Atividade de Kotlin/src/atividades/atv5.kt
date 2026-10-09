package atividades

fun avaliarMotorista(nota: Int?) {
    val notaFinal = nota ?: 0

    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}

fun main() {
    avaliarMotorista(5)   // Excelente corrida!
    avaliarMotorista(2)   // Precisamos melhorar.
    avaliarMotorista(null) // Nenhuma avaliação fornecida.
}