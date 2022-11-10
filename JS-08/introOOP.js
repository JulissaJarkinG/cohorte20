

let persona={
    nombre: 'Juan', 
    apellido: 'Perez',
    nombreCompleto: function (){
        return 'El nombre es ' + this.nombre + ' ' + this.apellido;
    }
}
//este for in lo unico que hace es iterar el objeto
//for ("nombre que lleva cada elemento" in "objeto/arreglo a iterar")
for (nombrePropiedad in persona) {
    
    console.log(nombrePropiedad);
    console.log('valor: '+ persona[nombrePropiedad]);
    
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
console.log(persona['apellido']);
persona.tel='5555543221';
console.log(persona.tel);
delete persona.tel
console.log(persona);
let personaArreglo= Object.values(persona);
console.log(personaArreglo);
let personaString = JSON.stringify(persona);
console.log(personaString);
//objeto de instancia creada con new
/* let persona1= new Object();
persona1.edad=23;
console.log(persona1);  
console.log(persona1.edad); */