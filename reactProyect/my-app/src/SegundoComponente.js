import React from "react"
export const SegundoComponente =() =>{
    const libros = ["Harry Potter","El periquito sarniento", "el hobbit", "el principito"];
    
    return (
        <div>
            <h1>
                SegundoComponente
            </h1>
            <ul>
               {
                    libros.map((libro, indice)=>{
                        return <li key={indice}>{libro}</li>
                    })
                
                }
            </ul>

        </div>
    )
}