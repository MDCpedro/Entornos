import pygame
from typing import Any

class Plataforma(pygame.sprite.Sprite):
    def __init__(self, posicion):
        super().__init__()
        imagenes_cargadas = pygame.image.load("Python\\RescateEspacial\\imagenes\\Captura.PNG")
        self.image = imagenes_cargadas
        self.rect = self.image.get_rect
