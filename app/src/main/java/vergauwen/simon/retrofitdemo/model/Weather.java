package vergauwen.simon.retrofitdemo.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("latitude")
    @Expose
    private Float latitude;
    @SerializedName("longitude")
    @Expose
    private Float longitude;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("currently")
    @Expose
    private Currently currently;
    @SerializedName("hourly")
    @Expose
    private Hourly hourly;
    @SerializedName("daily")
    @Expose
    private Daily daily;
    @SerializedName("flags")
    @Expose
    private Flags flags;

    /**
     * @return The latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude The latitude
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * @return The longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude The longitude
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * @return The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @param timezone The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * @return The offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * @param offset The offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @return The currently
     */
    public Currently getCurrently() {
        return currently;
    }

    /**
     * @param currently The currently
     */
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    /**
     * @return The hourly
     */
    public Hourly getHourly() {
        return hourly;
    }

    /**
     * @param hourly The hourly
     */
    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    /**
     * @return The daily
     */
    public Daily getDaily() {
        return daily;
    }

    /**
     * @param daily The daily
     */
    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    /**
     * @return The flags
     */
    public Flags getFlags() {
        return flags;
    }

    /**
     * @param flags The flags
     */
    public void setFlags(Flags flags) {
        this.flags = flags;
    }
}

