from typing import Any
import pygame
from pygame.sprite import _Group

class Nave(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        self.imagenes_cargadas = [pygame.image.load("avion.png"),
                             pygame.image.load("avion2.png")]
        self.indice = 0
        self.image = self.imagenes_cargadas[self.indice]
        self.contador = 0
        self.rect = self.image.get_rect()
        self.rect.topleft = posicion

    def update(self, *args: Any, **kwargs: Any):
        teclas = args[0]
        pantalla = pygame.display.get_surface()
        if teclas[pygame.K_LEFT]:
            self.rect.x -= 5
            self.rect.x = max(0, self.rect.x)
        if teclas[pygame.K_RIGHT]:
            self.rect.x += 5
            self.rect.x = min(pantalla.get_width(), self.rect.x)

        # aqui
        self.contador = (self.contador + 7) % 40
        self.indice = self.contador // 20
        self.image = self.imagenes_cargadas[self.indice]

    def Disparar(self, grupo_sprites):
        bala = Bala(self.rect.x + self.image.get_width() / 2, self.rect.y)
        grupo_sprites.add(bala)


class Enemigo(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        self.imagenes_cargadas = [pygame.image.load("avion.png"),
                             pygame.image.load("avion2.png")]
        self.indice = 0
        self.contador = 0
        self.image = pygame.transform.rotate(self.imagenes_cargadas[self.indice], 180)
        self.rect = self.image.get_rect()
        self.rect.topleft = posicion
    
    def update(self, *args: Any, **kwargs: Any):
        self.rect.y += 1
        self.contador = (self.contador + 7) % 40
        self.indice = self.contador // 20
        self.image = self.imagenes_cargadas[self.indice]
        pantalla = pygame.display.get_surface()
        if (self.rect.y > pantalla.get_height()):
            self.kill()

class Fondo(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        # cargamos la imagen
        imagen = pygame.image.load("avion.png")
        # capturamos la pantalla
        pantalla = pygame.display.get_surface()
        self.image = pygame.transform.scale(imagen (pantalla.get_width))
        self.rect = self.image.get_rect()
        self.rect.topleft = (0,0)

class Bala(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        # creamos rectangulo
        self.image = pygame.Surface((5, 10))
        self.image.fill((255,0,0))
        self.rect = self.image.get_rect()
        self.rect.center = posicion
    
    def update(self, *args: Any, **kwargs: Any):
        self.rect.y -= 5
        