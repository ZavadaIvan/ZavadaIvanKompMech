package ddz6;
import java.util.*;

public class Tem4Zavd5_5 {
	static class Planet {
	    private String name;

	    private List<Ocean> oceanList = new ArrayList<>();
	    private List<Continent> continentList = new ArrayList<>();
	    private List<Island> islandList = new ArrayList<>();

	    public Planet(String name) {
	        this.name = name;
	    }

	    public void addOcean(Ocean ocean) {
	        oceanList.add(ocean);
	    }

	    public void addContinent(Continent continent) {
	        continentList.add(continent);
	    }

	    public void addIsland(Island island) {
	        islandList.add(island);
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Ocean> getOceanList() {
	        return oceanList;
	    }

	    public List<Continent> getContinentList() {
	        return continentList;
	    }

	    public List<Island> getIslandList() {
	        return islandList;
	    }
	}
	static class Ocean {
	    private String name;

	    public Ocean(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}
	static class Island {
	    private String name;

	    public Island(String name) {
	        this.name = name;
	    }

	}
	static class Continent {
	    private String name;

	    public Continent(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	 
	}
	public static void main(String[] args) {

        Planet planet = new Planet("Земля");

        planet.addContinent(new Continent("Америка"));
        planet.addContinent(new Continent("Африка"));
        planet.addContinent(new Continent("Евразія"));

        planet.addOcean(new Ocean("Атлантичний"));
        planet.addOcean(new Ocean("Тихий"));

        planet.addIsland(new Island("Мадагаскар"));

        System.out.println("Назва планети: "+planet.getName());
        System.out.println("Назва континенту: "+OtrimatiKontinent(planet.getContinentList()));
        System.out.println("Кількість континентів:" + planet.getContinentList().size());
    }

    public static String OtrimatiKontinent(List<Continent> continentList) {
        String result = null;
        for (Continent continent: continentList) {
            result = continent.getName();
        }

        return result;
    }
	

}
