numeros = []
while True:
    try:
        opcao_usuario = input("Digite um número inteiro para adicionar à listaou a letra s para sair: ")
        if opcao_usuario == "s":
            break
        numero = int(opcao_usuario)
        numeros.append(numero)
    except ValueError:
        print("Por favor digite um número inteiro ou 's'")

i = 0
while i < len(numeros):
    j = i + 1
    while j < len(numeros):   
        if numeros[i] > numeros[j]:
            numeros[i], numeros[j] = numeros[j], numeros[i]
        j += 1
    i += 1

print("A lista ordenada é", numeros)