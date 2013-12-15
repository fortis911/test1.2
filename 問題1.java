package test1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class 問題1 extends Applet{

	public void paint(Graphics g){
		int dan = 5; // 段数
		int size = 20;//円の直径
		
		for(int i=0; i<dan; i++){
		
		for(int j=0; j<=i; j++){ 
			if(j==0 || i==dan-1){
				g.setColor(Color.black);
				g.fillOval(j*size, i*size, size, size);
			}else{
				g.setColor(Color.blue);
				g.fillOval(j*size, i*size, size, size);
			}
		}	
			
			
	
		}
	}
}

