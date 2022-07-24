package practice;

public class Temperature {

    private double ftemp;

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public Temperature(){
        this.ftemp = 1d;
    }

    public void setFarenheit (double farenheit) {
        this.ftemp = farenheit;
    }

    public double getFarenheit () {
        return this.ftemp;
    }

    public double getCelcius () {
        return (ftemp - 32) * (double)5/9;
    }

    public double getKelvin () {
        return ((ftemp - 32)*(double)5/9 +273);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "ftemp=" + ftemp +
                '}';
    }
}
