/**
 * Arreglo
 * 
 */

 var arreglo = [10,20,30,40,50,60,70,80];
 console.log(arreglo);

 var meses = new Array("January","February","March","April","May");
 
 meses.push("June","July");

//  Añadir al inicio del arreglo
meses.unshift("Mese 0");

// Eliminar elemento en la ultima de la lista
meses.pop()
// Elimina un elemento   del arreglo (el primer)
meses.shift()

// Quitar un rango
meses.splice(2,4);
// Revertir
meses.reverse()


 console.log(meses); //Para acceder en los arreglos basta con colocar la 
                         //posicion del nuetro arreglo , el elemento que se mostrara

//Unir un arreglo

var arreglo1 = [10,20,30,40,50,60],
    arreglo2 = [2,3,5,7,2,];

console.log(arreglo1.concat(arreglo2));

// Ordenar un arreglo

const arreglo3 = ["Manzana","Pera","Computadorea","Mouses"]
console.log(arreglo3.sort());

// Ordenar numero en unarreglo 
const arreglo4 = [2,6,4,5,56,76,1,9,09,656,87,23,];

arreglo4.sort(function(x,y){//Funcion
    return x - y;
})
console.log(arreglo4);


/**
 * Obejto en javaScript
 */

 const persona ={
       nombre: "Julio",
     Apellido: "Rivera",
     edad: 20,
     email:  "correo@gmail.com",
     musica: ['rock','pop','reggeton','English'],
     hogar:{
         ciudad: 'Guadalajara',
         pais: 'mexico'
     },

     fechaNacimiento: function(){
         return new Date().getFullYear() - this.edad;
     }
 }
 console.log(persona.fechaNacimiento());//Se puede imprmir todas las propiedades
                                //O tambien individuales
