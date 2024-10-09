public class Monedas {
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private String time_last_update_utc;

    // Getters y setters
    public String getBaseCode() {
        return base_code;
    }

    public void setBaseCode(String base_code) {
        this.base_code = base_code;
    }

    public String getTargetCode() {
        return target_code;
    }

    public void setTargetCode(String target_code) {
        this.target_code = target_code;
    }

    public double getConversionRate() {
        return conversion_rate;
    }

    public void setConversionRate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public String getTimeLastUpdateUtc() {
        return time_last_update_utc;
    }

    public void setTimeLastUpdateUtc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    @Override
    public String toString() {
        return "Monedas{" +
                "base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_rate=" + conversion_rate +
                ", time_last_update_utc='" + time_last_update_utc + '\'' +
                '}';
    }
}

