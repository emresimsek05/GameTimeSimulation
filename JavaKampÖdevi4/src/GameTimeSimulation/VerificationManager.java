package GameTimeSimulation;

public class VerificationManager implements VerificationService{

	@Override
	public void vericifationService(Gamer gamer) {
		System.out.println();
		
		
		if(gamer.getFirstName().length() > 2 && gamer.getNationalityNumber().length() == 11 && 
				gamer.getLastName().length() > 4 && gamer.getDogumTarihi() > 2000 ) {
			
			
			System.out.println("Verification completed");
			
		} else{
			
				System.out.println("NO MATCH");
		}
		
	}
}
