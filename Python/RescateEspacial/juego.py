import pygame
import elementos
# Iniciamos juego y pantalla

pygame.init()
tamanyo_pantalla = (900, 700)
pantalla = pygame.display.set_mode(tamanyo_pantalla)
pantalla.fill((4,6,6))

# Configuramos reloj y FPS

running = True
FPS = 60
reloj = pygame.time.Clock()

# Creamos los sprites

posicion = (200, 300)
grupo_sprites_todos = pygame.sprite.Group() 
grupo_sprites_fondo = pygame.sprite.Group()
grupo_sprites_todos.add(elementos.Plataforma((200,300)))
grupo_sprites_fondo.add(elementos.Fondo())


# Bucle principal del juego

while running:

    # Marcar los FPS

    reloj.tick(FPS)

    # Detectar que cierras el juego

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
     

    #   Capturamos teclas
    teclas = pygame.key.get_pressed()
    grupo_sprites_todos.update(teclas)

    

    # Pintamos pantalla y pasamos frame

    pantalla.fill((24,5,5))
    grupo_sprites_fondo.draw(pantalla)
    grupo_sprites_todos.draw(pantalla)
    pygame.display.flip()




         



pygame.quit()

