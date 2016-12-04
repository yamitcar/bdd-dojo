Feature: start app
  As a player
  I want that the game show a welcome message
  To know it is the game that i want to play

  Scenario: See welcome screen
    When open the game
    Then i want to see "Hola Mundo"
