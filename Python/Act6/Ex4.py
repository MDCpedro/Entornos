Num = int(0)
CantidadNumeros = -1
Suma = 1
while Num != -1:
    if Num > -1:
        Num = int(input("Escribe diferentes numeros, cuando acabes pon -1 "))
        CantidadNumeros = CantidadNumeros+1
        Suma = Suma+Num
    else:
        print("No se aceptan numeros negativos.")
        Num = int(input("Escribe diferentes numeros, cuando acabes pon -1 "))
Resultado = Suma/CantidadNumeros
print("La media es de " +str(Resultado))