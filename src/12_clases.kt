//Definimos una clase
class Car{

}

//Puede ser interesante crear clases vacias sobre cuando se definen plantillas
class Empty

//Todas las clases tienen un constructor por defecto
//Propiedad publica name
class Curstomer(var name:String){
    //variable privada nameUpper
    val nameUpper = name.uppercase()
}

//Definir propiedades publicas y privadas directamente en el constructor
class Person(val firstName:String, val lastName:String, var isEmployed: Boolean = true) {
    // Publicas y mutables todas las de tipo var
    // Publicas y no mutables todas las de tipo val (solo lectura)
}

