fun main(){
    //CREACION DE ARRAYS
    val nombres = arrayOf("Alex","Omar","Carlos","Pepe")
    val arrayVacio = emptyArray<Int>() //<> indicador generic define que tipo de dato se requiere. Si se deja vacio puede tomar cualquier tipo

    println("nombre[0]=${nombres[0]}") //Aparece la variable entre llaves ya que es un array.${array[]}

    //El contenido del array es MUTABLE
    val simpleArray = Array<Int>(3) { 0 }
    println("simpleArray="+simpleArray.joinToString())

    println("El tamanio de nombres="+nombres.size )

    //RECORRER UN ARRAY
    for (i in 0..nombres.size-1) {
        println("nombres[$i]="+nombres[i])
    }
    for (i in nombres.indices) {
        println("nombres[$i]="+nombres[i])
    }

    // Recorrer un array con forEach
    nombres.forEach { println(it) }
}