/*
const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"), 500); //Código bloqueante que detiene la ejecución 500 ms
const baz = () => console.log("Third");
bar();
foo();
baz(); */

//servidor
/* const nombre = () => {
    const nombres = ["Pepe", "Pancho", "María"];

    /* setTimeout(() => {
        return nombres;
    }, 0); */
/* 
    return new Promise((resolve, reject) => { //resolve -- proceso exitoso
        setTimeout(() => {                    //reject -- proceso no exitoso
            if(true){
                resolve(nombres);
            }
            else{
                reject("No hay nombres");
            }
        }, 3000)
    });

}  */
//servidor

/*
nuestra pc
*/
//console.log(nombre()[0]);

//nombre().then(nombres=>console.log(nombres)).catch(error=>console.warn(error));
//console.log(nombre()); //El then permite atrapar lo que hay en resolve y lo llama

//Servidor
/* console.log(nombre()); */

/* const url= 'https://pokeapi.co/api/v2/pokemon/25';
const pokedex=() => {
    fetch(url)
    .then((datos)=>datos.json())  //Promesas
    .then((pokemon)=> console.log(pokemon)) //representa los datos que llegan
    .catch(error => console.log(error))
};

pokedex(); */
// () => {return} En las funciones flechas cuando hay una sola cosa por hacer, es mejor quitarle las llaves.

//async -- await
/*  async function obtenerNombre(){

}
 */
/* const obtenerNombre = async()=>{

    try{
        let nombres=await nombre();  //await para que funcione debe estar en una función asíncrona
    console.log(nombres);
    } catch (error){
        console.log(error);
    }
    

}
obtenerNombre();
 */

const cartaPokemon = document.getElementById('pokemon');
const nombrePokemon = document.getElementById('nombre');
const imagen = document.getElementById('img');
const form= document.getElementById('form');


const pokedex = async (numero) => {
    const url = `https://pokeapi.co/api/v2/pokemon/${numero} `;

    try {

        const respuesta = await fetch(url);
        const pokemon = await respuesta.json();
        
        console.log(pokemon.name);

        const datos = {
            nombre: pokemon.name,
            imagen: pokemon.sprites.other['official-artwork'].front_default,
        }

        console.log(datos.imagen);

        nombrePokemon.textContent = datos.nombre;
        imagen.innerHTML = `
            <img src="${datos.imagen}" alt="imagen de ${datos.nombre}" width="250"/>
        `;
        
        
    } catch (error) {


        
    }
}



form.addEventListener('submit', (evento)=>{
    //codigo
    evento.preventDefault();
    const valor= document.getElementById('idP').value;
    console.log(valor);
    pokedex(valor);
    //console.log(evento.target);
    form.reset();

});

