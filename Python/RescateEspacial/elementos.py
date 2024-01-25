import pygame
from typing import Any


# Creamos la plataforma, o nave.

class Plataforma(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        imagenes_cargadas = pygame.image.load("RescateEspacial\\imagenes\\Captura.PNG")
        self.image = imagenes_cargadas
        self.rect = self.image.get_rect()
        self.rect.topleft = posicion
    
    def update(self, *args: Any, **kwargs: Any):
        teclas = args[0]
        pantalla = pygame.display.get_surface()
        
        if teclas[pygame.K_LEFT]:
            self.rect.x -= 7
            self.rect.x = max(0, self.rect.x)
        if teclas[pygame.K_RIGHT]:
            self.rect.x += 7
            self.rect.x = min(pantalla.get_width()-self.image.get_width(), self.rect.x)
        if teclas[pygame.K_UP]:
            self.rect.y -= 7
            self.rect.y = max(0, self.rect.y)
        if teclas[pygame.K_DOWN]:
            self.rect.y += 7
            self.rect.y = min(pantalla.get_height()-self.image.get_height(), self.rect.y)

# Creamos el fondo
        
class Fondo(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        imagen = pygame.image.load("RescateEspacial\\imagenes\\cielo.jpg")
        pantalla = pygame.display.get_surface()
        self.image = pygame.transform.scale(imagen, (pantalla.get_width(), pantalla.get_height()))
        self.rect = self.image.get_rect()
        self.rect.topleft = (0,0)