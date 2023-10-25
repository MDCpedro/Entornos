contador = 3
pwd = "eureka"
acierto = False

while contador != 0 and acierto == False:
    pwd = str(input("Escribe la contraseña: "))
    if pwd != "eureka" and contador > 0:
        contador = contador-1
        print("Contraseña incorrecta, intentalo de nuevo.")

    elif pwd == "eureka":
        acierto = True

    elif contador == 0:
        print("Intentos agotados.")
        