package hwr.oop.mau_mau.core

/**
 * Games are mutable!
 */
class Game {
  
  // Queries
  
  fun players(): Collection<Player> {
    TODO("Players are playing a Game!")
  }
  
  fun isFinished(): Boolean {
    TODO("""
      A Game is finished, if the Hand of a Player is empty.
    """)
  }
  
  fun turn(): Player? {
    TODO("""
      In a Game, there is always a Player that has to play next.
      Only this Player can play. No one else can play.
      If the game is finished, no one has to play next!
    """)
  }
  
  fun topCard(): Card {
    TODO("In a Game, there is always a Card laying ontop its Pile!")
  }
  
  fun handOf(player: Player): Hand {
    TODO("In the context of a Game, a Player has a Hand!")
  }
  
  // Commands
  
  fun lay(player: Player, card: Card) {
    TODO("""
      Player can lay a Card, if:
       - it is his/her turn,
       - the Card is in his/her Hand, and
       - if the Card can be laid upon the Pile's top Card!
    """)
  }
  
  fun pickUp(player: Player): Card {
    TODO("Player can draw, if it is his/her turn")
  }
  
}
