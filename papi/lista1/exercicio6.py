while True:
    try:
        salario = float(input("Digite um valor: "))
        break
    except ValueError:
        print("Por favor digite um número válido")

print("Este valor acrescido de 5% corresponde a", salario * 1.05)