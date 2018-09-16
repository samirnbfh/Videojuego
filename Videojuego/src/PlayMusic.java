/*
  Autor: Samuel Ivan Ramirez Navarro
  
  Fecha: 9/16/2018
  
  Descripcion: Clase corre musica de fondo
*/

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusic implements Runnable{
  private Clip clip;
	private AudioInputStream ais;
  private String nombre; // nombre del archivo de la musica
  
  public PlayMusic(){
    nombre = "music.wav"; //nombre default para la musica de fondo
    try {
			File f = new File(nombre); 
			ais = AudioSystem.getAudioInputStream(f);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}
		catch(Exception e){
			e.printStackTrace();
		}
  }
  
  public PlayMusic(String nombre){
    this.nombre = nombre;
    try {
			File f = new File(nombre);
			ais = AudioSystem.getAudioInputStream(f);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}
		catch(Exception e){
			e.printStackTrace();
		}
  }
  public void run(){ //metodo run para que corra con el executor
    try {
				clip.loop(100);
			}
			catch(Exception e){
				e.printStackTrace();
			}
  }
}
