/*
Hecho por Paco C
15/07/2018
Clase hija de Personajes en la cual se heredan todos los atributos y solo se ponen los constructores
*/
import java.awt.Color;
import java.awt.Graphics;

public class Heroes extends Personajes {
	

		public Heroes() {//Constructor por default
			super();
		}//fin del constructor por default
		public Heroes(String nombre, int HP, int damage, int tam,int tam1) {//construcotr por parametros que recibe el nombre del heroes con el daño y su tamaño
			nombre=this.nombre;
			Hp=this.Hp;
			damage=this.damage;
			tam=this.tam;
			tam1=this.tam1;
			
		}
}
	
