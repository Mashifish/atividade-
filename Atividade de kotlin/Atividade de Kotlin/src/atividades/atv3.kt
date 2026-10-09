package atividades

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    validarBioInfantil("Adoro assistir desenhos animados!") // Bio aceita
    validarBioInfantil(null) // Bio aceita (tamanho 0)
    validarBioInfantil("Esta biografia é gigantesca e com certeza vai ultrapassar o limite estabelecido de cinquenta caracteres para contas infantis.") // Bio muito longa
}