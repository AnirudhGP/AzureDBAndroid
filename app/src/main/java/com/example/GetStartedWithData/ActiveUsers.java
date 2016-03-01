package com.example.GetStartedWithData;

//import com.example.GetStartedWithData.R;

/**
 * Represents an item in a ToDo list
 */
public class ActiveUsers {

    @com.google.gson.annotations.SerializedName("id")
    private String mId;
    @com.google.gson.annotations.SerializedName("phone")
    private String mPhone;
    @com.google.gson.annotations.SerializedName("name")
    private String mName;
    @com.google.gson.annotations.SerializedName("latitude")
    private String latitude;
    @com.google.gson.annotations.SerializedName("longitude")
    private String longitude;

    public ActiveUsers() {
    }

    @Override
    public String toString() {
        return getPhone();
    }

    public ActiveUsers(String phone, String name,String latitude,String longitude,String id) {
        this.setPhone(phone);
        this.setName(name);
        this.setLatitude(latitude);
        this.setLongitude(longitude);
        this.setId(id);
    }

    public String getId() {
        return mId;
    }
    public final void setId(String id) {
        mId = id;
    }

    public String getPhone() {
        return mPhone;
    }

    public final void setPhone(String phone) {
        mPhone = phone;
    }

    public String getName() {
        return mName;
    }

    public final void setName(String name) {
        mName = name;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String lat) {
        latitude = lat;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String lon) {
        longitude = lon;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ToDoItem && ((ActiveUsers) o).mPhone == mPhone;

    }
}
