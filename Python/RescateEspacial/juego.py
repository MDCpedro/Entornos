import pygame
import elementos
import random
# Iniciamos juego y pantalla

pygame.init()
tamanyo_pantalla = (900, 800)
pantalla = pygame.display.set_mode(tamanyo_pantalla)
pantalla.fill((4,6,6))

# Configuramos reloj y FPS

running = True
FPS = 60
reloj = pygame.time.Clock()
ultimo_enemigo_creado = 0

# Creamos un numero aleatorio para la generacion de meteoritos y astronautas

numero_aleatorio = random.randint(1, pantalla.get_width())


# Ponemos posiciones

posicion = (200, 300)
posicion_spawn = (numero_aleatorio, 0)

# Creamos grupos

grupo_sprites_todos = pygame.sprite.Group() 
grupo_sprites_meteoritos = pygame.sprite.Group()

# Añadimos los sprites

grupo_sprites_todos.add(elementos.Fondo())
grupo_sprites_todos.add(elementos.Plataforma((200,300)))
meteorito = elementos.Meteorito(posicion_spawn) 



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

    # Pintamos pantalla y grupos de sprites y pasamos frame

    pantalla.fill((24,5,5))
    grupo_sprites_todos.draw(pantalla)
    pygame.display.flip()

    
    momento_actual = pygame.time.get_ticks()
    if (momento_actual > ultimo_enemigo_creado + 600):
        numero_aleatorio = random.randint(1, pantalla.get_width())
        posicion_spawn = (numero_aleatorio, 0)
        meteorito = elementos.Meteorito(posicion_spawn) 
        grupo_sprites_meteoritos.add(meteorito)
        grupo_sprites_todos.add(meteorito)
        ultimo_enemigo_creado = momento_actual



         
pygame.quit()

