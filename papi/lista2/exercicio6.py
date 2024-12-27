import math

print("Aqui calcularemos a área de uma circunferência.")

while True:
    try:
        raio = float(input("Por favor favor informe o raio da circunferência em centímetros - use o ponto como separador decimal: "))
        
        if raio < 0:
            raise ValueError

        break
    except ValueError:
        print("Por favor informe um número válido e maior que zero.")

print("A área da circunferência em centímetros é", raio * raio * math.pi)