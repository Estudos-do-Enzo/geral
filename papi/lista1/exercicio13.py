nome = input("Digite o seu nome: ")
while True:
    try:
        idade = int(input("Digite a sua idade: "))
        break
    except ValueError:
        print("Idade inválida, por favor digite um número.")

print("O seu nome é", nome)
if idade >= 18:
    print("Você é maior de idade.")
else:
    print("Você é menor de idade")
