Numero = int(1)
NumeroMax = -9999999
NumeroMin = 9999999
Suma = 0
CantidadNumeros = -1
while Numero != 0:
    Numero = int(input("Escribe un numero, cuando acabes pon 0" ))
    CantidadNumeros = CantidadNumeros+1
    Suma = Suma + Numero
    if Numero > NumeroMax:
        NumeroMax = Numero
    elif Numero < NumeroMin and Numero != 0:
        NumeroMin = Numero

ResultadoMedia = Suma/CantidadNumeros
print("La media de estos es " +str(ResultadoMedia)+ " , el mayor numero es " +str(NumeroMax)+ " , el menor numero es " +str(NumeroMin))