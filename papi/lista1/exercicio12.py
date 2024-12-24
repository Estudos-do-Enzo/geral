# https://python-inquirer.readthedocs.io/en/latest/
import inquirer

while True:
    try:
        valor_produto = float(input("Por favor digite o valor do produto: "))
        break
    except ValueError:
        print("O valor deve ser um número válido, com ponto como separador decimal")

formas_pagamento = [
    "À Vista em dinheiro ou PÌX",
    "À Vista no cartão de crédito",
    "Parcelado no cartão em duas vezes",
    "Parcelado no cartão em três vezes ou mais"
]

pergunta = [
    inquirer.List('metodo_pagamento_escolhido',
                message="Qual a forma de pagamento?",
                choices= formas_pagamento,
            ),
]
forma_pagamento = inquirer.prompt(pergunta)

indice_forma_pagamento = formas_pagamento.index(forma_pagamento['metodo_pagamento_escolhido'])

print("O valor final é: ", end="")

if indice_forma_pagamento == 0: # "À Vista em dinheiro ou PÌX",
    print(round(valor_produto * 0.85, 2))
elif indice_forma_pagamento == 1: # "À Vista no cartão de crédito",
    print(round(valor_produto * 0.9, 2))
elif indice_forma_pagamento == 2: # "Parcelado no cartão em duas vezes"
    print(valor_produto)
else: # indice_forma_ágamento == 4 => Parcelado no cartão em três vezes ou mais
    print(round(valor_produto * 1.1, 2))