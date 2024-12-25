while True:
    try:
        lado1 = float(input("Por favor digite o comprimento do primeiro lado do triângulo: "))
        break
    except ValueError:
        print("Por favor digite um número válido, usando o ponto como separador decimal")

while True:
    try:
        lado2 = float(input("Por favor digite o comprimento do segundo lado do triângulo: "))
        break
    except ValueError:
        print("Por favor digite um número válido, usando o ponto como separador decimal")

while True:
    try:
        lado3 = float(input("Por favor digite o comprimento do terceiro lado do triângulo: "))
        break
    except ValueError:
        print("Por favor digite um número válido, usando o ponto como separador decimal")

if lado1 == lado2 and lado1 == lado3:
    print("O triângulo é equilátero")
elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
    print("O triângulo é isósceles")
else:
    print("O triângulo é escaleno")
