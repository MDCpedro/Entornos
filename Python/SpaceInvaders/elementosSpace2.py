from typing import Any
import pygame
pantalla = pygame.display.get_surface()
class Nave(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        self.image = pygame.image.load("./Python/Spaceinvaders/avion.png")
        self.rect = self.image.get_rect()
        self.rect.topleft = posicion

    def update(self, *args: Any, **kwargs: Any):
        teclas = args[0]
        if teclas[pygame.K_LEFT]:
            self.rect.x -= 2
            self.rect.x = max(0, self.rect.x)
        if teclas[pygame.K_RIGHT]:
            self.rect.x += 2
            self.rect.x = min(pantalla.get_width(), self.rect.x)

class Enemigo(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        imagen = pygame.image.load("./Python/Spaceinvaders/avion.png")
        self.image = pygame.transform.rotate(imagen, 180)
        self.rect = self.image.get_rect()
        self.rect.topleft = posicion