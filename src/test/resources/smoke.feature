Feature:
  Como jugador
  quiero que el juego me de la bienvenidad
  para engancharme al juego

  Scenario: veo la pantalla de bienvenida
    Given ingreso al juego
    Then veo el mensaje "Hola Mundo"
