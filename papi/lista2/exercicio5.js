// execute o npm install para instalar uma dependência externa
// estou usando o softio

const softio = require( 'softio' );
let medidaMetros;


async function principal() {
    while (true) {
        medidaMetros = parseFloat(await softio.input( 'Por favor insira o valor em metros: ' ));

        if (medidaMetros > 0) {
            break;
        }

        console.log("Por favor forneça um número maior que zero");
    }

    console.log("A medida informada, convertida para centímetros é:", medidaMetros * 100, "cm");
}

principal();
