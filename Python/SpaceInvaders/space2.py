import pygame
import elementosSpace2
import random
#iniciamos juego
pygame.init()

#creamos pantalla

tamanyo = (800, 600)
pantalla = pygame.display.set_mode(tamanyo)
pantalla.fill((255, 255, 255))

#creamos reloj
reloj = pygame.time.Clock()
FPS = 60
running = True

# sprites

posicion = (200, 200)
ultimo_enemigo_creado = 0

grupo_sprites = pygame.sprite.Group()
grupo_sprites.add(elementosSpace2.Nave((300, 500)))
grupo_sprites.add(elementosSpace2.Fondo)

#bucle principal limitado al frame rate definido
while running:
    reloj.tick(FPS)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
    #pintamos
            
    # capturamos teclas
            
    teclas = pygame.key.get_pressed()
    if teclas[pygame.K_SPACE]:
        Nave.Disparar(grupo_sprites)
    grupo_sprites.update(teclas)

    # pintamos fondo blanco

    pantalla.fill((255,255,255))
    grupo_sprites.draw(pantalla)
    momento_actual = pygame.time.get_ticks()
    if (momento_actual> ultimo_enemigo_creado + 600):
        posicion = (random.randint(0, pantalla.get_width()), 0)
        grupo_sprites.add (elementosSpace2.Enemigo(posicion))
        ultimo_enemigo_creado = momento_actual
    #refrescamos pantalla
    pygame.display.flip()

pygame.quit()
