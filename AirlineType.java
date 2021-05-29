package AirlineReservation;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AirlineType implements ActionListener{
	ImageIcon logoImage,localbuttonImage,facebookImage, twitterImage,instagramImage,websiteImage,barcodeImage;
	
	JLabel airlinelabel,dashline,seatClassLabel,kindlyLabel,facebook,instagram,twitter,website,facebookFont,
			twitterFont, instagramFont,websiteFont,barcode;
	JFrame airplaneType;
    JButton buttonPrivate, buttonBusiness, buttonRegular ;
	static int knowingTypeofAirplane, knowingDestination;
	
    
    public static  String PassengerAll[][] = new String[1350][13];
    public static int OverAllTransaction = 0 , TransactionCounting = 1;
    
    /* index 0 = control number
     	index 1 = name
     	index 2 = age
     	index 3 = airplane type
     	index 4 = travel type
     	index 5 = destination
     	index 6 = transaction fee
     	index 7 = transaction tax
     	index 8 = Fare
     	index 9 = baggage fee
     	index 10 =insurance
     	index 11 =total payment
     	index 12 =total passenger
     */
    
    public void catchingError() {
    	try{
    		AirlineType();
    	}catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}
    }
    
    public void AirlineType()throws FileNotFoundException{    	
    	
    	logoImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/blackperosa.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	localbuttonImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/blackperosa.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	facebookImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 	
    	twitterImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/twitter.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	instagramImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/instagram.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	websiteImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/website.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	barcodeImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/barcode.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)); 
    	
    	
    	airplaneType = new JFrame("AIRLINE FRAME");
    	airplaneType.setBounds(400,100,500,500);
    	airplaneType.setVisible(true);
    	airplaneType.setLayout(null);
    	airplaneType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	airplaneType.getContentPane().setBackground(Color.cyan);
    	airplaneType.setResizable(false);

    	  
        JPanel airplaneTypePanel = new JPanel();
        airplaneType.getContentPane().add(airplaneTypePanel);
        airplaneTypePanel.setLayout(null);
        airplaneTypePanel.setBackground(Color.LIGHT_GRAY);
        airplaneTypePanel.setBounds(17,15,450,430);
        
      
        dashline = new JLabel("-------------------------------------------------------------------------------------------------------------------");
        airplaneTypePanel.add(dashline);
        dashline.setBounds(0,80,600,30);
        
        airlinelabel = new JLabel(logoImage);
        airplaneTypePanel.add(airlinelabel);
		airlinelabel.setBounds(-80,-100,300,300);
		airlinelabel.setLayout(null);
		
		facebook = new JLabel(facebookImage);
		airplaneTypePanel.add(facebook);
		facebook.setBounds(140,-10,50,50);
		facebook.setLayout(null);
		
		facebookFont = new JLabel("perosa@facebook.com");
		airplaneTypePanel.add(facebookFont);
		facebookFont.setBounds(180,5,200,20);
		facebookFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		
		twitter = new JLabel(twitterImage);
		airplaneTypePanel.add(twitter);
		twitter.setBounds(140,12,50,50);
		twitter.setLayout(null);
		
		twitterFont = new JLabel("@perosaAirline");
		airplaneTypePanel.add(twitterFont);
		twitterFont.setBounds(180,28,200,20);
		twitterFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		instagram = new JLabel(instagramImage);
		airplaneTypePanel.add(instagram);
		instagram.setBounds(140,35,50,50);
		instagram.setLayout(null);
		
		instagramFont = new JLabel("@perosaAirline");
		airplaneTypePanel.add(instagramFont);
		instagramFont.setBounds(180,50,200,20);
		instagramFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		

		website = new JLabel(websiteImage);
		airplaneTypePanel.add(website);
		website.setBounds(140,55,50,50);
		website.setLayout(null);
		
		websiteFont = new JLabel("www.perosaAirline.com");
		airplaneTypePanel.add(websiteFont);
		websiteFont.setBounds(180,70,200,20);
		websiteFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		kindlyLabel = new JLabel("KINDLY");
		airplaneTypePanel.add(kindlyLabel);
		kindlyLabel.setBounds(190,130,70,30);
		kindlyLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		
		
        seatClassLabel = new JLabel("CHOOSE YOUR SEAT CLASS");
        airplaneTypePanel.add(seatClassLabel);
        seatClassLabel.setBounds(110,150,300,30);
        seatClassLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        
        buttonPrivate = new JButton("Private");
        airplaneTypePanel.add(buttonPrivate);
        buttonPrivate.setBounds(150,200,150,50);
        buttonPrivate.setBackground(Color .CYAN);
        buttonPrivate.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        buttonPrivate.addActionListener(this);
        

        buttonBusiness = new JButton("Business");
        airplaneTypePanel.add(buttonBusiness);
        buttonBusiness.setBounds(150,275,150,50);
        buttonBusiness.setBackground(Color.CYAN);
        buttonBusiness.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        buttonBusiness.addActionListener(this);
        
        buttonRegular = new JButton("Regular Fare");
        airplaneTypePanel.add(buttonRegular);
        buttonRegular.setBounds(150,350,150,50);
        buttonRegular.setBackground(Color.CYAN);
        buttonRegular.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        buttonRegular.addActionListener(this);  
             
    	
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		Destination Destination = new Destination();

		
		
		 if(e.getSource()== buttonPrivate ){
			knowingTypeofAirplane = 0;
			 
			 
			 ++OverAllTransaction;
			 TransactionCounting = OverAllTransaction - 1;	
			 			 
			 PassengerAll[TransactionCounting][3] = "Private";
			 PassengerAll[TransactionCounting][6] =  "550";
			 PassengerAll[TransactionCounting][7] = "4260";
			 PassengerAll[TransactionCounting][9] = "1250";
			 System.out.println(TransactionCounting);
			 System.out.println(PassengerAll[TransactionCounting][3]);
			 System.out.println("Processing Fee	: "+ PassengerAll[TransactionCounting][6]);
			 System.out.println("Travel Tax	: "+PassengerAll[TransactionCounting][7]);
			 System.out.println("Baggage Fee	: "+PassengerAll[TransactionCounting][9]);
			 System.out.println("Hello World");
			 
			 Destination.Destination();
			 airplaneType.dispose();
			 
         }else if(e.getSource()== buttonBusiness){
			knowingTypeofAirplane = 1;
        	 
     		
        	 ++OverAllTransaction;
        	 TransactionCounting = OverAllTransaction - 1;
			 //System.out.println(TransactionCounting);
  
        	 PassengerAll[TransactionCounting][3] =  "Business";   	 
        	 PassengerAll[TransactionCounting][6] =  "550"; 
        	 PassengerAll[TransactionCounting][7] =  "5700";
        	 PassengerAll[TransactionCounting][9] = "2850";
        	 System.out.println(TransactionCounting);
        	 System.out.println(PassengerAll[TransactionCounting][3]);
        	 System.out.println("Processing Fee	: "+ PassengerAll[TransactionCounting][6]);
        	 System.out.println("Travel Tax	: "+ PassengerAll[TransactionCounting][7] );
        	 System.out.println("Baggage Fee	: "+ PassengerAll[TransactionCounting][9]);
        	 Destination.Destination();
        	 airplaneType.dispose();
        	 
         }else if(e.getSource()== buttonRegular){      	
			knowingTypeofAirplane = 2;
        	
        	 ++OverAllTransaction;
        	 TransactionCounting = OverAllTransaction - 1;
        	
        	 PassengerAll[TransactionCounting][3] = "Regular";
         	PassengerAll[TransactionCounting][6] = "225"; 
         	PassengerAll[TransactionCounting][7] = "2500";
         	PassengerAll[TransactionCounting][9] = "950";
         	System.out.println(TransactionCounting);
           	System.out.println(PassengerAll[TransactionCounting][3]);
           	System.out.println("Processing Fee	: "+ PassengerAll[TransactionCounting][6]);
           	System.out.println("Travel Tax	: "+ PassengerAll[TransactionCounting][7]);
           	System.out.println("Baggage Fee	: "+ PassengerAll[TransactionCounting][9]);
       		
        	 
        	 Destination.Destination();
        	 airplaneType.dispose();
          }
	}	
}
