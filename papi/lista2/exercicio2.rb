print "Por favor informe um número: "
numero = gets.chomp
if numero == "0"
    puts "O número informado foi: 0"
else
    numero = numero.to_i
    if numero != 0
        puts "O número informado foi: #{numero}"
    else
        puts "Número inválido"
    end
end
