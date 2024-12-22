salario = 0

print("Calcularemos quantos salários mínimos correspondem o salário informado")

while True:
    try:
        salario = float(input("Digite o valor do salário: "))
        break
    except ValueError:
        print("Por favor digite um número válido")

salario_minimo = 1293.2

print("Este valor corresponde a", salario / salario_minimo, "salários mínimos")