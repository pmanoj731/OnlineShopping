
public class Carddetails
{
	String creditcardName;
	int creditcardNumber;
	String creditcardexpirationDate;
	int creditcardcvvNumber;
	
	
	Bankinfo bankinfo;
	
Confirmationrecipt confirmrecipt;


public Confirmationrecipt paymentSucessfull(String cardname, int cardnum , String exp,int cvv){
	
	this.creditcardName=cardname;
	this.creditcardNumber=cardnum;
	this.creditcardexpirationDate=exp;
	this.creditcardcvvNumber=cvv;
	
	bankinfo = new Bankinfo();
	if(bankinfo.cardName.equals(creditcardName) && bankinfo.cardNumber==creditcardNumber
			&&bankinfo.cvvNumber==creditcardcvvNumber&& bankinfo.expirationDate.equals(creditcardexpirationDate))

	
	{
		System.out.println("\n"+"payment sucessfull");
				
    }
	confirmrecipt =new Confirmationrecipt();
	return confirmrecipt;

	
}



}	



