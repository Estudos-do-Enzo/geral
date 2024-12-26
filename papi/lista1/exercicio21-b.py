while True:
    try:
        valor_hora = float(input('Valor da hora trabalhada (ponto como separador decimal): R$ '))
        break
    except ValueError:
        print('Valor inválido. Por favor, insira um valor numérico (ponto como separador decimal).')

while True:
    try:
        horas_trabalhadas = int(input('Horas trabalhadas no mês (valor inteiro): '))
        break
    except ValueError:
        print('Valor inválido. Por favor, insira um valor correspondente a um número inteiro.')

while True:
    try:
        percentual_desconto_INSS = int(input('Percentual de desconto do INSS (0-100): '))
        if percentual_desconto_INSS < 0 or percentual_desconto_INSS > 100:
            raise ValueError
        break
    except ValueError:
        print('Valor inválido. Por favor, insira um valor correspondente a um número inteiro entre 0 e 100.')

print("O salário líquido é R$", (valor_hora * horas_trabalhadas)*((100 - percentual_desconto_INSS)/100))