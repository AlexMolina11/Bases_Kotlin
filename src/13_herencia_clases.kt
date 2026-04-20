//Clase padre
//Todas las clases por defecto son finales (no pueden ser heredables)
//Para que puedan ser heredables deben tener la palabra OPEN
open class Personaje(val nombre:String){
    fun comoMeLlamo(){
        println("Me llamo $nombre")
    }
    //funcion heredable con la palabra OPEN
    open fun accion(){
        println("$nombre realiza una accion")
    }
}

// Clase hija de Personajes
//Debemos pasarle los mismos parametros tanto en la nueva clase como la heredada
// y podemos agregar propiedades unicas de la nueva clase
class Heroe(nombre:String, val poder:String) : Personaje(nombre){
    // si quisiera sobreescribir la funcion accion me dara error porque no es sobre escribile para ello
    // la funcion heredable debe tener la palabra OPEN tambien. y agregarle la palabra override
    // a la funcion a heredar
    override fun accion(){
        println("El hero $nombre usa el superpoder $poder")
    }
}

//Clase hija para villanos
class Villano(nombre:String, val maldad: String) : Personaje(nombre) {
    //Sobreescribimos la funcion para definir el comportamiento del villano
    override fun accion(){
        println("$nombre, el villano, ejecuta su plan de $maldad.")
    }
}

// Lanzamos el programa
fun main(){
    //no hace falta poner el NEW
    val patriota = Heroe ("Patriota", "Todos")
    patriota.accion()

    val villano = Villano("Oscuro", "fuerza")
    villano.maldad
}