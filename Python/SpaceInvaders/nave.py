import pygame

class Nave:
    def __init__(self) -> None:
        self.x = 30
        self.y = 30
        imagenes_cargadas = [pygame.image.load("avion.png"),
                             pygame.image.load("avion2.png")]
        self.imagenes = [pygame.transform.scale(imagenes_cargadas[0], (120, 200)),
                         pygame.transform.scale(imagenes_cargadas[1], (120, 200))]
        self.contador = 0

    def moverDer(self, pantalla):
        self.x += 12
        limite = pantalla.get_width()
        self.x = min(self.x, limite - self.imagenes[0].get_width())
    
    def moverIzq(self):
        self.x -= 12
        limite = 0    
        self.x = max(self.x, limite)  
    
    def dibujar(self, pantalla):
        self.contador = (self.contador + 1) % 40
        pantalla = pygame.display.get_surface()
        seleccionada = self.contador // 20
        pantalla.blit(self.imagenes[seleccionada], (self.x, self.y))
