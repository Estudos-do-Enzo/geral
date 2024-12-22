while True:
    try:
        valor1 = float(input("Digite o valor 1: "))
        break
    except ValueError:
        print("Por favor digite um número válido")

while True:
    try:
        valor2 = float(input("Digite o valor 2: "))
        break
    except ValueError:
        print("Por favor digite um número válido")

while True:
    try:
        valor3 = float(input("Digite o valor 3: "))
        break
    except ValueError:
        print("Por favor digite um número válido")

valores_ordenados = [valor1, valor2, valor3]
valores_ordenados.sort()
print("Os valores ordenados são:", valores_ordenados[0], ",", valores_ordenados[1], ",", valores_ordenados[2])