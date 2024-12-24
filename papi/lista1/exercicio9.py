while True:
    try:
        altura = float(input("Por favor digite sua altura: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

while True:
    try:
        peso = float(input("Por favor digite seu peso: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

imc = peso / (altura * altura)

print("O IMC é", imc)

print("Sua condição é: ", end="")

if imc < 18.5:
    print("abaixo do peso")
elif imc < 24.9:
    print("peso ideal")
elif imc < 29.9:
    print("levemente acima do peso")
elif imc < 34.9:
    print("obesidade grau I")
elif imc < 39.9:
    print("obesidade grau II (severa)")
else:
    print("obesidade grau III (mórbida)")