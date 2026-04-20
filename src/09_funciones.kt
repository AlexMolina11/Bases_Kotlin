fun main() {
    //uso de funciones
    val valorX:Int = 2;
    val valorY:Int = 1;
    val resultadoDoble = simpleDouble(valorX)

    val resultSumaPon = sumaPon(valorX, valorY)
    println("La suma pondrada de $valorX,$valorY es $resultSumaPon")

    val sumaPonDef = sumaPonDef(valorX)

    //Usamos saludar
    saludar()   // Hola, mundo
    saludar("Ana", veces = 2)    //Hola, Ana (x2)
    saludar(veces = 3, nombre = "Luis") //Orden libre con nombre
}

//Kotlin functions are declared using the fun keyword:
fun simpleDouble(x: Int): Int {
    return 2 * x
}

fun double(x: Int): Int = x *2   //Otra forma, _Single expresion

// Suma ponderada de dos parametros
// Function parameters are defined using Pascal notation - name: type.
// Parameters are separated using commas, and each parameter must be explicitly typed:
fun sumaPon(x: Int, y: Int): Int {
    return (2 * x)+y
}

//Suma ponderada de dos parametros con valor por defecto
fun sumaPonDef(x: Int, y:Int=0): Int {
    return (2 * x)+y
}

// Parametros por defecto y argumentos con nombre
fun saludar(nombre: String = "Mundo", veces: Int = 1) {
    //Repeat en Kotlin es una funcion estandar para ejecutar un bloque de codigo N veces.
    // repeat(times) { index -> codigo a repetir }
    repeat(veces) { println("Hola, $nombre")}
}

