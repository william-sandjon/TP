import java.util.*

fun main(args: Array<String>) {

    val isUnit = println ("Ceci est une expression!")
    println(isUnit); //On affecte à une variable le type de retour

    val temperature = 10
    val isHot = if(temperature>50) true else false // 
    println(isHot)

    val message = "la température est ${if (temperature>50) "too warm" else "OK"}." //la valeur du message est definie
    println(message)

    fun swim(speed: String ="fast"){
        println("swimming $speed")
    } // 

    swim()
    swim("slow")
    swim(speed="turtle-like") // 


    fun shouldChangeWater (day: String, temperature: Int=22, dirty: Int = 20): Boolean{
        return when{
            temperature>30 ->true
            dirty>30 ->true
            day == "Dimanche" ->true
            else->false
        }
    } // 

    fun fishFood(day: String): String{
        var food=""
        when(day){
            "Lundi"->food="biscuit"
            "Mardi"->food="croquette"
            "Mercredi"->food="Rien aunourd'hui"
            "Jeudi"->food="Riz"
            "Vendredi"->food="beignet"
            "Samedi"->food="tu supportes"
            "Dimanche"->food="légumes"
        }
        return food
    }

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun feedTheFish(){
        val day= randomDay()
        val food = fishFood(day)
        println("Aujourd'hui nous sommes $day et le poisson mangera $food")
        println("Faut-il changer l'eau?: ${shouldChangeWater(day)}")
    }//

    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Dimanche" // Nous définissons ici des fonctions compactes.

    fun ShouldChangeWater1 (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else  -> false
        }
    }
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel)) //

    //une autre façon de la déclarer :

    val newWaterFilter: (Int)-> Int = {dirty->dirty/2}

    //Fonctions d'odre supérieure
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }


    fun increaseDirty( start: Int ) = start + 1 //on définit une fonction qui prend un paramère de type Int et l'incrémente.

    println(updateDirty(15, ::increaseDirty)) // un cas d'utilisation d'une fonction d'ordre supérieur où cette dernière prend en paramètre une fonction qui n'est pas une lambda. Il faut pour que ça fonctionne ajouter l'opérateur ::

    var dirtyLevelV2 = 19
    dirtyLevelV2 = updateDirty(dirtyLevelV2) { dirtyLevel -> dirtyLevel + 23} // kotlin préfère que lors de l'utilisation d'une fonction supérieure, la fonction passée en paramètre soit le dernier paramètre. Kotlin a une syntaxe spéciale avec les fonctions
    println(dirtyLevelV2)



}
