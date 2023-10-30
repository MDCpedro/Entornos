A = int (input("Escribe el primer numero, si este es negativo se multiplicaran todos, si no se sumaran. "))
B = int (input("Escribe el segundo numero "))
C = int (input("Escribe el tercer numero "))

suma = A + B + C
producto = A * B * C

if A < 0:
    print(producto)
else:
    print(suma)