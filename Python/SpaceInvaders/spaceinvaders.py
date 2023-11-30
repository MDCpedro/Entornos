import pygame

pygame.init()
pantalla = pygame.display.set_mode((1000,800))

salir = False

imagen_avion = pygame.image.load("Python/SpaceInvaders/avion.png")
avion = pygame.transform.scale(imagen_avion, (120,120))

posIzq = 30
posTop = 30

while not salir:
    # gestionar eventos
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            salir = True
    
    teclas = pygame.key.get_pressed()
    if teclas[pygame.K_LEFT]:
        posIzq -= 1
    if teclas[pygame.K_RIGHT]:
        posIzq += 1
    if teclas[pygame.K_UP]:
        posTop -= 1
    if teclas[pygame.K_DOWN]:
        posTop += 1

    # gestionar cambios
    pantalla.fill((255,255,255))
    pantalla.blit(avion, (posIzq, posTop))

    # redibujar el juego
    pygame.display.flip()

pygame.quit()