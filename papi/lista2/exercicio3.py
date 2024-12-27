print("Faremos a soma de 2 números")

while True:
    try:
        numero1 = int(input("Por favor informe o primeiro número: "))
        break
    except ValueError:
        print("Por favor informe um número válido.")

while True:
    try:
        numero2 = int(input("Por favor informe o segundo número: "))
        break
    except ValueError:
        print("Por favor informe um número válido.")


print("A soma dos números é", numero1 + numero2)