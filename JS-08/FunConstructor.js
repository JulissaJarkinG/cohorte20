let constructor = function(){
    let valor0= 0;
    let valor1= 0;

    //declarando un objeto
    let persona={
        nombre: 'Pedro',
        apellido: 'Lara',
        suma: function(a,b){
            return a+b;
        },
        get nombre1(){
            return this._nombre;
        },
        set nombre1 (nombre0){
            this._nombre=nombre1;

        }
    };
    return persona;
};

let p1= constructor();
p1.nombre='Carlos';
console.log(p1.nombre);
