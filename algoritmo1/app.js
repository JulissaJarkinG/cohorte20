//alert("Hola mundo desde visual studio code!");
// Comentario de una linea
/* 
Esto es un
bloque de
comentario

Esto no se puede hacer en html
Atajo: shift+Alt+A
*/

//Declaración de una variable

let miVariable;


//Inicializar variable - Las variables const no pueden ser vacías
const otraVariable = 5;
miVariable= "Hola";
let nombre= "Julissa";

console.log(otraVariable);
console.log(miVariable);
console.log(nombre);

//Mutación de valor, reasignación

console.log(miVariable);
miVariable= "Adiós";
console.log(miVariable);

const MI_NOMBRE= "Julissa";
//valor primitivo el nombre es en mayúsculas
//const no permite cambiar el valor


////////////////////////////////////////////////////////////////////////
//                      TIPOS DE VALORES
//Valores primitivos(Simples)
   // String: Cadena de texto (Palabras, nombres, caracteres)

let palabra="Cualquier \"palabra\" \n?*$%&";
let palabra2= 'Otra palabra mas';
console.log(palabra);
console.log(palabra2);
  
   //  Number: Números
let num= 3;
let num2= 65.3234
let num3= -213
// ATAJO: Alt+shift+flecha para duplicar
console.log(num);
console.log(num2);
console.log(num3);
console.log(num, num2, num3);
console.log(num + num2 + num3);
console.log("Este número es ", num);
console.log("Este número es ", +num);
        //Concatenación
  console.log("1"+1);
  console.log("1"+"1");
  
   //  Boolean: Boleano
  //true- false
  let verdadero= true;
  let falso= false;

  console.log(verdadero);
  console.log(falso);
  
   //   null
  //Una variable que estamos dejando vacía intencionalmente

  let valorNulo= null;
  console.log(valorNulo);

  //  undefined
//estado
let varUn;
console.log(varUn);
//Valores compuestos

//operador typeof - Nos permite conocer el tipo de dato
let a =1;
let b ="holiwis";
let c ="true";

console.log(typeof a);
console.log(typeof(b));
console.log(typeof c);
console.log(typeof(null));
console.log(typeof(undefined));
console.log(typeof(35424));
