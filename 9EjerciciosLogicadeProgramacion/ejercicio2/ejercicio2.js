let tempC =parseInt (prompt("ingrese la temperatura en grados Celsius"));
function temperatura(){
if (tempC<=0){
    let fat=((tempC*0)*(9/5))+32;
    console.log(fat);
    let Kel=tempC+273.15;
    console.log(kel);

}else{
    alert("ingresa un numero");
}
}
temperatura();
