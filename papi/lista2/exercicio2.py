while True:
    try:
        numero = int(input("Por favor informe um número: "))
        break
    except ValueError:
        print("Por favor informe um número válido.")

print("O número informado foi", numero)