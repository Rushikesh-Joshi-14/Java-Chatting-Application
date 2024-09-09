package ChatApp;

import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.net.* ;


public class mainScreen extends JFrame {
	Socket s ;
	
	
	mainScreen(){
		
		setSize(500,800);
		
		Font font = new Font("Segoe Script", Font.BOLD, 30);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/appIcon.jpg")) ; 
		Image i2 = i1.getImage().getScaledInstance(400, 100, Image.SCALE_DEFAULT) ;
		ImageIcon i3 = new ImageIcon(i2) ;
		JLabel mainIcon = new JLabel(i3) ;
		mainIcon.setBounds(40, 0 , 400 , 150) ;
		
		
		JPanel main = new JPanel();
		main.setBackground(Color.black);
		main.setBounds(20,150, 440 , 600);
		main.setLayout(null);
		
		
		JButton serverLogin = new JButton("Normal Chat") ;
		JButton clientLogin = new JButton("Group Chat") ;
		
		serverLogin.setBounds(150, 200 , 200 , 50);
		serverLogin.setBackground(Color.white);
		
		
		clientLogin.setBounds(150, 300 , 200 , 50);
		clientLogin.setBackground(Color.white);
		
		

		serverLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ae) {
//				setVisible(false);
				dispose() ;
				new Server1("rushikesh");
				new Client() ;
				
				
			}
		}) ;
		
		clientLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent ae) {
//				setVisible(false);
				dispose();
				
				
				
				
				
				
			}
		}) ;
		
		
		main.add(clientLogin) ;
		main.add(serverLogin) ;
		add(mainIcon) ;
		add(main) ;
		
		
		setLayout(null) ;
		setBackground(Color.white) ;
		setVisible(true) ;
		
		
		
	}
	

	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainScreen() ;
	}

}
