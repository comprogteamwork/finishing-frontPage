package AirlineReservation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends AirlineType{
	
	JFrame transactionFrame;
	JPanel TransactionPanel;
	JButton Payment, PaymentCancel;
	JTextField inputPayment;
	
	
	JLabel transactionProcessingFeeLabel, taxfee, fare, baggage, insurance, totalPayment, 
	airlineType,travelType, passengerDestination, passengerName, passengerAge,
	printName, printAge, printAirlineType, printTravelType, printDestination, 
	printProcessingFee, printTax, printFare, printBaggageFee, printInsuranceFee ,
	printTotalPayment, totalPassenger, printTotalPassenger, child, adult, senior,
	childDisplay, adultDisplay, seniorDisplay,childshowPayment, adultshowPayment,
	seniorshowPayment,confirmPayment;
	
	static double overAllPayment,seniorTotalPayment,seniorDiscount,userPaymentInput,passengersChange,
			forReceiptOverAllPayment;
	int childTotalPayment,adultTotalPayment,passengerPayment,deductTotalPassengerCount;
	static String gettingUserPayment;

	
	void falseHiding() {		
		
		 if(passenger.childCount==0 ) {
			 
				child.setVisible(false);
				childshowPayment.setVisible(false);
				childDisplay.setVisible(false);
				if(passenger.seniorCount==0) {
					senior.setVisible(false);
					seniorshowPayment.setVisible(false);
					seniorDisplay.setVisible(false);
					
					
					
				
					 
				}else if(passenger.adultCount==0) {
					adult.setVisible(false);
					adultshowPayment.setVisible(false);
					adultDisplay.setVisible(false);
					
					
				}
				
			
			}else if(passenger.adultCount==0) {
			
				adult.setVisible(false);
				adultshowPayment.setVisible(false);
				adultDisplay.setVisible(false);
		
			
			}else if(passenger.seniorCount==0){
				
				senior.setVisible(false);
				seniorshowPayment.setVisible(false);
				seniorDisplay.setVisible(false);
			
				
			}			 
	}
		
	void finalComputation() {
		passenger passenger = new passenger();
		passengerPayment = 	Integer.parseInt(PassengerAll[TransactionCounting][6])+Integer.parseInt(PassengerAll[TransactionCounting][7])+
				Integer.parseInt(PassengerAll[TransactionCounting][8])+Integer.parseInt(PassengerAll[TransactionCounting][9])+
				Integer.parseInt(PassengerAll[TransactionCounting][10]);
		
		
		childTotalPayment = passengerPayment * passenger.childCount;
		System.out.println("child total fare"+ childTotalPayment);
		
		adultTotalPayment = passengerPayment * passenger.adultCount;
		System.out.println("adult total fare"+ adultTotalPayment);
		
		seniorDiscount = Integer.parseInt(PassengerAll[TransactionCounting][8])*.20;
		seniorTotalPayment = ((passengerPayment  * passenger.seniorCount)-seniorDiscount)-Integer.parseInt(PassengerAll[TransactionCounting][7]);
		System.out.println("senior total fare"+ seniorTotalPayment);
		
		
		 if(passenger.childCount==0) {
			 overAllPayment =adultTotalPayment + seniorTotalPayment;
			 if(passenger.seniorCount==0) {
				 overAllPayment = adultTotalPayment;
			 }
				System.out.println("child=0");
		
			}else if(passenger.adultCount==0) {
				overAllPayment =childTotalPayment+seniorTotalPayment;
				
		
			}else if(passenger.seniorCount==0){
				overAllPayment =childTotalPayment+adultTotalPayment;
				System.out.println("senior=0");
			
				
				
					
			} else {
				overAllPayment =childTotalPayment+adultTotalPayment+seniorTotalPayment;
				System.out.println("over all payment" + overAllPayment)	;
				
			
			} 
	
		
		 
	}
	
	void Transaction() {
		finalComputation();
		logoImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/blackperosa.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	localbuttonImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/blackperosa.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    	facebookImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/facebook.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 	
    	twitterImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/twitter.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	instagramImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/instagram.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 
    	websiteImage = new ImageIcon(new ImageIcon("src/AirlineReservation/pictures/website.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)); 

		transactionFrame = new JFrame("TRANSACTION FRAME");
		transactionFrame.setBounds(400,100,500,500);
		transactionFrame.setVisible(true);
		transactionFrame.setLayout(null);
    	transactionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	transactionFrame.getContentPane().setBackground(Color.CYAN);
    	transactionFrame.setResizable(false);
    	
    	
        TransactionPanel = new JPanel();     
        transactionFrame.getContentPane().add(TransactionPanel);
        TransactionPanel.setLayout(null);
        TransactionPanel.setBackground(Color.LIGHT_GRAY);
        TransactionPanel.setBounds(17,15,450,430);
        
        dashline = new JLabel("-------------------------------------------------------------------------------------------------------------------");
        TransactionPanel.add(dashline);
        dashline.setBounds(0,80,600,30);
        
        airlinelabel = new JLabel(logoImage);
        TransactionPanel.add(airlinelabel);
		airlinelabel.setBounds(-80,-100,300,300);
		airlinelabel.setLayout(null);
		
		facebook = new JLabel(facebookImage);
		TransactionPanel.add(facebook);
		facebook.setBounds(140,-10,50,50);
		facebook.setLayout(null);
		
		facebookFont = new JLabel("perosa@facebook.com");
		TransactionPanel.add(facebookFont);
		facebookFont.setBounds(180,5,200,20);
		facebookFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		
		twitter = new JLabel(twitterImage);
		TransactionPanel.add(twitter);
		twitter.setBounds(140,12,50,50);
		twitter.setLayout(null);
		
		twitterFont = new JLabel("@perosaAirline");
		TransactionPanel.add(twitterFont);
		twitterFont.setBounds(180,28,200,20);
		twitterFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		
		instagram = new JLabel(instagramImage);
		TransactionPanel.add(instagram);
		instagram.setBounds(140,35,50,50);
		instagram.setLayout(null);
		
		instagramFont = new JLabel("@perosaAirline");
		TransactionPanel.add(instagramFont);
		instagramFont.setBounds(180,50,200,20);
		instagramFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		

		website = new JLabel(websiteImage);
		TransactionPanel.add(website);
		website.setBounds(140,55,50,50);
		website.setLayout(null);
		
		websiteFont = new JLabel("www.perosaAirline.com");
		TransactionPanel.add(websiteFont);
		websiteFont.setBounds(180,70,200,20);
		websiteFont.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
        
		
		 int x=16;
        passengerName = new JLabel("Name:");
        TransactionPanel.add(passengerName);
        passengerName.setBounds(30,110,120,20);
        passengerName.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
                
        printName = new JLabel("     "+ PassengerAll[TransactionCounting][1]);
        TransactionPanel.add(printName);
        printName.setBounds(100,110,200,20);
        printName.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        passengerAge = new JLabel("Age:");
        TransactionPanel.add(passengerAge);
        passengerAge.setBounds(30,135,120,20);;
        passengerAge.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printAge = new JLabel("     "+ PassengerAll[TransactionCounting][2]);
        TransactionPanel.add(printAge);
        printAge.setBounds(100,135,120,20);
        printAge.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        airlineType = new JLabel("Airline Type:" );
        TransactionPanel.add(airlineType);
        airlineType.setBounds(30,160,120,20);
        airlineType.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
       
        printAirlineType = new JLabel("     "+ PassengerAll[TransactionCounting][3]);
        TransactionPanel.add(printAirlineType);
        printAirlineType.setBounds(100,160,120,20);
        printAirlineType.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        travelType = new JLabel("Travel Type:" );
        TransactionPanel.add(travelType);
        travelType.setBounds(30,185,120,20);
        travelType.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printTravelType = new JLabel("     "+ PassengerAll[TransactionCounting][4]);
        TransactionPanel.add(printTravelType);
        printTravelType.setBounds(100,185,120,20);
        printTravelType.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        passengerDestination = new JLabel("Destination:" );
        TransactionPanel.add(passengerDestination);
        passengerDestination.setBounds(30,210,120,20);
        passengerDestination.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printDestination = new JLabel("     "+ PassengerAll[TransactionCounting][5]);
        TransactionPanel.add(printDestination);
        printDestination.setBounds(90,210,420,20);
        printDestination.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
   
        taxfee = new JLabel("Transaction Tax:  " );
        TransactionPanel.add(taxfee);
        taxfee.setBounds(250,110,420,20);
        taxfee.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printTax = new JLabel("     "+ PassengerAll[TransactionCounting][7]);
        TransactionPanel.add(printTax);
        printTax.setBounds(350,110,420,20);
        printTax.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        transactionProcessingFeeLabel = new JLabel("Transaction Fee:  " );
        TransactionPanel.add(transactionProcessingFeeLabel);
        transactionProcessingFeeLabel.setBounds(250,135,420,20);
        transactionProcessingFeeLabel.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        
        printProcessingFee = new JLabel("     "+ PassengerAll[TransactionCounting][6]);
        TransactionPanel.add(printProcessingFee);
        printProcessingFee.setBounds(350,135,120,20);
        printProcessingFee.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        baggage = new JLabel("Baggage Fee:  " );
        TransactionPanel.add(baggage);
        baggage.setBounds(250,160,420,20);
        baggage.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printBaggageFee = new JLabel("     "+ PassengerAll[TransactionCounting][9]);
        TransactionPanel.add(printBaggageFee);
        printBaggageFee.setBounds(350,160,120,20);
        printBaggageFee.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));

        
        fare = new JLabel("Fare:  ");
        TransactionPanel.add(fare);
        fare.setBounds(250,185,420,20);
        fare.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printFare = new JLabel("     "+ PassengerAll[TransactionCounting][8]);
        TransactionPanel.add(printFare);
        printFare.setBounds(350,185,120,20);
        printFare.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        insurance = new JLabel("Insurance Fee:  ");
        TransactionPanel.add(insurance);
        insurance.setBounds(250,210,420,20);
        insurance.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        insurance.setVisible(false);
        
        printInsuranceFee = new JLabel("     " + PassengerAll[TransactionCounting][10]);
        TransactionPanel.add(printInsuranceFee);
        printInsuranceFee.setBounds(350,210,120,20);
        printInsuranceFee.setVisible(false);
        printInsuranceFee.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        totalPassenger = new JLabel("Total Passenger:             "+ PassengerAll[TransactionCounting][12]);
        TransactionPanel.add(totalPassenger);
        totalPassenger.setBounds(30,235,420,30);
        totalPassenger.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
   
        child = new JLabel("Child");
        TransactionPanel.add(child);
        child.setBounds(30,260,420,20);
        child.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        childshowPayment = new JLabel(""+ childTotalPayment);
        TransactionPanel.add(childshowPayment);
        childshowPayment.setBounds(30,300,120,20);
        childshowPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
         
        adult = new JLabel("Adult");
        TransactionPanel.add(adult);
        adult.setBounds(180,260,420,20);
        adult.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
             
        adultshowPayment = new JLabel(" "+adultTotalPayment);
        TransactionPanel.add(adultshowPayment);
        adultshowPayment.setBounds(180,300,120,20);
        adultshowPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
    
        senior = new JLabel("Senior");
        TransactionPanel.add(senior);
        senior.setBounds(330,260,420,20);
        senior.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
  
        seniorshowPayment = new JLabel(""+ seniorTotalPayment);
        TransactionPanel.add(seniorshowPayment);
        seniorshowPayment.setBounds(330,300,120,20);
        seniorshowPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
       
     
        passenger getpassenger = new passenger();
        
        childDisplay = new JLabel("     "+getpassenger.childCount);
        TransactionPanel.add(childDisplay);
        childDisplay.setBounds(30,280,120,20);
        childDisplay.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
       
        
        adultDisplay = new JLabel("    "+getpassenger.adultCount);
        TransactionPanel.add(adultDisplay);
        adultDisplay.setBounds(180,280,120,20);
        adultDisplay.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        seniorDisplay = new JLabel("     "+getpassenger.seniorCount);
        TransactionPanel.add(seniorDisplay);
        seniorDisplay.setBounds(330,280,120,20);
        seniorDisplay.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
      
        totalPayment = new JLabel("Amount Payable:  ");
        TransactionPanel.add(totalPayment);
        totalPayment.setBounds(30,310,420,40);
        totalPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        printTotalPayment = new JLabel("  "+ overAllPayment);
        TransactionPanel.add(printTotalPayment);
        printTotalPayment.setBounds(170,320,80,20);
        printTotalPayment.setBackground(Color.WHITE);	
        printTotalPayment.setOpaque(true);
        printTotalPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
      
        
        confirmPayment = new JLabel("Please Enter Amount to Pay");
        TransactionPanel.add(confirmPayment);
        confirmPayment.setBounds(125,333,420,40);
        confirmPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        
        inputPayment = new JTextField();
        TransactionPanel.add(inputPayment);
        inputPayment.setBounds(170,365,100,30);
        inputPayment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        inputPayment.addActionListener(this);
        inputPayment.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent a) {
                char e = a.getKeyChar();
                if(Character.isLetter(e)){
                	inputPayment.setEditable(false);
           
                }
                else {
                	inputPayment.setEditable(true);
                	
                }
            }
            @Override
            public void keyPressed(KeyEvent a) {
                char e = a.getKeyChar();
                if(Character.isLetter(e)){
                
                }
                else {
                	inputPayment.setEditable(true);
                }
            }
            @Override
            public void keyReleased(KeyEvent a) {

            }
        });
        
        
        
        
        Payment = new JButton("Pay");
        TransactionPanel.add(Payment);
        Payment.setBounds(170,395,100,40);
        Payment.setFont(new Font("Berlin Sans FB", Font.PLAIN, x));
        Payment.addActionListener(this);
        
      
    	falseHiding();
	}  
        @Override
    	public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==Payment) {
        	Receipt Receipt = new Receipt();
        	Transaction Transaction = new Transaction();
   
        	gettingUserPayment = inputPayment.getText();
        	userPaymentInput = Double.parseDouble(gettingUserPayment);
        	
	        	if(userPaymentInput >= overAllPayment) {
	        		passengersChange = userPaymentInput - overAllPayment;
	        		System.out.println(passengersChange);
	        	 	Receipt.receiptMethod();
	        	 	transactionFrame.dispose();
	        	 	
	        	}else if(userPaymentInput < overAllPayment) {
	        		
	 
	        	JOptionPane.showMessageDialog(null, "AMOUNT SHOULD BE GREATER THAN or EQUAL " +overAllPayment, "INVALID INPUT",JOptionPane.ERROR_MESSAGE);
	        	
	        	Transaction.Transaction();
	    		Transaction.insurance.setVisible(true);
	    		transactionFrame.dispose();  
	        	}
        	 	
	        }
        
	}
}

