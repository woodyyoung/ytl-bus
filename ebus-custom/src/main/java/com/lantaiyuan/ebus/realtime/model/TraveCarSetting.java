package com.lantaiyuan.ebus.realtime.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * TraveCarSetting
 * 数据库表：t_trave_car_setting
 */
public class TraveCarSetting {

    /**
     * 主键
     * 表字段 : t_trave_car_setting.ID
     */
    private String id;

    /**
     * 用户ID
     * 表字段 : t_trave_car_setting.USER_ID
     */
    private String userId;

    /**
     * 线路ID
     * 表字段 : t_trave_car_setting.ROUTE_ID
     */
    private String routeId;

    /**
     * 站点ID（站点表中的stationId）
     * 表字段 : t_trave_car_setting.STATION_ID
     */
    private String stationId;

    /**
     * 经度
     * 表字段 : t_trave_car_setting.LONGITUDE
     */
    private BigDecimal longitude;

    /**
     * 纬度
     * 表字段 : t_trave_car_setting.LATITUDE
     */
    private BigDecimal latitude;

    /**
     * 类型（1：上车，2：下车）默认为2
     * 表字段 : t_trave_car_setting.TYPE
     */
    private Short type;

    /**
     * 城市编码
     * 表字段 : t_trave_car_setting.CITY_CODE
     */
    private String cityCode;
    

    /**
     * 是否已提醒（0-未提醒（默认） 1-已提醒）
     * 表字段 : t_trave_car_setting.IS_REMIND
     */
    private Boolean isRemind;
    
    /**
     * 创建时间
     * 表字段 : t_trave_car_setting.CREATE_TIME
     */
    private Date createTime;

    /**
     * 获取 主键 字段:t_trave_car_setting.ID
     *
     * @return t_trave_car_setting.ID, 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键 字段:t_trave_car_setting.ID
     *
     * @param id the value for t_trave_car_setting.ID, 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 用户ID 字段:t_trave_car_setting.USER_ID
     *
     * @return t_trave_car_setting.USER_ID, 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置 用户ID 字段:t_trave_car_setting.USER_ID
     *
     * @param userId the value for t_trave_car_setting.USER_ID, 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取 线路ID 字段:t_trave_car_setting.ROUTE_ID
     *
     * @return t_trave_car_setting.ROUTE_ID, 线路ID
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * 设置 线路ID 字段:t_trave_car_setting.ROUTE_ID
     *
     * @param routeId the value for t_trave_car_setting.ROUTE_ID, 线路ID
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    /**
     * 获取 站点ID（站点表中的stationId） 字段:t_trave_car_setting.STATION_ID
     *
     * @return t_trave_car_setting.STATION_ID, 站点ID（站点表中的stationId）
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * 设置 站点ID（站点表中的stationId） 字段:t_trave_car_setting.STATION_ID
     *
     * @param stationId the value for t_trave_car_setting.STATION_ID, 站点ID（站点表中的stationId）
     */
    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    /**
     * 获取 经度 字段:t_trave_car_setting.LONGITUDE
     *
     * @return t_trave_car_setting.LONGITUDE, 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置 经度 字段:t_trave_car_setting.LONGITUDE
     *
     * @param longitude the value for t_trave_car_setting.LONGITUDE, 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取 纬度 字段:t_trave_car_setting.LATITUDE
     *
     * @return t_trave_car_setting.LATITUDE, 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置 纬度 字段:t_trave_car_setting.LATITUDE
     *
     * @param latitude the value for t_trave_car_setting.LATITUDE, 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 获取 创建时间 字段:t_trave_car_setting.CREATE_TIME
     *
     * @return t_trave_car_setting.CREATE_TIME, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:t_trave_car_setting.CREATE_TIME
     *
     * @param createTime the value for t_trave_car_setting.CREATE_TIME, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Boolean getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(Boolean isRemind) {
        this.isRemind = isRemind;
    }
    
    
    
}