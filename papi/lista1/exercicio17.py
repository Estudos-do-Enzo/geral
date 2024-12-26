while True:
    try:
       temperatura_fahrenheit = float(input("Por favor digite a temperatura em fahrenheit: "))
       break
    except ValueError:
        print("Erro: Por favor digite um valor numerico válido, com o ponto como um separador decimal")

print("O equivalente em celsius é:", 5 * (temperatura_fahrenheit-32) / 9)