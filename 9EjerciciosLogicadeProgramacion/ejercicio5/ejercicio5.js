/* pra el usuario 
1. comentar todo el codigo 
2. correr el codigo
3. abrir consola en el navegador
4. descomentar el codigo  
5. empiece adivinar el numero */
let randomNumber = Math.floor(Math.random() * 100) + 1;
let intentos=0;
let vacio=[];
let numero;
function adivinar() {
    console.log(randomNumber);
    for (let n = 0; n <= 100; n++) {
    numero= parseInt( prompt("Adivine el numero del 1 al 100")) 
  if (numero==randomNumber){
    console.log("Felicidades adivinaste el numero secreto"+vacio);
    console.log(vacio);

  }else{
    console.log("ups el numero secreto es incorrecto vuelve a intentarlo");
    vacio.push(numero)
  }
}
}
adivinar();