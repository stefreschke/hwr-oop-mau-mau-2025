package hwr.oop.mau_mau.core

/**
 * Games are mutable!
 */
class Game(
  private val players: List<Player>,
) {
  private val playerHandMap: Map<Player, Hand> = players.associateWith { Hand() }
  private var nextPlayer: Player = players.first()
  private val stack = Stack()
  
  init {
    playerHandMap.forEach { (_, hand) ->
      hand.add(stack.take(7))
    }
  }
  
  // Queries
  
  fun players(): Collection<Player> = players
  
  fun isFinished(): Boolean {
    TODO("""
      A Game is finished, if the Hand of a Player is empty.
    """)
  }
  
  fun turn(): Player? {
    return nextPlayer
  }
  
  fun topCard(): Card {
    TODO("In a Game, there is always a Card laying ontop its Pile!")
  }
  
  fun handOf(player: Player): Hand {
    return playerHandMap[player] ?: throw IllegalArgumentException(
      "Player $player is not part of this game!"
    )
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
  
  fun pickUp(player: Player) {
    val handOfPlayer = playerHandMap[player] ?: throw PlayerOutOfTurnException(player)
    handOfPlayer.add(stack.take(1))
  }
  
}

class PlayerOutOfTurnException(
  player: Player
): RuntimeException(
  "$player is not in turn!"
)
