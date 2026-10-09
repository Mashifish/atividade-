package atividades

fun main() {
    val calcularGorjeta: (Double?) -> Double = {
        if (it == null || it < 0.0) {
            0.0
        } else {
            it
        }
    }

    println(calcularGorjeta(15.5)) // 15.5
    println(calcularGorjeta(-5.0)) // 0.0
    println(calcularGorjeta(null)) // 0.0
}