print("Faremos a média de 4 notas")

while True:
    try:
        nota1 = int(input("Por favor informe a primeira nota (use o ponto como separador decimal): "))
        break
    except ValueError:
        print("Por favor informe um número válido.")

while True:
    try:
        nota2 = int(input("Por favor informe a segunda nota (use o ponto como separador decimal): "))
        break
    except ValueError:
        print("Por favor informe um número válido.")

while True:
    try:
        nota3 = int(input("Por favor informe a terceira nota (use o ponto como separador decimal): "))
        break
    except ValueError:
        print("Por favor informe um número válido.")

while True:
    try:
        nota4 = int(input("Por favor informe a quarta nota (use o ponto como separador decimal): "))
        break
    except ValueError:
        print("Por favor informe um número válido.")


print("A média das notas é", (nota1 + nota2 + nota3 + nota4) / 4)