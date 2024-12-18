while (True):
    try:
        A = input("Por favor insira o valor A: ")
        if A == "0":
            A = 0
            break
        A = int(A)
        if A != 0:
            break
    except:
        print("Por favor digite um número")

while (True):
    try:
        B = input("Por favor insira o valor B: ")
        if B == "0":
            B = int(B)
            break
        B = int(B)
        if B != 0:
            break
    except:
        print("Por favor digite um número")

while (True):
    try:
        C = input("Por favor insira o valor C: ")
        if C == "0":
            C = int(C)
            break
        C = int(C)
        if C != 0:
            break
    except:
        print("Por favor digite um número")


soma_AB = A + B

print("A soma de A e B é:", soma_AB)

if soma_AB > C:
    print("A soma entre A e B é maior que C")
elif soma_AB == C:
    print("A soma entre A e B é igual a C")    
else:
    print("A soma entre A e B é menor que C")