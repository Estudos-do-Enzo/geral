valor1 = 0
valor2 = 0

while True:
    try:
        valor1 = int(input("Digite o valor 1: "))
        break
    except ValueError:
        print("Por favor digite um número")

while True:
    try:
        valor2 = int(input("Digite o valor 2: "))
        break
    except ValueError:
        print("Por favor digite um número")


print(valor1)
print(valor2)