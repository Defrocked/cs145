package lab9;

public class Country {
	private int population;
	private double GDP;
	public boolean hostingOlympics;
	public String atWar;
	public String allied;
	
	public Country(int popCount, double grossDomesticProduct){
		population = popCount;
		GDP = grossDomesticProduct;
	}
	
	public String atWarWith(){
		return atWar;
	}
	
	public String alliedWith(){
		return allied;
	}
	
	public boolean hasAllies(){
		if (allied == ""){
			return false;
		}else{
			return true;
		}
	}
	
	public void allyWith(String countryName){
		allied = countryName;
	}
	
	public boolean isAtWar(){
		if (atWar == ""){
			return false;
		}else{
			return true;
		}
	}
	
	public void warAgainst(String countryName){
		atWar = countryName;
	}
	
	public boolean isHostingOlympics(){
		return hostingOlympics;
	}
	
	public void hostOlympics(){
		hostingOlympics = true;
	}
	
	public void cancelOlympics(){
		hostingOlympics = false;
	}
	
	public double getGDP(){
		return GDP;
	}
	
	public int getPopulation(){
		return population;
	}
	
	public void changePopulation(int popCount){
		population = popCount;
	}
	
	public void changeGDP(double grossDomesticProduct){
		GDP = grossDomesticProduct;
	}
	
		
}
