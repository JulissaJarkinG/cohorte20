/* Escribir un programa que detecte el cupón que tiene el usuario
Bronce se le hará un descuento del 5 %
Plata se le hará un descuento del 10%
Oro se le hará un descuento del 20%
Platino se le hará el descuento del 25%
-El usuario introduce el precio primero y después el cupón
-El programa debe mostrar el precio original y el precio con el descuento aplicado
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un 
 cupón equivocado */

 /* let precio= Number(prompt("Precio")); */
 //console.log(palabra.toLowerCase()==="bronce"); Con toLoweCase podemos convertir todas las letras minusculas
/*  let precio= Number(prompt("Ingrese el precio"));
  
 let cupon= Number(prompt("Ingrese el número de su cupón // 1: Bronce;  2: Plata;  3: Oro;  4: Platino;"));

switch(cupon){
    case 1:
        Descuento=(precio*.95)
        document.write("El precio total es: " + Descuento)
        break;
    
    case 2:
        Descuento=(precio*.90)
        document.write("El precio total es: " + Descuento)
        break;
    case 3:
        Descuento=(precio*.80)
        document.write("El precio total es: " + Descuento)
        break;
    case 4:
        Descuento=(precio*.75)
        document.write("El precio total es: " + Descuento)
        break;
    default: document.write("Cupón no válido");
    break;
}
 */
/*
String
""
''
`` literal strings - plantillas literales
*/
let nombre = "Julissa";
console.log("Hola");
console.log('Hola');
console.log(`Hola yo soy ${nombre} y mi edad es ${2022-1997}`);

//Operador literario
// if simplificado
// condicion ? en caso de ser verdad: en caso de ser falso
let edad = 17;
let mensaje = (edad >= 18)
? "es mayor de edad"
: "Tas chiquito";

console.log(mensaje);

console.log (`Yo soy Julissa y soy ${edad>=18 ? " mayor de edad" : " menor de edad"}`);

/* 
 */