// execute o npm install para instalar uma dependência externa
// estou usando o softio

const softio = require( 'softio' );
let numero1;
let numero2;

async function principal() {
    while (true) {
        numero1 = parseFloat(await softio.input( 'Por favor insira um número: ' ));

        if (numero1 > 0) {
            break;
        }

        console.log("Por favor forneça um número maior que zero");
    }

while (true) {
        numero2 = parseFloat(await softio.input( 'Por favor insira outro número: ' ));

        if (numero2 > 0) {
            break;
        }

        console.log("Por favor forneça um número maior que zero");
    }

    let soma = numero1 + numero2;
    console.log(`A soma destes números é igual a ${soma}`)
}

principal();
