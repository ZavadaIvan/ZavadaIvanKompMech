package ddz7;

public class Krossover extends Autho {
	public Krossover(String model, double vartist, int rozhod, int shvidkist) {
        this.vartist = vartist;
        this.rozhod = rozhod;
        this.model = model;
        this.shvidkist = shvidkist;
       
    }
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Krossover{");
        sb.append("model=").append(model);
        sb.append(", vartist='").append(vartist).append('\'');
        sb.append(",shvidkist =").append(shvidkist);
        sb.append(", rozhod='").append(rozhod).append('}');
        return sb.toString();
    }

}
