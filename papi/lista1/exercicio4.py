numero = 0

while True:
    try:
        numero = int(input("Digite un número: "))
        break
    except ValueError:
        print("Por favor digite um número")

print("O antecessor de", numero, "é", numero - 1)
print("O sucessor de", numero, "é", numero + 1)