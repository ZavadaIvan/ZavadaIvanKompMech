package ddz7;

public class Sedan extends Autho{
	public Sedan(String model, double vartist, int rozhod, int shvidkist) {
        this.vartist = vartist;
        this.rozhod = rozhod;
        this.model = model;
        this.shvidkist = shvidkist;
       
    }
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sedan{");
        sb.append("model=").append(model);
        sb.append(", vartist='").append(vartist).append('\'');
        sb.append(",shvidkist =").append(shvidkist);
        sb.append(", rozhod='").append(rozhod).append('}');
        return sb.toString();
    }

}
