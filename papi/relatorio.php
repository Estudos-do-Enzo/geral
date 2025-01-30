<?php
/**
 * Este script gera o arquivo relatorio.png no diretorio listaX (x=1, 2 or 3), baseado no valor informado pelo usuario
 */
while (true) {
    $numeroDaLista = readline("Please specify the number of the list to generate the image: ");
    if ($numeroDaLista == "1" || $numeroDaLista == 2 || $numeroDaLista == 3) {
        break;
    }
    echo "Please specify the number 1, 2 or 3\n";
}
$diretorio = 'lista' . $numeroDaLista;

require_once("bibliotecas/MiniGraficoImagem.php");
$linguagens= [
	["js", "JavaScript"],
	["kt", "Kotlin"],
	["py", "Python"],
	["php", "PHP"]
];


$grafico = new MiniGraficoImagem ;

foreach($linguagens as $linguagem) {
    $cor = $grafico->gerarCor();
    $grafico->cadastrar(obterQuantidadeLinguagem($linguagem[0], $diretorio), $linguagem[1], $cor[1], $cor[2], $cor[3]) ;
}

ob_start();
@$grafico->gerarGrafico();
$imagem = ob_get_contents();
ob_end_clean();	
file_put_contents("$diretorio/relatorio.png", $imagem);

function obterQuantidadeLinguagem($linguagem, $diretorio) {
    return (int) @exec("ls -la $diretorio/*.$linguagem | wc -l");
}
