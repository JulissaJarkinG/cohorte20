let n1= parseInt(prompt("ingrese un numero "));
let y =0;
do{
if(isNaN(n1)){
    console.log("no es un numero");
	
}else{
function factorial () {
	let total = 1; 
	for (i=1; i<=n1; i++) {
		total = total * i; 
	}
    console.log(total);
	return total; 
	
}

}
y++;
}while(y<=1);
factorial();