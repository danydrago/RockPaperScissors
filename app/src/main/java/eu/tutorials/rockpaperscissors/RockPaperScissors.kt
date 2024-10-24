package eu.tutorials.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, Scissors? Enter you choice:")
    playerChoice = readln().lowercase().trim()
    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("Invalid choice. Please enter Rock, Paper, or Scissors:")
        playerChoice = readln().lowercase().trim()
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "rock"
        }

        2 -> {
            computerChoice = "paper"
        }

        else -> {
            computerChoice = "scissors"
        }
    }
    println("Computer choice: ${computerChoice.uppercase()}")

    val winner = when {
        playerChoice == computerChoice -> "It's a tie!"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "It's a tie!") {
        println("It's a tie!")
    } else {
        println("$winner wins!")
    }


}