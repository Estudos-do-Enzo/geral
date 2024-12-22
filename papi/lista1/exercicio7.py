while True:
    try:
        valor1 = bool(input("Digite o valor 1: "))
        valor2 = bool(input("Digite o valor 2: "))
        break
    except ValueError:
        print("Por favor digite um número válido")

if valor1 and valor2:
    print("Ambos os valores são correspondentes a strings conversíveis para um valor verdadeiro")
elif not valor1 and not valor2:
    print("Ambos os valores são correspondentes a strings conversíveis para um valor falso")
else:
    print("Ambos os valores NÃO são correspondentes a strings conversíveis para um valor verdadeiro nem um valor falso")
