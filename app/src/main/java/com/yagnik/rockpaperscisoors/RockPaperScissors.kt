fun main() {
  var compterChoice = ""
  var playerChoice = ""





  println("Rock,Paper and scissors , Enter your choice ")
  playerChoice = readln()

  while (playerChoice !in arrayOf("Rock","Paper","Scissor")){
    println("Your choice is invalid")
    playerChoice = readln()
  }

    val randomNumber= (1..3).random()

    when(randomNumber) {
      1 -> {
        compterChoice = "Rock"
      }
      2 -> {
        compterChoice = "Paper"
      }
      3 -> {
        compterChoice = "Scissor"
      }

    }
    println(compterChoice)
    val winner = when {
      playerChoice == compterChoice -> "tie"
      playerChoice == "Rock" && compterChoice == "Scissor" -> "Player"
      playerChoice == "Paper" && compterChoice == "Rock" -> "Player"
      playerChoice == "Scissor" && compterChoice == "Paper" -> "Player"
      else -> "Computer"
    }
      if(winner == "tie"){
        println("Its a Tie")
      }
      else{
        println(" Congratulations $winner won " )
      }
       print("Hellow")
  print("Ok")
  println("Local change")
  println("Experimental ")

}