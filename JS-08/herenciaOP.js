////EJEMPLO DE HERENCIA

class Persona{
    constructor (nombre, apellido){
        this._nombre=nombre; //miembro diferente al parámetro del constructor
        this._apellido= apellido;
    }
    set nombre(nombre){
        this._nombre=nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + ''+ this._apellido;
    }
toString () {
    return this.nombreCompleto();
   
}
}

class Empleado extends Persona{  //Empleado está heredando de persona
    constructor(nombre,apellido,empresa){
        super(nombre,apellido); //va a la definición de persona y toma los parámetros
        this._empresa=empresa;
    }
    set empresa (empresa){
        this._empresa=empresa;
    }
    get empresa(){
        return this._empresa
    }
    //Sobreescribiendo método
    nombreCompleto(){  
        return super.nombreCompleto() + '' + this._empresa
    }

}
let p1= new Persona('Hugo', 'Sanchez');
console.log(p1.nombreCompleto());
console.log(p1.toString());

let E1= new Empleado('Juan', 'Perez', 'Coppel');
console.log(E1.nombreCompleto());
console.log(E1.toString())
//sobreescritura permite reutilizar