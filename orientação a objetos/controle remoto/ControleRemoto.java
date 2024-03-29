package conmtrole;

public class ControleRemoto implements Controlador {
 private int volume;
 private boolean ligado;
 private boolean tocando;
 public  ControleRemoto() {
	 this.volume=50;
	 this.ligado=false;
	 this.tocando=false;
 }
private int getVolume() {
	 return this.volume;
 }
private void setVolume( int vol) {
	this.volume=vol;
}
 private boolean getLigado() {
	 return this.ligado;
 }
private void setLigado(boolean l) {
	 this.ligado=l;
 }
private boolean getTocando() {
	 return this.tocando;
 }
 private void setTocando(boolean t) {
	 this.tocando=t;
 }
 
 // metódos abstratos agora
@Override
public void ligar() {
 this.setLigado(true);
	
}
@Override
public void desligar() {
 this.setLigado(false);	
}
@Override
public void abrirMenu() {
	System.out.println("Está ligado? " +this.getLigado());
	System.out.println("Está tocando? " + this.getTocando());
	System.out.println("Volume " + this.getVolume());
	for(int i=0;i<=this.getVolume();i+=10) {
		System.out.print(" | ");
	}
}
public void fecharMenu() {
	System.out.println("Fechando menu.. ");	
}
@Override
public void maisVolume() {
	if(this.getLigado()) {
		this.setVolume(this.getVolume()+5);
	}
}
@Override
public void menosVolume() {
      if(this.getLigado()) {
    	  this.setVolume(this.getVolume()-5);
      }
}
@Override
public void ligarMudo() {
	if(this.getLigado() && this.getVolume()>0) {
		this.setVolume(0);
	}
}
@Override
public void desligarMudo() {
	if(this.getLigado() && getVolume()==0) {
		this.setVolume(50);
	}
	
}
@Override
public void play() {
	if(getLigado() && !(this.getTocando())) {
		this.setTocando(true);
	}
	
}
@Override
public void pause() {
	if(this.getLigado() && this.getTocando()) {
		this.setTocando(false);
	}
}
 
}
