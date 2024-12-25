a = input("por favor digite o primeiro valor: ")
b = input("por favor digite o segundo valor: ")

# Isto se faz assim em Python
# Em linguagens em que não dá para fazer isto diretamente
# usa-se uma variável temporária
#
# temp = a
# a = b
# b = temp
a, b = b, a

print("Troquei os dois valores ")
print("Agora o primeiro valor é", a)
print("Agora o segundo valor é", b)