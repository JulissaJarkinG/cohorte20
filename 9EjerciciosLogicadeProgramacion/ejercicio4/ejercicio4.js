let n1= parseInt(prompt("ingrese un numero "));
if(isNaN(n1)){
    alert("no es un numero");
}else{
function fibonacci (n1) {
	let fib =[0,1 ];
    n1=n1-1
    for (let i=2; i<= n1; i++){
        fib[i]=fib[i-1]+fib[i-2];
    }
    console.log(fib);
return fib[n1]

}
}
fibonacci(n1);