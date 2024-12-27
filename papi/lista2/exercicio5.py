print("Aqui converteremos um valor em metros para centímetros.")

while True:
    try:
        medida_metros = float(input("Por favor favor informe a medida em metros - use o ponto como separador decimal: "))
        break
    except ValueError:
        print("Por favor informe um número válido.")

print("A medida convertida para cebtímetros é", medida_metros * 100)