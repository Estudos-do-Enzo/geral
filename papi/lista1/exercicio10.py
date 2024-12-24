while True:
    try:
        nota1 = float(input("Por favor digite sua nota 1: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

while True:
    try:
        nota2 = float(input("Por favor digite sua nota 2: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

while True:
    try:
        nota3 = float(input("Por favor digite sua nota 3: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

print("A média das notas é", (nota1 + nota2 + nota3) / 3)