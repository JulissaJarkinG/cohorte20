//////// Propiedades de arreglos////////////
//length
/*

const frutas=["Limón","Manzana","Guayaba","Plátano"];
console.log(frutas);
console.log(frutas.length);

///////Métodos - Acciones///////////////

//push()
let num = frutas.push("Sandia"); ///Agregó datos al arreglo "Frutas"
console.log(frutas);
console.log(num);

//unshift() -Agrega al inicio
frutas.unshift("Guanabana");

//////Métodos para quitar//////

//Pop() - Quita un elemento del final

let elemento = frutas.pop()
console.log(frutas);
console.log(elemento);

//shift() - Quita un elemento del final 
let elemento2= frutas.shift()
console.log(frutas);
console.log(elemento2);

frutas[0]; 
//Index0f 
console.log(frutas.indexOf('Manzana')); //Imprime la posición de "Manzana"
console.log(frutas.indexOf('Plátano')); //Imprime la posición de "platano"

    //reverse() aplica reversa
frutas.reverse();
console.log(frutas);

//sort() //Ordena de manera alfabética
frutas.sort();
console.log(frutas);

const numeros=[4, 122,5454,78,9]; 
//numeros.sort();   <--  // Sólo toma en cuenta el primer dígito
//numeros.sort((a,b) => a -b); //función callback Forma corta
numeros.sort(function order(a,b) {return a-b}); 
// Compara número y los recorre hasta que queden ordenados.



console.log(numeros);

*/


//arreglo[i].reverse() Para aplicar reverse a un elemento dentro del arreglo

/*
Algunos métodos Para agregar/remover elementos:

push(...items) – agrega ítems al final,
pop() – extrae un ítem del final,
shift() – extrae un ítem del inicio,
unshift(...items) – agrega ítems al inicio.
splice(pos, deleteCount, ...items) – desde el índice pos borra deleteCount elementos e inserta items.
slice(start, end) – crea un nuevo array y copia elementos desde la posición start hasta end (no incluido) en el nuevo array.
concat(...items) – devuelve un nuevo array: copia todos los elementos del array actual y le agrega items. Si alguno de los items es un array, se toman sus elementos.
*/