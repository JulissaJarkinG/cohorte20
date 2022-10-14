
//let miVariable= prompt("Cuál es tu nombre: ");

//function saludoPer(){
  //  alert(miVariable);
//}


//function suma(){
//let num1= parseInt (prompt("de el valor de 1:"));
//let num2= parseInt( prompt("de el valor de 2:"));
//let resultado= num1+num2; //Está concatenado 
//alert(resultado);
//}


//saludoPer(miVariable)
//suma();

// Para usar return
/*
function suma(){
let num1= 5;//parseInt (prompt("de el valor de 1:"));
let num2= 7; //parseInt( prompt("de el valor de 2:"));
let resultado= num1+num2; 
return(resultado);
//let r= suma();
}
console.log("El resultado de la suma: " + suma());


function resta(){
    let num1=7;
    let num2= 3;
    return num1- num2;

}
console.log("El resultado de la resta: " + resta());


function multiplicacion(){
    let num1=8;
    let num2= 7;
    return num1* num2;

}
console.log("El resultado de la multiplicación: " + multiplicacion());


function division(){
    let num1=70;
    let num2= 5;
    if (num2!= 0){
       
        return num1 / num2;
    }
    alert ("El demonimador es cero");

}
console.log("El resultado de la división: " + division());


function residuo(){
    let num1=70;
    let num2= 5;
    return num1 % num2;

}
console.log("El resultado del residuo " + residuo());


alert("La suma es" + suma());
alert("La resta es" + resta());
alert("La multiplicación es" + multiplicacion());
alert("La division es"+ division());
alert("El residuo es" + residuo());


function adicionales(){

    let num1=7;
    let resultado=(++num1);
    // Multiplicación num1*=num1+(5+3)
    return resultado;
}
console.log("El resultado adicionales: " + adicionales());
alert ("El numero adicional es: "+ adicionales());

function logico(){
    let valido= 3;
    let valido2= 5;
    if(valido<valido2){
    console.log("El valor booleano es: "+ valido);
    }
}
logico();*/
//////////////////////////////////////////////////////////

function edad(){

let miEdad= 24;
if(miEdad>=18){
console.log("Eres mayor de edad");
}
else 
    console.log("No eres mayor de edad");


}
edad()

function conjunciones() {

    let valor1= false;
    let valor2= true;
    if(valor1 && valor2){
        console.log("El valor 1 y el valor 2 son verdades");
    
    } 
    else {
        console.log ("Un valor es falso");
    
         }
}
conjunciones();

function disyuncion(){
    let valor1= false;
    let valor2= false;
    if(valor1 || valor2){
        console.log("El operador or es verdadero");
    }
    else{
        console.log("El operador or es falso");
        }
}
disyuncion();

function negacion(){
    
    let valor1 = true;
    if(!(!valor1)){
    console.log("El valor negado es "+ valor1);
    } 
    else {
        console.log("El valor negado es " + valor1);
         }

} 
negacion();