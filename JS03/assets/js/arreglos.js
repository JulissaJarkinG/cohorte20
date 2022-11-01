/*const - let - Son variables locales
var - Son variables globales */

const numeros= [2, 4, 6, 57, 200];
let suma=0;

//forEach Recorre todo el arreglo y ejecuta el código 
//que le indiquemos sobre los valores guardados
/* let suma2= numeros.forEach(function sumar(elemento){
    suma= suma + elemento;

}); */

numeros.forEach((el, indice, arreglo) => {
    console.log(el, indice, arreglo); 
});

/* console.log(suma); */

// map genera una copia del arreglo original
let nuevoArr= numeros.map((el)=>{ 
    return el*el;
}
);
console.log(nuevoArr);


//filter crea una copia del arreglo original y nos permite filtrar
const frutas=["papaya", "manzana", "manzana", "uva"];

let frutaFiltrada = frutas.filter((fruta) => fruta.length > 3);
console.log(frutaFiltrada)