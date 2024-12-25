# Estou resolvendo uma questão dos imports para terminar este script em breve

import datetime
from datetime import date

def obter_data_atual():
    return datetime.date.today()

def obter_ano_atual():
    return obter_data_atual().year

ano_atual = obter_ano_atual()

while True:
    try:
        ano_nascimento = int(input("Por favor digite o ano de nascimento: "))
        break
    except ValueError:
        print("Por favor digite um valor numérico menor que", ano_atual)

print("Consideraremos o nascimento em 31/12/", ano_nascimento, sep="")

nascimento = date(ano_nascimento, 12, 31)
diferenca_datas = obter_data_atual() - nascimento

#print("Anos de vida:", diferenca_datas / 365, diferenca_datas.day)