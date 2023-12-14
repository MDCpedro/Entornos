import pygame
import elementosSpace2
import random
#iniciamos juego
pygame.init()
#creamos dow

tamanyo = (800, 600)
pantalla = pygame.display.set_mode(tamanyo)
pantalla.fill((255, 255, 255))

#creamos reloj
reloj = pygame.time.Clock()
FPS = 60

running = True
posicion = (200, 200)
nave = elementosSpace2.Nave(posicion)
ultimo_enemigo_creado = 0

grupo_sprites = pygame.sprite.Group(nave)
grupo_sprites.add(elementosSpace2.Nave((300, 200)))
grupo_sprites.add(elementosSpace2.Nave((500, 200)))
grupo_sprites.add(elementosSpace2.Nave((400, 200)))
grupo_sprites.add(elementosSpace2.Enemigo((200, 400)))
#bucle principal limitado al frame rate definido
while running:
    reloj.tick(FPS)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
    #pintamos
    teclas = pygame.key.get_pressed()
    grupo_sprites.update(teclas)
    grupo_sprites.draw(pantalla)
    momento_actual = pygame.time.get_ticks()
    if (momento_actual> ultimo_enemigo_creado + 60):
        grupo_sprites.add (elementosSpace2.Enemigo(random.randint(0, pantalla.get_width()), 0))
        ultimo_enemigo_creado = momento_actual
    #refrescamos pantalla
    pygame.display.flip()

pygame.quit()
