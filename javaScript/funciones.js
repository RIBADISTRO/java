/**
 * Funciones en JavaScript Pt 1
 * */ 

 function saludar(nombre){
     console.log(`Hola ${nombre}`);
 }

 saludar('soy Julieta');
 saludar('Julio');
 saludar('Nayeli');


 //Funcion sumar

 function sumar(a,b){
     console.log(a*b);
 }

 sumar(3,4);
 sumar(40,30);
 sumar(40,38);

//  Retornar valor

function sumarR(a,b){
    return a + b
}

suma = sumarR(24.6 , 667);
suma = sumarR(24.6 , 62);
suma = sumarR(24.6 , 623);

console.log(suma);

// funcion de retorno

const saludar1 = function(nombre = 'Visitante', edad = 20, trabajo = 'desarrollador web'){
    return `Hola, tienes ${edad}, profesion ${trabajo} y te llamas  ${nombre}`
}

console.log(saludar1('Julio'));


// Otro funciones

//LIFE

(function(tecnologia){
    console.log(`Aprendiento ${tecnologia}`)
})('JavaScript');

/**
 * Metodo de propiedad
 * Cuando unas funciones se pone dentro de un objeto
 */

 const musica = {
     reproducir : function(){
         console.log(`Reproduciendo Musica`);
     },
     pausar: function(){
         console.log(`Pausando musica`);
     }
 }


 musica.borrar= function(id){
     console.log(`Borrando la musica con el ID: ${id}`);
 }

musica.reproducir();
musica.pausar();
musica.borrar(2);


/**
 * Manejando Try Catch
 * Funcion que no existe
 * 
 */

 try{
     algo();

 }catch(errror){
     console.log('La funcion no existe');
 }


 function obtenerCliente(){
     console.log('Descargando..');
     setTimeout(function(){
         console.log('Completo');
     },3000);
 }

 obtenerCliente();