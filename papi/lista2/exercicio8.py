print("Aqui calcularemos o ganho mensal baseado no valor hora e nas horas trabalhadas.")

while True:
    try:
        horas_trabalhadas = float(input("Por favor favor informe o número de horas trabalhadas em um mês - use o ponto como separador decimal: "))
        
        if horas_trabalhadas <= 0:
            raise ValueError

        break
    except ValueError:
        print("Por favor informe um número válido e maior que zero.")


while True:
    try:
        valor_hora = float(input("Por favor favor informe o valor hora - use o ponto como separador decimal: "))
        
        if valor_hora <= 0:
            raise ValueError

        break
    except ValueError:
        print("Por favor informe um número válido e maior que zero.")

print("O ganho mensal é:", valor_hora * horas_trabalhadas)