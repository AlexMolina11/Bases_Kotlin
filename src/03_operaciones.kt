fun main(){
    //Creacion de variables
    var edad: Int = 40
    var intervalo: Int = 2
    val paso: Float = 2.5f
    var nombre: String = "Alex"
    var apellido: String = "Molina"
    var numeroTxt: String = "40"

    //Operaciones aritmeticas
    println("Esdad + intervalo=" +(edad+intervalo))
    println("Esdad * intervalo=" +(edad*intervalo))
    println("Esdad / intervalo=" +(edad/intervalo))
    println("Esdad % intervalo=" +(edad%intervalo))

    //Conversiones automaticas de operaciones
    println("Esdad + paso=(Float)" +(edad+paso)) //Conversion a Float
    println("Esdad + paso=(Int)" +(edad+paso.toInt())) //Conversion mediante funcion
    println("numero=(Int)" +(numeroTxt.toInt()))

    //Concatenacion
    println(nombre+" "+apellido)
}