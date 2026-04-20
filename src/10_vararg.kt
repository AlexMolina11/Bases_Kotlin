fun main() {
    imprimirTodos("hola", "que", "tal")

    val total = suma(1,2,3,4) //10
    println("La suma es $total")

    //Pasar un array a un vararg (spread operator *)
    //si ya tienes un array y quieres pasarlo como varargs, necesitas el *
    val arr = doubleArrayOf(1.0, 2.0, 3.0)
    val p = promedio(*arr)

    log("INFO", "Arrancando", "Modulo", "X")
}

//Sintaxis basica de una funcion varargs
//Dentro de la funcion, palabras se comporta como un array
fun imprimirTodos(vararg palabras: String) {
    for (p in palabras) println(p)
}

//Ejemplo tipico: sumar muchos numeros
fun suma(vararg nums: Int): Int = nums.sum()
fun promedio(vararg nums: Double) = nums.average()

//Vararg con otros parametros
fun log(tag: String, vararg msg: String) {
    println("[$tag] " + msg.joinToString(" "))
}