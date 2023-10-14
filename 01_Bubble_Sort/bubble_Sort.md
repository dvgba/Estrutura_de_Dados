#### Bubble Sort:

* *Tipo:* Comparativo e estável.
* *Complexidade:* O(n^2) no pior caso, onde n é o número de elementos no array. No melhor caso, quando o array já está ordenado, a complexidade é O(n), mas geralmente requer O(n^2) trocas mesmo no melhor caso.
* *Princípio de Funcionamento:* O Bubble Sort funciona comparando pares adjacentes de elementos no array e trocando-os se estiverem na ordem errada. O processo é repetido para cada elemento no array até que todo o array esteja ordenado. Em cada passagem, o maior elemento (ou menor, dependendo da ordem desejada) "sobe" para a sua posição correta, daí o termo "borbulhar".
* *Estabilidade:* O Bubble Sort é um algoritmo estável, o que significa que ele preserva a ordem relativa de elementos com chaves iguais. Se dois elementos têm a mesma chave, o algoritmo não alterará a ordem deles.