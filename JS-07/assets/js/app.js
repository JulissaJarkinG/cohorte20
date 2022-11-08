const titulo = document.getElementById('titulo'); //Llama por id
const parrafos= document.getElementsByClassName('parrafo'); //llama por clase

parrafos[0].innerHTML= "Soy un párrafo" //Modifica el primer párrafo

console.log(titulo.textContent); // textContentPermite modificar los párrafos, pero sólo permite agregar texto
console.log(parrafos[1].textContent); 

//css background-color   -- snake case
//js backgroundColor     -- camel case

/* parrafos[1].style.color="red"
parrafos[1].style.backgroundColor ="yellow"; */

console.log(parrafos[1].classList.add('coloresFeos')) //este método tiene un submétodo que permite perguntar
// si tiene cierto nombre de clase, cambiarla

//Crear elementos HTML ----HTML no identifica las comillas simples
const padre= document.getElementById('padre');

const enlace= document.createElement("a");
enlace.href= 'https://wwww.google.com'; //creamos elemento
enlace.textContent= "Ir a google"; //agregamos atributo

// body como atributo de document
//document.body.appendChild(enlace); //insertamos enlace

/* document.body.insertAdjacentElement("afterbegin",enlace); */

padre.appendChild(enlace); //muestra el enlace donde esté la etiqueta padre 

console.log(document.body);