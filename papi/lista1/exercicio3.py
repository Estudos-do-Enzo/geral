a = 0
b = 0
c = 0

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

if a == b:
    print("'a' é igual a 'b'")
    print("a soma dos valores é:", a + b)
else:
    print("'a' é diferente de 'b'")
    print("o resultado da multiplicação dos valores 'a' e 'b' é:", a * b)