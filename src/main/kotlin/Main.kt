import java.util.*
//fun main(args: Array<String>) {
  //  println("Hello, ${args[0]} ")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")
//}  // affiche hello world

// affiche hello "argument de la fonction"

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun main(args: Array<String>){
    feedTheFish()
}

fun randomDay() : String {  // fonction randDay qui retourne un jour de la semaine
    val week = arrayOf("lundi", "mardi", "mercredi", "vendredi", "samedi", "dimanche")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    var food = ""
    when (day) {  // on fait le meme chose en utilisant la fonction when
        "lundi" -> food = "flakes"
        "mardi" -> food = "pellets"
        "mercredi" -> food = "redworms"
        "jeudi" -> food = "arachide"
        "vendredi" -> food = "mosquitos"
        "samedi" -> food = "lettuce"
        "dimanche" -> food = "planktom"
    }
    return food
}
fun feedTheFish() {
    val day = randomDay ()
    val food = fishFood (day)
    println("Toady is $day and thr fish is $food")
}