while True:
    try:
        tempo = float(input('Tempo da viagem em horas (ponto como separador decimal): '))
        break
    except ValueError:
        print('Valor inválido. Por favor, insira um valor numérico (ponto como separador decimal).')

while True:
    try:
        velocidade_media = float(input('Velocidade média da viagem (ponto como separador decimal): '))
        break
    except ValueError:
        print('Valor inválido. Por favor, insira um valor numérico (ponto como separador decimal).')

distancia = tempo * velocidade_media

combustivel_consumido = distancia / 12

print("Serão consumidos", combustivel_consumido, "litros de combustível.")