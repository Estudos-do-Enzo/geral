// execute o npm install para instalar uma dependência externa
// estou usando o softio

const softio = require( 'softio' );

let numero;

async function principal() {
    while (true) {
        numero = await softio.input( 'Por favor insira um número: ' );

        if (numero > 0) {
            break;
        }

        console.log("Por favor forneça um número maior que zero");
    }

    console.log(`O número inserido foi ${numero}`)
}

principal();
