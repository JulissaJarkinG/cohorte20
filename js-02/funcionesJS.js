let miNom="Julissa Xitlalit Jarkin Grave";
console.log(miNom);;

function miNombre(){

    let nombre="Julissa";
    console.log(nombre);
}
miNombre();

/* function funcion1(){
      let valor=2;
      valor= valor+3;
      return valor;
}
let resultado= funcion1();
console.log("El resultado es: "+ resultado); */

////////////////////Función 1/////////////////////////
function funcion1(){
    let valor=2;  //variables locales
    valor= valor+3;
    console.log("El resultado es: " + valor);
}
funcion1();
//////////Función 2/////////////////

let valor2= 3; //declaración global
function funcion2(){
    valor2=valor2+5;
    console.log("El resultado es: " + valor2);
}
funcion2();

////////////////Función 3////////////////////////////
let variableGlobal = 7;
function funcion3(){
    let variableLocal= "El valor es: ";
    console.log(variableLocal +variableGlobal);
}
funcion3();

function funcion4(valor){
    let numero = 5;
    numero = numero * valor;
    return numero;
}
let salida = funcion4(4);
console.log("El producto es: "+ salida);


//Funciones anónimas
let miFuncion0=function (parametro)
{
    parametro=parametro*2;
    return parametro;
};
    console.log("Llamando a la función anónima "+ miFuncion0(4));

let funcion01= function(caracteres){
    return "Hola"+ caracteres;
}("Lunes");
console.log("El resultado es: "+funcion01);

///Función flecha

let suma= (x,y)=> {return x+y};
let resultado= suma(5,3);
console.log("La suma es: "+resultado);

///ejercicio Calcular precios
//gastos de envío=10
//precioTotal=(precio*impuesto)+gastosEnvio
//Salida precioTotal= calcularPrecioTotal(23.34)
/* function calcularPrecioTotal(precio){
impuestos=1.16;
gastosEnvio=10;
precioTotal=(precio*impuestos)+gastosEnvio;
console.log("El precio total es: "+ precioTotal);
}
calcularPrecioTotal(23.34); */

////Ejercicio con función flecha
/* let calcularPrecioTotalFlecha=(precio,porcentajeImpuestos)=> {
  let impuestos= 1.16;
  let gastosEnvio=10;  
  let precioConImpuesto = ((1+porcentajeImpuestos)/100)*precio;
  let precioTotal= precioConImpuesto+gastosEnvio
    return precioTotal;
}
let precioTotal = calcularPrecioTotalFlecha(23.34,16);
console.log("El precio total es:" +precioTotal); */

/* let precioTotal= calcularPrecioTotalFlecha(1.16,10,23.34);
console.log("El precio total con función flecha: "+ precioTotal); */
let miObjeto= {

    nombre: "Juan",
    edad: 25,
    datos: function(){
        let mensaje = "tu eres: " + this.nombre;
        mensaje +=" tienes "+ this.edad + " años";
        console.log(mensaje);

    }

};
miObjeto.datos();


let constructor = function(){
    let objPersona = {
        nombre: "Juan",
        nss: 2357,
        datosPersona: function(){
            let nsj= "eres " + this.nombre + " el numero nss es " + this.nss;
            console.log(nsj);
        },
        otroMetodo: function(parametro){
            let numero =8;
            console.log("La suma es: " + (numero+parametro));   
        }
    };
    return objPersona;
}
let varObjReg = constructor(); //Crear la variable llamada objeto 
varObjReg.datosPersona();
varObjReg.otroMetodo(5);

