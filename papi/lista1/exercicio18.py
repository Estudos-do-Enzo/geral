print("No enunciado a ideia está invertida, pois é a Sara que cresce mais por ano")

altura_inicial_francisco = 1.5
crescimento_anual_francisco = 0.02
altura_inicial_sara = 1.1
crescimento_anual_sara = 0.03
anos = 0

while True:
    altura_francisco = altura_inicial_francisco + crescimento_anual_francisco * anos
    altura_sara = altura_inicial_sara + crescimento_anual_sara * anos
    if altura_sara > altura_francisco:
        break
    anos += 1

print("Em", anos, "anos, Sará sera maior que Francisco")