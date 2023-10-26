A = int(input("Escribe un numero para calcular su factorial"))
contador = int(A)
resultado= 1
while contador > 0:
    resultado= resultado*contador
    contador= contador-1

print("Factorial = " +str(resultado))
    