/*Determine se cada uma das seguintes alternativas é verdadeira ou falsa. Se falsa, explique
por quê.
• O caso default é requerido na instrução de seleção switch.
• A instrução break é requerida no último caso de uma instrução de seleção switch.
• A expressão ((x > y)&&(a < b)) é verdadeira se (x > y) for verdadeiro ou (a < b) for
verdadeira.
2
• Uma expressão contendo o operador || é verdadeira se um ou ambos de seus operandos
forem verdadeiros.
• Para testar para uma série de valores em uma instrução switch, pode-se utilizar um
hífen ( - ) entre os valores inicial e final da série em um rótulo case.
• Listar casos consecutivamente sem instruções entre eles permite aos casos executar
o mesmo conjunto de instruções.*/

// 1 - Falso. O caso default é opcional em uma instrução switch. Ele é usado para fornecer uma ação padrão caso nenhuma das condições especificadas em case seja atendida, mas o switch funcionará sem ele.
// 2 - Falso. A instrução break não é obrigatória no último caso de um switch. Ela é usada para impedir que o código "caia" para o próximo caso, mas como o último case é o final do switch, a execução termina naturalmente ali. Usar break no último case é opcional.
// 3 - Falso. A expressão ((x > y) && (a < b)) só será verdadeira se ambas as condições (x > y) e (a < b) forem verdadeiras, devido ao operador && (E lógico), que exige que ambos os operandos sejam verdadeiros para que o resultado final seja verdadeiro.
// 4 - Verdadeiro. O operador || (OU lógico) retorna verdadeiro se um ou ambos os operandos forem verdadeiros. Se ambos os operandos forem falsos, a expressão será falsa.
// 5 - Falso. Não é possível usar um hífen para representar um intervalo de valores em uma instrução switch. Cada case deve ter um valor específico. Para testar intervalos, é necessário usar instruções if adicionais dentro de cada case, ou então reescrever o código utilizando estruturas como if-else.
// 6 - Verdadeiro. Em uma instrução switch, ao listar vários case consecutivos sem instruções break ou outras instruções entre eles, todos esses casos irão executar o mesmo bloco de código até encontrar uma instrução break ou o fim do switch.
