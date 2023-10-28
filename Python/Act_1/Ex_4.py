A = int (input("Escribe el primer numero "))
B = int (input("Escribe el segundo numero "))
C = int (input("Escribe el tercer numero "))

if A > B and A > C:
    print(A, "es el mayor numero")
elif B > A and B > C:
    print(B, "es el mayor numero")
elif C > A and C > B:
    print(C, "es el mayor numero")
else:
    if B == C and B > A:
        print(B, "es mayor")
    elif A == B and A > C:
        print(A, "es mayor")
    elif A == C and A > B:
        print(C, "es mayor")