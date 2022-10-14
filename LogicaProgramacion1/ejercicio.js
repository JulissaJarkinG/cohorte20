////// Ejercicio Lógica de Programación 1////////////////////////////77


/// Solicitar datos al usuario /////////////////
let num1= parseInt (prompt("Ingrese el primer número:")); //// Prompt para solicitar datos
let num2= parseInt( prompt("Ingrese el segundo número:")); //// parseInt para convertir cadenas a constantes
let num3= parseInt( prompt("Ingrese el tercer número:"));

//Numeros= [num1,num2,num3];
//// Identificar mayor o menor

let mayor;
let medio;
let menor;
//Num1
if(num1>num2&&num3){
    mayor=num1;
}
if(num1<num2&&num3){
    num1=menor;

}
if(num2<num1<num3){
    num1=medio;
}
if(num3<num1<num2){
    num1=medio;
}

//Num2
if(num2>num1&&num3){
    num2= mayor;
}
if(num2<num1&&num3){
    num2=menor;

}
if(num1<num2<num3){
    num2=medio;
}
if(num3<num2<num1){
    num2=medio;
}

//Num3
if(num3>num1&&num3){
    num3= mayor;
}
if(num3<num1&&num2){
    num2=menor;

}
if(num1<num3<num2){
    num3=medio;
}
if(num2<num3<num1){
    num3=medio;
}

NumerosOrdenados=[mayor,medio,menor];
console.log(NumerosOrdenados);
/*
if (Numeros[0]<Numeros[1]<Numeros[2]) //3-2-1
{
    console.log (Numeros[2],Numeros[1],Numeros[0]);

}

if (Numeros[2]<Numeros[1]<Numeros[0]) //1-2-3
{
    console.log (Numeros[0],Numeros[1],Numeros[2]);

}

if (Numeros[2]<Numeros[0]<Numeros[1])///3-1-2
{
    console.log (Numeros[1],Numeros[0],Numeros[2]);

}
if (Numeros[0]<Numeros[2]<Numeros[1])///1-3-2
{
    console.log (Numeros[1],Numeros[2],Numeros[0]);

}
if (Numeros[1]<Numeros[0]<Numeros[2])///2-1-3
{
    console.log (Numeros[2],Numeros[0],Numeros[1]);

}
if (Numeros[1]<Numeros[2]<Numeros[0])///2-3-1
{
    console.log (Numeros[0],Numeros[2],Numeros[1]);

}

*/