package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class PeliculasController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculasController(){
        // Inicializar la lista de peliculas con algunos datos
        peliculas.add(new Pelicula(1, 
                                    "Pinocho", 
                                    2022, 
                                    "Guillermo del Toro", 
                                    "Fantasia", 
                                    "En Italia, el deseo de un hombre le da vida mágicamente a un muñeco de madera. Sin embargo, padre e hijo tendrán que sobrevivir al auge del fascismo.")
                    );

        peliculas.add(new Pelicula( 2, 
                                    "Harry Potter y la piedra filosofal", 
                                    2001, 
                                    "Chris Columbus", 
                                    "Fantasia", 
                                    "Se narran los primeros pasos de Harry en el mundo de la magia, así como su primer enfrentamiento con Voldemort, quien en su búsqueda de la inmortalidad quiere obtener el poder de la piedra filosofal y posee al profesor de defensa contra las artes oscuras.")
                    );
        peliculas.add(new Pelicula( 3, 
                                    "Iron Man", 
                                    2008, 
                                    "Jon Favreau", 
                                    "Accion", 
                                    "La película cuenta la historia de Anthony Stark, un multimillonario industrial y genio inventor, que es secuestrado y obligado a construir un arma devastadora. En su lugar, utilizando su inteligencia e ingenio, Anthony construye una armadura de alta tecnología y escapa de su cautiverio.")
                    );              
        peliculas.add(new Pelicula( 4, 
                                    "Die Hard", 
                                    1988, 
                                    "John McTiernan", 
                                    "Accion", 
                                    "John McClane (Bruce Willis) es un policía de Nueva York que visita la ciudad de Los Ángeles para reconciliarse con su exesposa, Holly Gennaro (Bonnie Bedelia), quien se encuentra en una fiesta de Navidad en el edificio Nakatomi Plaza, piso 30, propiedad de un japonés Joe Takagi.")
                    );
        peliculas.add(new Pelicula( 5, 
                                    "Rambo: Primera Sangre", 
                                    1982, 
                                    "Ted Korcheff", 
                                    "Accion", 
                                    "Esta película de acción cuenta la historia de John Rambo, un héroe de la guerra de Vietnam que vaga de ciudad en ciudad en busca de sus antiguos compañeros de armas. Cuando se estaba preparando para cruzar una pequeña ciudad para comer, el sheriff Will Teasle le arresta por vagabundeo.")
                    );
    }
    

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas(){
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculasById(@PathVariable int id){
        for(Pelicula pelicula : peliculas){
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        // Si no encuenta una pelicula con el ID especificado, puedes manejarlo adecuadamente
        return null;
    }
    
    
}
