package oop_interface;

public class Testhodpital {

	public static void main(String[] args) {

                Fortis fh=new Fortis();
                fh.cardioservice();
                fh.dental();
                fh.oncologyservice();
                fh.emergencyservice();
                fh.ortho();
                fh.medicaltrain();
                fh.covidtest();
                fh.covidguideline();
                fh.medicalinfo();
                
                Usmedical us=new Fortis();
                us.cardioservice();
                us.emergencyservice();
                us.oncologyservice();
                us.physioservice();
                
                Indianmedi i1=new Fortis();
                i1.dental();
                i1.emergencyservice();
                i1.ortho();
                
                Usmedical.billing();
               
	}
	

}
