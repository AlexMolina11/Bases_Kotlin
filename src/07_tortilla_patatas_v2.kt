fun main() {
    // Creamos array con los productos basicos para hacer una tortilla de patatas
    val ingredientes = arrayOf("patatas","huevos","aceite","sal")
    //Creamos un array vacio con el mismo tamanio que el array de ingredientes
    // de cantidades de cada ingrediente que debemos comprar
    val cantidades = Array<String>(ingredientes.size) {""}

    //Recorremos el array con un forEach
    ingredientes.forEach {
        //Preguntamos al usuario si tiene el ingrediente
        println("¿Tienes ${it}? (s/n)")
        val respuesta = readLine()
        if(respuesta.equals("s", ignoreCase = true)) {
            println("¿Cuántas unidades/cantidades tienes de ${it}?")
            val cantidad = readLine()
            cantidad?.let { it1 -> cantidades[ingredientes.indexOf(it)] = it1 }
        } else {
            println("¿Cuantas unidades necesitas de ${it}?")
            val cantidad = readLine()
            cantidad?.let { it1 -> cantidades[ingredientes.indexOf(it)] = it1 }
        }
    }

    //Imprimimos los ingredientes y las cantidades
    println("Ingredientes y cantidades: ")
    for (i in ingredientes.indices) {
        println("${ingredientes[i]}: ${cantidades[i]}")
    }
}