Dia = int(input("Escribe que dia es: "))
Mes = int(input("Ahora el mes: "))

if Dia <0 or Dia >31 or Mes <0 or Mes >12:
    print("La fecha es incorrecta")
else:
    print("La fecha es " + str(Dia) + "/" + str(Mes) + "/2023")