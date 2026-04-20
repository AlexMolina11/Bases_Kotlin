fun main() {
    // when como expresion
    val dia = 3
    val diaNombre = when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Dia no valido"
    }

    println("El dia $dia es: $diaNombre")

    //When como sentencia o declaracion
    val numero = 5
    when (numero) {
        in 1..10 -> println("$numero esta entre 1 y 10")
        in 11..20 -> println("$numero esta entre 11 y 20")
        else -> println("$numero esta fuera de rango")
    }

    //when con  varios casos para el mismo resultado
    val letra = 'A'
    when (letra) {
        'A', 'E', 'I', 'O', 'U' -> println("$letra es una vocal")
        else -> println("$letra es una consonante")
    }

    //When con rangos de valores
    val edad = 25
    when (edad) {
        in 0..12 -> println("Niño")
        in 13..19 -> println("Adolescente")
        in 20..64 -> println("Adulto")
        else -> println("Anciano")
    }

    // when con condiciones booleanas
    val temperatura = 30
    when {
        temperatura < 0 -> println("Hace mucho frio")
        temperatura in 0..15 -> println("Hace frio")
        temperatura in 16..25 -> println("Hace una temperatura agradable")
        else -> println("Hace calor")
    }

    //When con comprobacion de tipos
    val valor = "Hola"
    when (valor) {
        is String -> println("Es una cadena de texto: $valor")
        is Int -> println("Es un numero entero: $valor")
        else -> println("Tipo desconocido")
    }

    
}