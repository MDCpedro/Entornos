import pygame
import elementos
# Iniciamos juego y pantalla

pygame.init()
tamanyo_pantalla = (900, 700)
pantalla = pygame.display.set_mode(tamanyo_pantalla)
pantalla.fill((4,255,255))

# Configuramos reloj y FPS

running = True
FPS = 60
reloj = pygame.time.Clock()

# Creamos los sprites

posicion = (200, 300)
grupo_sprites_todos = pygame.sprite.Group()
grupo_sprites_todos.add(elementos.Plataforma((200,300)))



# Bucle principal del juego

while running:
    reloj.tick(FPS)
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
     
    # Pintamos pantalla

    pantalla.fill((24,5,5))
    grupo_sprites_todos.draw(pantalla)
         



pygame.quit()

