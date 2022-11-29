package ddz7;

 

public abstract class Autho {
    public int shvidkist;
    public int rozhod;
    public String model;
    public double vartist;
 

 
    public double GetVartist() {
        return vartist;
    }
 
    public void setVarlist(double vartist) {
        this.vartist = vartist;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    public int getRozhod() {
        return rozhod;
    }
 
    public void setRozhod(int rozhod) {
        this.rozhod = rozhod;
    }
 
    public double getShvidkist() {
        return shvidkist;
    }
 
    public void setShvidkist(int shvidkist) {
        this.shvidkist = shvidkist;
    }
 
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autho{");
        sb.append("model=").append(model);
        sb.append(", vartist='").append(vartist).append('\'');
        sb.append(",shvidkist =").append(shvidkist);
        sb.append(", rozhod='").append(rozhod).append('}');
        return sb.toString();
    }
}

