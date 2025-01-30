<?php
require_once("../bibliotecas/MiniGraficoImagem.php");
$linguagens= [
	["js", "JavaScript"],
	["kt", "Kotlin"],
	["py", "Python"],
	["php", "PHP"]
];


$grafico = new MiniGraficoImagem ;

foreach($linguagens as $linguagem) {
	$cor = $grafico->gerarCor();
    $grafico->cadastrar(obterQuantidadeLinguagem($linguagem[0]), $linguagem[1], $cor[1], $cor[2], $cor[3]) ;
}

ob_start();
@$grafico->gerarGrafico();
$imagem = ob_get_contents();
ob_end_clean();	
file_put_contents("relatorio.png", $imagem);

function obterQuantidadeLinguagem($linguagem) {
    return exec("ls -la *.$linguagem | wc -l");
}
