package vergauwen.simon.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("precipIntensity")
    @Expose
    private float precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private float precipProbability;
    @SerializedName("precipType")
    @Expose
    private String precipType;
    @SerializedName("temperature")
    @Expose
    private Float temperature;
    @SerializedName("apparentTemperature")
    @Expose
    private Float apparentTemperature;
    @SerializedName("dewPoint")
    @Expose
    private Float dewPoint;
    @SerializedName("humidity")
    @Expose
    private Float humidity;
    @SerializedName("windSpeed")
    @Expose
    private Float windSpeed;
    @SerializedName("windBearing")
    @Expose
    private Integer windBearing;
    @SerializedName("cloudCover")
    @Expose
    private float cloudCover;
    @SerializedName("pressure")
    @Expose
    private Float pressure;
    @SerializedName("ozone")
    @Expose
    private Float ozone;

    /**
     *
     * @return
     * The time
     */
    public Integer getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     * The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     * The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The precipIntensity
     */
    public float getPrecipIntensity() {
        return precipIntensity;
    }

    /**
     *
     * @param precipIntensity
     * The precipIntensity
     */
    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    /**
     *
     * @return
     * The precipProbability
     */
    public float getPrecipProbability() {
        return precipProbability;
    }

    /**
     *
     * @param precipProbability
     * The precipProbability
     */
    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    /**
     *
     * @return
     * The precipType
     */
    public String getPrecipType() {
        return precipType;
    }

    /**
     *
     * @param precipType
     * The precipType
     */
    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    /**
     *
     * @return
     * The temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     *
     * @param temperature
     * The temperature
     */
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * @return
     * The apparentTemperature
     */
    public Float getApparentTemperature() {
        return apparentTemperature;
    }

    /**
     *
     * @param apparentTemperature
     * The apparentTemperature
     */
    public void setApparentTemperature(Float apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    /**
     *
     * @return
     * The dewPoint
     */
    public Float getDewPoint() {
        return dewPoint;
    }

    /**
     *
     * @param dewPoint
     * The dewPoint
     */
    public void setDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     *
     * @return
     * The humidity
     */
    public Float getHumidity() {
        return humidity;
    }

    /**
     *
     * @param humidity
     * The humidity
     */
    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    /**
     *
     * @return
     * The windSpeed
     */
    public Float getWindSpeed() {
        return windSpeed;
    }

    /**
     *
     * @param windSpeed
     * The windSpeed
     */
    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     *
     * @return
     * The windBearing
     */
    public Integer getWindBearing() {
        return windBearing;
    }

    /**
     *
     * @param windBearing
     * The windBearing
     */
    public void setWindBearing(Integer windBearing) {
        this.windBearing = windBearing;
    }

    /**
     *
     * @return
     * The cloudCover
     */
    public float getCloudCover() {
        return cloudCover;
    }

    /**
     *
     * @param cloudCover
     * The cloudCover
     */
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     *
     * @return
     * The pressure
     */
    public Float getPressure() {
        return pressure;
    }

    /**
     *
     * @param pressure
     * The pressure
     */
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    /**
     *
     * @return
     * The ozone
     */
    public Float getOzone() {
        return ozone;
    }

    /**
     *
     * @param ozone
     * The ozone
     */
    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

}