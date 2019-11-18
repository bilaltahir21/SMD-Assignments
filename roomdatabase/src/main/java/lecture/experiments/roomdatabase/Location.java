package lecture.experiments.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Location implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String longitude;
    private String latitude;
    private String accuracy;
    private String Address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
