while True:
    try:
        numero = int(input("Digite um número inteiro maior ou igual a zero para saber seu fatorial: "))
        if numero < 0:
            raise ValueError
        break
    except ValueError:
        print("Por favor digite um número válido maior que zero")
    
if numero < 2:
    print("O fatorial de", numero, "é 1")
else:
    contador = 1
    fatorial = 1
    while contador <= numero:
        fatorial *= contador
        contador +=1

    print("O fatorial de", numero, "é", fatorial)