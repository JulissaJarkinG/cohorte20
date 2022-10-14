const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(personas);
//Escribe un comando para remover a "Dani" del arreglo

//const months = ['Jan', 'March', 'April', 'June'];
//months.splice(1, 0, 'Feb');
//months.splice(4, 1, 'May');
personas.splice(1,1);
console.log(personas);
//Escribe un comando para remover a "Juan del arreglo"
personas.splice(2,1);
console.log(personas);
//Escribe un comando para agregar a "Luis" al inicio del arreglo
personas.splice(0,0,'Luis');
console.log(personas);
//Escribe el comando para agregar tu nombre al final del arreglo
personas.splice(4,0,'Julissa');
console.log(personas);
//Escribe el comando para mostrar la posición de "Maria"
console.log(personas.indexOf('Maria'));
//indexOf()

//Escribe el comando para mostrar la posición de tu nombre
console.log(personas.indexOf('Julissa'));


//personas.splice(personas.indexOf("Dani"), 1); Otra forma de eliminar a dani

