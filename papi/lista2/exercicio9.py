print("Aqui pediremos uma temperatura em Farenheit e informaremos a mesma temperatura em Celsius.")

while True:
    try:
        temperatura_farenheit = float(input("Por favor a temperatura em Farenheit - use o ponto como separador decimal: "))
        
        break
    except ValueError:
        print("Por favor informe uma temperatura válida.")

print("O equivalente em Celsius:", 5 * (temperatura_farenheit - 32) / 9)