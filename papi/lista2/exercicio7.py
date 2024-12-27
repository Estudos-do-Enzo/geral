print("Aqui a área de um quadrado e o dobro desta área.")

while True:
    try:
        lado = float(input("Por favor favor informe o lado do quadrado em centímetros - use o ponto como separador decimal: "))
        
        if lado < 0:
            raise ValueError

        break
    except ValueError:
        print("Por favor informe um número válido e maior que zero.")

area = lado * lado
print("A área do quadrado em centímetros é", area)
print("O dobro da área do quadrado em centímetros é", area * 2)