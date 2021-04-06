import javax.swing.*;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Main extends JFrame {
	
	
	private static final long serialVersionUID=1L;
	
	JButton startDrawing;
	
	int windowWidth = 1750;
	int windowHeight = 1000;
	
	Color[]  shapeColor={Color.orange, Color.red, Color.yellow,Color.blue,
			Color.black, Color.pink, Color.cyan, Color.magenta, Color.gray}; 

	public static void main(String[] args) {
		new Main();

	}
	
	public Main(){
		
		this.setSize(windowWidth, windowHeight);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Flyweight Test");
		
		JPanel contentPanel = new JPanel();
		
		contentPanel.setLayout(new BorderLayout());
		
		final JPanel drawingPanel = new JPanel();
		
		startDrawing = new JButton("Button 1");
		
		contentPanel.add(drawingPanel, BorderLayout.CENTER);
		
		contentPanel.add(startDrawing, BorderLayout.SOUTH);
		
		startDrawing.addActionListener(new ActionListener() {;
			
			public void actionPerformed(ActionEvent event){
				
				Graphics g = drawingPanel.getGraphics();
				
				long startTime = System.currentTimeMillis();
				
				for (int i =0; i<10000; i++){
					
					MyRect rect = RectFactory.getRect(getRandColor());
					rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
					
					
				}
				
				long endTime = System.currentTimeMillis();
				
				System.out.println("That took "+(endTime - startTime)+" miliseconds");
			
				
				
				
			}
			
			
			
	});	
		
		this.add(contentPanel);
		this.setVisible(true);
		
			
			
			
			
		
		
		
	}
	
	private int getRandX(){return (int)(Math.random()*windowWidth);}
	private int getRandY(){return (int)(Math.random()*windowHeight);}
	
	private Color getRandColor(){
		
		Random randomGenerator = new Random();
		
		int randInt = randomGenerator.nextInt(9);
		
		return shapeColor[randInt];
		
	}

}
