A = int(input("Escribe un numero: "))
B = int(input("Escribe el segundo numero: "))

Division1 = A/B
Division2 = B/A 

if A>B or A==B:
    print("El resultado es: " + str(Division1))
elif B>A:
    print("El resultado es: " + str(Division2))