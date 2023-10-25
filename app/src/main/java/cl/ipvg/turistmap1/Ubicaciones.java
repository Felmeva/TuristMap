package cl.ipvg.turistmap1;

public class Ubicaciones {

    public double latcat;
    public double lonCat;
    public double latEst;
    public double lonEst;
    public double latIp;
    public double lonIp;
    public double latMall;
    public double lonMall;

    public Ubicaciones() {
        latcat = -36.61831;
        lonCat = -72.10787;
        latEst = -36.61831;
        lonEst = -72.10787;
        latMall = -36.60961;
        lonMall = -72.10090;
        latIp = -36.58965;
        lonIp = -72.08212;
    }

    public double getLatcat() {
        return latcat;
    }

    public double getLonCat() {
        return lonCat;
    }

    public double getLatEst() {
        return latEst;
    }

    public double getLonEst() {
        return lonEst;
    }

    public double getLatIp() {
        return latIp;
    }

    public double getLonIp() {
        return lonIp;
    }

    public double getLatMall() {
        return latMall;
    }

    public double getLonMall() {
        return lonMall;
    }
}
