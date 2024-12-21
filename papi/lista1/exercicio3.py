a = 0
b = 0

while True:
    try:
        a = int(input("Digite o valor 'a': "))
        break
    except ValueError:
        print("Por favor digite um número")

while True:
    try:
        b = int(input("Digite o valor 'b': "))
        break
    except ValueError:
        print("Por favor digite um número")

