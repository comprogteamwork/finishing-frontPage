package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FrontPage implements ActionListener{
	
	ImageIcon frontPageIcon,sunsetIcon,birdsIcon,treeIcon;
	JFrame frontPage;
	JPanel frontPagePanel;
	JLabel labelforLogo,quote1,quote2,sunsetLabel,birdsLabel,treeLabel;
	JButton perosabutton;

	public void FrontPage() {
			
		
		frontPage = new JFrame();
		frontPage.setBounds(400,100,500,500);
		frontPage.setVisible(true);
		frontPage.setLayout(null);
		frontPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frontPage.getContentPane().setBackground(Color.cyan);
		frontPage.setResizable(false);
		
		frontPagePanel = new JPanel();
		frontPage.getContentPane().add(frontPagePanel);
		frontPagePanel.setLayout(null);
		frontPagePanel.setBackground(Color.LIGHT_GRAY);
		frontPagePanel.setBounds(17,15,450,430);
		

		frontPageIcon = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/frontpagelogo.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
		sunsetIcon = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/artsun.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		birdsIcon = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/birdspng.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
		treeIcon = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/tree.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));

		
		labelforLogo = new JLabel(frontPageIcon);
		frontPagePanel.add(labelforLogo);
		labelforLogo.setBounds(80,10,300,300);
		labelforLogo.setLayout(null);
		
		sunsetLabel = new JLabel(sunsetIcon);
		frontPagePanel.add(sunsetLabel);
		sunsetLabel.setBounds(320,0,100,100);
		sunsetLabel.setLayout(null);
		
		birdsLabel = new JLabel(birdsIcon);
		frontPagePanel.add(birdsLabel);
		birdsLabel.setBounds(10,60,150,150);
		birdsLabel.setLayout(null);
		
		treeLabel = new JLabel(treeIcon);
		frontPagePanel.add(treeLabel);
		treeLabel.setBounds(260,70,200,200);
		
		
		quote1 = new JLabel("Travel to Your Favorite Destination!");
		frontPagePanel.add(quote1);
		quote1.setBounds(100,320,400,30);
		quote1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		
		
		quote2 = new JLabel ("Travel brings happiness. So what are you waiting for?");
		frontPagePanel.add(quote2);
		quote2.setBounds(40,340,400,30);
		quote2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		
		perosabutton = new JButton("BOOK NOW");
		frontPagePanel.add(perosabutton);
		perosabutton.setBounds(150,370,150,50);
		perosabutton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		perosabutton.setBackground(Color.CYAN);
		perosabutton.addActionListener(this);
		
	
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == perosabutton) {
				
				AirlineType AirlineType = new AirlineType();
				try {
					AirlineType.AirlineType();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
	}
}

