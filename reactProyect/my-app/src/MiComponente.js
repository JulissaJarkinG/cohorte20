import React from "react"

const MiComponente =() =>{
    let nombre ="pedroVar";
    let web= "generation.org";
    let usuario ={
        nombre: "JuanHer",
        apellido: "Robles",


    }
return(
 <>
<header>
   <h1>Componente creado</h1>
    <p>Este es mi primer componente</p>
    <ul>
        <li>
            nombre: 
            <strong>
                {usuario.apellido}
            </strong>
        </li>
        <li>
            web: {web}
        </li>
        <li>
            vue
        </li>
    </ul>
</header>
</>
)

} 
export default MiComponente;