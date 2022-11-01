/* pedir la hora por promt
evaluar la hora y responder
Buenos dias 6 - 11
Buenas tardes 12 - 18
Buenas noches 19 - 23
Dejame dormir 0 - 5
 */

let hora= Number(prompt("Escribe la hora")); 
if( (hora >=0) && (hora<=5) ){
    document.write("Déjame dormir");
}
else if( (hora >=6) && (hora<= 11) ){
    document.write("Buenos días");
    }
else if( (hora >=12) && (hora<= 18) ){
        document.write("Buenas tardes");
        }
else if( (hora >=19) && (hora<= 23) ){
            document.write("Buenas noches");
            }
else {
    document.write("Hora inextistente");
}