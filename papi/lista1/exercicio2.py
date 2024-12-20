numero = 0

while True:
    try:
        numero = int(input("Forneça um número: "))
        break
    except:
        print("Por favor forneça um número válido")

if numero % 2 == 0:
    print("O número é par")
else:
    print("O número é ímpar")

if numero > 0:
    print("O número é positivo")
elif numero < 0:
    print("O número é negativo")
else:
    print("O número é igual a zero")
