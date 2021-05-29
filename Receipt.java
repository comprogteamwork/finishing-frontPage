 package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

public class Receipt extends AirlineType{	
	
	String Date, Time,getPassengerCount;
	int forConvertionReserved,forPrintingReserved ;
	JFrame receiptFrame;
	JPanel receiptPanel;
	JButton confirm, cancelReceipt;
	JLabel name, age, travelType, airplaneType, travelDestination, printName, printAge, printTravelType,
			printAirplaneType,printTravelDestination, transactionNumber,perosaName,perosaqoute,perosathanks,enjoyTrip,
			travelDate,printTravelDate,cash,printCash,changeLabel,printChange,timeLabel,printTime,totalAmount,printtotalAmount,
			secondDashline,reservedPassenger,reservedPassengerCount;
	
	
	void setandgetMethod(){
		AirlineType AirlineType = new AirlineType();
		passenger passenger = new passenger() ;
		
		
		getPassengerCount = PassengerAll[TransactionCounting][12];
		forConvertionReserved = Integer.parseInt(getPassengerCount);
		forPrintingReserved = forConvertionReserved -1;
		
		
	if(knowingTypeofAirplane==0) {
		Date ="   2025-12-31";
		
		if(knowingDestination == 0){
			Time = "   06:00";
		}else if(knowingDestination==1) {
			Time = "   08:00";
		}else if(knowingDestination==2) {
			Time = "   10:00";
		}else if(knowingDestination==3) {
			Time = "   12:00";
		}else if(knowingDestination==4) {
			Time = "   14:00";
		}else if(knowingDestination==5) {
			Time = "   16:00";
		}else if(knowingDestination==6) {
			Time = "   18:00";
		}else if(knowingDestination==7){
			Time = "   20:00";
		}else if(knowingDestination==8) {
			Time = "   22:00";
		}else if(knowingDestination==9) {
			Time = "   24:00";
		}
	}else if(knowingTypeofAirplane==1) {
		Date ="   2025-12-30";
		if(knowingDestination == 0){
			Time = "   06:00";
		}else if(knowingDestination==1) {
			Time = "   08:00";
		}else if(knowingDestination==2) {
			Time = "   10:00";
		}else if(knowingDestination==3) {
			Time = "   12:00";
		}else if(knowingDestination==4) {
			Time = "   14:00";
		}else if(knowingDestination==5) {
			Time = "   16:00";
		}else if(knowingDestination==6) {
			Time = "   18:00";
		}else if(knowingDestination==7){
			Time = "   20:00";
		}else if(knowingDestination==8) {
			Time = "   22:00";
		}else if(knowingDestination==9) {
			Time = "   24:00";
		}
	}else {
		Date ="   2025-12-29";
		if(knowingDestination == 0){
			Time = "   06:00";
		}else if(knowingDestination==1) {
			Time = "   08:00";
		}else if(knowingDestination==2) {
			Time = "   10:00";
		}else if(knowingDestination==3) {
			Time = "   12:00";
		}else if(knowingDestination==4) {
			Time = "   14:00";
		}else if(knowingDestination==5) {
			Time = "   16:00";
		}else if(knowingDestination==6) {
			Time = "   18:00";
		}else if(knowingDestination==7){
			Time = "   20:00";
		}else if(knowingDestination==8) {
			Time = "   22:00";
		}else if(knowingDestination==9) {
			Time = "   24:00";
	
		
		}
	
	
	
	}	}void receiptMethod() {
		setandgetMethod();
		logoImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/blackperosa.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	localbuttonImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/blackperosa.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	facebookImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 	
    	twitterImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/twitter.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	instagramImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/instagram.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	websiteImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/website.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	barcodeImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/barcode.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)); 
    	
    	PassengerAll[TransactionCounting][0] = String.valueOf(OverAllTransaction);
	
		
		receiptFrame = new JFrame("RECEIPT FRAME");
		receiptFrame.setBounds(400,100,500,550);
		receiptFrame.setVisible(true);
		receiptFrame.setLayout(null);
		receiptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		receiptFrame.getContentPane().setBackground(Color.cyan);
		receiptFrame.setResizable(false);
		
		
		receiptPanel = new JPanel();
		receiptFrame.getContentPane().add(receiptPanel);
		receiptPanel.setLayout(null);
		receiptPanel.setBackground(Color.LIGHT_GRAY);
		receiptPanel.setBounds(17,15,450,480);
		
	
		dashline = new JLabel("-------------------------------------------------------------------------------------------------------------------");
		receiptPanel.add(dashline);
        dashline.setBounds(0,80,600,30);
        
        secondDashline = new JLabel("---------------------------------------------------------------------------------------------------------------------");
		receiptPanel.add(secondDashline);
		secondDashline.setBounds(0,430,600,30);
		
		
		
        airlinelabel = new JLabel(logoImage);
        receiptPanel.add(airlinelabel);
		airlinelabel.setBounds(-80,-100,300,300);
		airlinelabel.setLayout(null);
		
		facebook = new JLabel(facebookImage);
		receiptPanel.add(facebook);
		facebook.setBounds(140,-10,50,50);
		facebook.setLayout(null);
		
		facebookFont = new JLabel("perosa@facebook.com");
		receiptPanel.add(facebookFont);
		facebookFont.setBounds(180,5,200,20);
		facebookFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		
		twitter = new JLabel(twitterImage);
		receiptPanel.add(twitter);
		twitter.setBounds(140,12,50,50);
		twitter.setLayout(null);
		
		twitterFont = new JLabel("@perosaAirline");
		receiptPanel.add(twitterFont);
		twitterFont.setBounds(180,28,200,20);
		twitterFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		instagram = new JLabel(instagramImage);
		receiptPanel.add(instagram);
		instagram.setBounds(140,35,50,50);
		instagram.setLayout(null);
		
		instagramFont = new JLabel("@perosaAirline");
		receiptPanel.add(instagramFont);
		instagramFont.setBounds(180,50,200,20);
		instagramFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		

		website = new JLabel(websiteImage);
		receiptPanel.add(website);
		website.setBounds(140,55,50,50);
		website.setLayout(null);
		
		websiteFont = new JLabel("www.perosaAirline.com");
		receiptPanel.add(websiteFont);
		websiteFont.setBounds(180,70,200,20);
		websiteFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
				
		name = new JLabel("Passenger Name:");
		receiptPanel.add(name);
		name.setBounds(50,100,420,30);
		name.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		printName = new JLabel(" "+PassengerAll[TransactionCounting][1]);
		receiptPanel.add(printName);
		printName.setBounds(50,125,180,20);
		printName.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printName.setBackground(Color.WHITE);	
		printName.setOpaque(true);
	
		airplaneType = new JLabel("Seat Class:");
		receiptPanel.add(airplaneType);
		airplaneType.setBounds(50,150,420,30);
		airplaneType.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));

		printAirplaneType= new JLabel(""+PassengerAll[TransactionCounting][3]);
		receiptPanel.add(printAirplaneType);
		printAirplaneType.setBounds(50,175,180,20);
		printAirplaneType.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printAirplaneType.setBackground(Color.WHITE);	
		printAirplaneType.setOpaque(true);
		
		travelType = new JLabel("Travel Type:");
		receiptPanel.add(travelType);
		travelType.setBounds(50,200,420,30);
		travelType.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
				
		
		printTravelType = new JLabel(""+PassengerAll[TransactionCounting][4]);
		receiptPanel.add(printTravelType);
		printTravelType.setBounds(50,225,180,20);
		printTravelType.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printTravelType.setBackground(Color.WHITE);	
		printTravelType.setOpaque(true);
		
	
		travelDestination = new JLabel("Travel Destination:");
		receiptPanel.add(travelDestination);
		travelDestination.setBounds(50,250,420,30);
		travelDestination.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		printTravelDestination = new JLabel(""+PassengerAll[TransactionCounting][5]);
		receiptPanel.add(printTravelDestination);
		printTravelDestination.setBounds(50,275,180,20);
		printTravelDestination.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printTravelDestination.setBackground(Color.WHITE);	
		printTravelDestination.setOpaque(true);
		
		travelDate= new JLabel("Date:");
		receiptPanel.add(travelDate);
		travelDate.setBounds(250,100,100,30);
		travelDate.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		
		printTravelDate = new JLabel(""+Date);
		receiptPanel.add(printTravelDate);
		printTravelDate.setBounds(250,125,90,20);
		printTravelDate.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		printTravelDate.setBackground(Color.WHITE);	
		printTravelDate.setOpaque(true);
	
		timeLabel = new JLabel("Time:");
		receiptPanel.add(timeLabel);
		timeLabel.setBounds(350,100,420,30);
		timeLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
	
		
		printTime = new JLabel(""+Time);
		receiptPanel.add(printTime);
		printTime.setBounds(350,125,80,20);
		printTime.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printTime.setBackground(Color.WHITE);	
		printTime.setOpaque(true);
		
		
		Transaction Transaction = new Transaction();
		
		totalAmount= new JLabel("Total Amount:");
		receiptPanel.add(totalAmount);
		totalAmount.setBounds(250,150,420,30);
		totalAmount.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		
		
		printtotalAmount = new JLabel(""+ Transaction.overAllPayment);
		receiptPanel.add(printtotalAmount);
		printtotalAmount.setBounds(250,175,180,20);
		printtotalAmount.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printtotalAmount.setBackground(Color.WHITE);	
		printtotalAmount.setOpaque(true);
		
		
		cash = new JLabel("Cash:");
		receiptPanel.add(cash);
		cash.setBounds(250,200,420,30);
		cash.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
	
		printCash = new JLabel("" +Transaction.gettingUserPayment);
		receiptPanel.add(printCash);
		printCash.setBounds(250,225,180,20);
		printCash.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printCash.setBackground(Color.WHITE);	
		printCash.setOpaque(true);
	
		changeLabel= new JLabel("Change:");
		receiptPanel.add(changeLabel);
		changeLabel.setBounds(250,250,420,30);
		changeLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		printChange = new JLabel(""+Transaction.passengersChange );
		receiptPanel.add(printChange);
		printChange.setBounds(250,275,180,20);
		printChange.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		printChange.setBackground(Color.WHITE);	
		printChange.setOpaque(true);
		
		reservedPassenger = new JLabel("Reserved Passenger");
		receiptPanel.add(reservedPassenger);
		reservedPassenger.setBounds(50,300,200,30);
		reservedPassenger.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
	//	reservedPassenger.setVisible(false);
		
		
		reservedPassengerCount = new JLabel(""+ forPrintingReserved);
		receiptPanel.add(reservedPassengerCount);
		reservedPassengerCount.setBounds(50,325,180,20);
		reservedPassengerCount.setBackground(Color.WHITE);	
		reservedPassengerCount.setOpaque(true);
	//	reservedPassengerCount.setVisible(false);
		
		
	
		
		transactionNumber = new JLabel("Transaction #"+ PassengerAll[TransactionCounting][0]); 
		receiptPanel.add(transactionNumber);
		transactionNumber.setBounds(160,380,400,30);
		transactionNumber.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		
		
		perosathanks = new JLabel("THANK YOU FOR CHOOSING PEROSA AIRLINE");
		receiptPanel.add(perosathanks);
		perosathanks.setBounds(70,405,600,20);
		perosathanks.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));

		enjoyTrip = new JLabel("ENJOY YOUR TRIP!");
		receiptPanel.add(enjoyTrip);
		enjoyTrip.setBounds(160,420,600,20);
		enjoyTrip.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		
		
		barcode = new JLabel(barcodeImage);
		receiptPanel.add(barcode);
	    barcode.setLayout(null);
	    barcode.setBounds(340,300,100,100);
		      
        
		confirm = new JButton("CLOSE");
		receiptPanel.add(confirm);
		confirm.setBounds(170,450,100,30);
		confirm.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		confirm.addActionListener(this);
		
		
		
		
	
	}	public void actionPerformed(ActionEvent e) {
		AirlineType jonnyPassenger = new AirlineType();
        
		if(e.getSource()==confirm) {
			
		int bookAgain = JOptionPane.showConfirmDialog(null, "Do you Want to Book Another Ticket?");
		
		if(bookAgain == 0) {
			
			try {
				jonnyPassenger.AirlineType();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			receiptFrame.dispose();
			
		}
		else if (bookAgain==1) {
			System.exit(0);
		}
		
		}		
	}
}




