import pygame
from typing import Any
from pygame.sprite import _Group

# Creamos la plataforma, o nave.

class Plataforma(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        imagenes_cargadas = pygame.image.load("RescateEspacial\\imagenes\\Captura.PNG")
        self.image = imagenes_cargadas
        self.rect = self.image.get_rect()
        self.rect.topleft = posicion

# Creamos el fondo
        
class Fondo(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        imagen = pygame.image.load("RescateEspacial\\imagenes\\cielo.jpg")
        pantalla = pygame.display.get_surface()
        self.image = pygame.transform.scale(imagen, (pantalla.get_width(), pantalla.get_height()))
        self.rect = self.image.get_rect()
        self.rect.topleft = (0,0)