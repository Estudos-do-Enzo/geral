nome = input("Por favor digite o se nome: ")

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

while True:
    try:
        nota4 = float(input("Por favor digite sua nota 4: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

media = (nota1 + nota2 + nota3 + nota4) / 4

print("A média das notas de", nome, "é", media)

if media >= 7:
    print("Aluno aprovado")
else:
    print("Aluno reprovado")