import pygame
import nave
pygame.init()
pantalla = pygame.display.set_mode((1000,800))

salir = False
clock = pygame.time.Clock()
posIzq = 30
posTop = 30
nave = nave.Nave()
while not salir:
    clock.tick(200)
    # gestionar eventos
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            salir = True
    
    teclas = pygame.key.get_pressed()
    if teclas[pygame.K_LEFT]:
        nave.moverIzq()
    if teclas[pygame.K_RIGHT]:
        nave.moverDer(pantalla)
   

    pantalla.fill((255,255,255))
    nave.dibujar(pantalla)

    pygame.display.flip()

pygame.quit()