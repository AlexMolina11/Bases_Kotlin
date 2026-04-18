fun main(){
    //Declara e inicializa la variable de tipo integer
    val x: Int = 5
    //Val no puede mutar por ello da error.
    //x += 1 //ERROR
    //Declarar e inicializa la variable de tipo integer
    var y: Int = 5
    y += 1

    //Variables ENTERAS
    val one = 1 // Int
    val edad: Int = 48
    println("one $one")
    println("edad $edad")

    val threeBillion = 3000000000 //Long
    println("threeBillion $threeBillion")
    val oneLong = 1L  //Long
    val oneByte: Byte = 1

    //Variables DECIMALEs
    val pi = 3.14 //Double
    println("pi $pi")
    //val one: Double = 1 //Error: type mismatch
    val oneDouble = 1.0 //Double
    val e = 2.7182818284  //Double
    val eFlaoat = 2.7182818284f //Float, actual value is 2.7182817

    //CARACT y STRINg
    val aChar: Char = 'a'
    val str = "Esto es una frase completa" //autom[aticamente se detecta que es un string
    val str2:String = "Esto es una frase completa" //ES UNA BUENA PRACTICA

    //BOOLEANOS O LOGICOS
    val myTrue: Boolean = true
    println("myTrue $myTrue")
    val myFalse: Boolean = false
}