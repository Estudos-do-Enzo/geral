const prompt = require('prompt-sync')
const p = prompt()

const stringOfNumber = p("Por favor informe um número: ");
const number = parseInt(stringOfNumber);

if (isNaN(stringOfNumber) || stringOfNumber.trim() == "") {
    console.log("Por favor informe um número válido");
} else {
    console.log(`Você inseriu o número ${number}`);
    console.log(`O antecessor deste número é ${number - 1}`);
    console.log(`O sucessor deste número ${number + 1}`);
}