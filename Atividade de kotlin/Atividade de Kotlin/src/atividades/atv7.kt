package atividades

fun limparUsuarios(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0 || email.isBlank()) {
            contasInvalidas++
            println("Aviso: Conta com e-mail inválido/nulo será deletada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val emails = listOf("teste@email.com", null, "   ", "usuario@email.com", "")
    limparUsuarios(emails)
}