package vergauwen.simon.retrofitdemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_ {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("sunriseTime")
    @Expose
    private Integer sunriseTime;
    @SerializedName("sunsetTime")
    @Expose
    private Integer sunsetTime;
    @SerializedName("moonPhase")
    @Expose
    private Float moonPhase;
    @SerializedName("precipIntensity")
    @Expose
    private Float precipIntensity;
    @SerializedName("precipIntensityMax")
    @Expose
    private Float precipIntensityMax;
    @SerializedName("precipIntensityMaxTime")
    @Expose
    private Integer precipIntensityMaxTime;
    @SerializedName("precipProbability")
    @Expose
    private Float precipProbability;
    @SerializedName("precipType")
    @Expose
    private String precipType;
    @SerializedName("temperatureMin")
    @Expose
    private Float temperatureMin;
    @SerializedName("temperatureMinTime")
    @Expose
    private Integer temperatureMinTime;
    @SerializedName("temperatureMax")
    @Expose
    private Float temperatureMax;
    @SerializedName("temperatureMaxTime")
    @Expose
    private Integer temperatureMaxTime;
    @SerializedName("apparentTemperatureMin")
    @Expose
    private float apparentTemperatureMin;
    @SerializedName("apparentTemperatureMinTime")
    @Expose
    private Integer apparentTemperatureMinTime;
    @SerializedName("apparentTemperatureMax")
    @Expose
    private Float apparentTemperatureMax;
    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    private Integer apparentTemperatureMaxTime;
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
    private Float cloudCover;
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
     * The sunriseTime
     */
    public Integer getSunriseTime() {
        return sunriseTime;
    }

    /**
     *
     * @param sunriseTime
     * The sunriseTime
     */
    public void setSunriseTime(Integer sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    /**
     *
     * @return
     * The sunsetTime
     */
    public Integer getSunsetTime() {
        return sunsetTime;
    }

    /**
     *
     * @param sunsetTime
     * The sunsetTime
     */
    public void setSunsetTime(Integer sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    /**
     *
     * @return
     * The moonPhase
     */
    public Float getMoonPhase() {
        return moonPhase;
    }

    /**
     *
     * @param moonPhase
     * The moonPhase
     */
    public void setMoonPhase(Float moonPhase) {
        this.moonPhase = moonPhase;
    }

    /**
     *
     * @return
     * The precipIntensity
     */
    public Float getPrecipIntensity() {
        return precipIntensity;
    }

    /**
     *
     * @param precipIntensity
     * The precipIntensity
     */
    public void setPrecipIntensity(Float precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    /**
     *
     * @return
     * The precipIntensityMax
     */
    public Float getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    /**
     *
     * @param precipIntensityMax
     * The precipIntensityMax
     */
    public void setPrecipIntensityMax(Float precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    /**
     *
     * @return
     * The precipIntensityMaxTime
     */
    public Integer getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    /**
     *
     * @param precipIntensityMaxTime
     * The precipIntensityMaxTime
     */
    public void setPrecipIntensityMaxTime(Integer precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    /**
     *
     * @return
     * The precipProbability
     */
    public Float getPrecipProbability() {
        return precipProbability;
    }

    /**
     *
     * @param precipProbability
     * The precipProbability
     */
    public void setPrecipProbability(Float precipProbability) {
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
     * The temperatureMin
     */
    public Float getTemperatureMin() {
        return temperatureMin;
    }

    /**
     *
     * @param temperatureMin
     * The temperatureMin
     */
    public void setTemperatureMin(Float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    /**
     *
     * @return
     * The temperatureMinTime
     */
    public Integer getTemperatureMinTime() {
        return temperatureMinTime;
    }

    /**
     *
     * @param temperatureMinTime
     * The temperatureMinTime
     */
    public void setTemperatureMinTime(Integer temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    /**
     *
     * @return
     * The temperatureMax
     */
    public Float getTemperatureMax() {
        return temperatureMax;
    }

    /**
     *
     * @param temperatureMax
     * The temperatureMax
     */
    public void setTemperatureMax(Float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    /**
     *
     * @return
     * The temperatureMaxTime
     */
    public Integer getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    /**
     *
     * @param temperatureMaxTime
     * The temperatureMaxTime
     */
    public void setTemperatureMaxTime(Integer temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    /**
     *
     * @return
     * The apparentTemperatureMin
     */
    public float getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    /**
     *
     * @param apparentTemperatureMin
     * The apparentTemperatureMin
     */
    public void setApparentTemperatureMin(Integer apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    /**
     *
     * @return
     * The apparentTemperatureMinTime
     */
    public Integer getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    /**
     *
     * @param apparentTemperatureMinTime
     * The apparentTemperatureMinTime
     */
    public void setApparentTemperatureMinTime(Integer apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    /**
     *
     * @return
     * The apparentTemperatureMax
     */
    public Float getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    /**
     *
     * @param apparentTemperatureMax
     * The apparentTemperatureMax
     */
    public void setApparentTemperatureMax(Float apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    /**
     *
     * @return
     * The apparentTemperatureMaxTime
     */
    public Integer getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    /**
     *
     * @param apparentTemperatureMaxTime
     * The apparentTemperatureMaxTime
     */
    public void setApparentTemperatureMaxTime(Integer apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
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
    public Float getCloudCover() {
        return cloudCover;
    }

    /**
     *
     * @param cloudCover
     * The cloudCover
     */
    public void setCloudCover(Float cloudCover) {
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