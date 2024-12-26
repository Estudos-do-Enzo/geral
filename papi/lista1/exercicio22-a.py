while True:
    try:
        a = int(input("Por favor digite o valor inteiro A: "))
        break
    except ValueError:
        print("Erro: Por favor digite um valor inteiro.")

while True:
    try:
        b = int(input("Por favor digite o valor inteiro B: "))
        break
    except ValueError:
        print("Erro: Por favor digite um valor inteiro.")

print("A / B: ", a / b)
print("O resultado da divisão inteira de A por B é: ", a // b)
print("O resto da divisão de A por B é:", a % b)
