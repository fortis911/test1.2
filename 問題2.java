package daigakuJavatest1;

import java.applet.Applet;
import java.awt.Graphics;

public class 問題2 extends Applet{
	public void paint(Graphics g){
		int dice; /*サイコロの目*/
		int sum; /*目の合計*/
		int count; /*サイコロを振った回数*/
		
		sum=0; 
		count=0; 
		
		while(sum<=50){
			dice = (int)(Math.random()*6)+1;/*サイコロの目を乱数生成*/
			sum=sum+dice;/*各目の数を合計に加える*/
			count++;/*回数をカウント*/
			g.drawOval(20*count, 65, 20, 20);
		}
			
		}
}
