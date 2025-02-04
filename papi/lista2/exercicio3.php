<?php
while (true) {
    $numero1 = (int) readline("Por favor forneça o primeiro número diferente de zero: ");
    if ($numero1 == 0) {
        echo "O valor atribuído é equivalente ao número zero. Por favor, tente novamente.\n";
    } else {
        break;
    }
}

while (true) {
    $numero2 = (int) readline("Por favor forneça o segundo número diferente de zero: ");
    if ($numero2 == 0) {
        echo "O valor atribuído é equivalente ao número zero. Por favor, tente novamente.\n";
    } else {
        break;
    }
}

echo "A soma destes números é: ";
echo $numero1 + $numero2;
echo "\n";