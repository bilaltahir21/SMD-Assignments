package lecture.experiments.roomdatabase.repository;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

import java.util.List;

import lecture.experiments.roomdatabase.Location;
import lecture.experiments.roomdatabase.ScreenTime;
import lecture.experiments.roomdatabase.database.DatabaseClass;

public class LocationRepo {
    private String DB_NAME = "app_core_db";
    private DatabaseClass locationDatabase;

    public LocationRepo(Context context) {
        getInstance(context);
    }

    private DatabaseClass getInstance(Context context){
        if (locationDatabase!=null){
            return locationDatabase;
        }else{
            locationDatabase = Room.databaseBuilder(context, DatabaseClass.class, DB_NAME).build();
        }
        return locationDatabase;
    }

    public void insertTask(String longitude, String latitude, String accuracy, String address) {
        Location location = new Location();
        location.setLongitude(longitude);
        location.setLatitude(latitude);
        location.setAccuracy(accuracy);
        location.setAddress(address);
        insertTask(location);
    }

    @SuppressLint("StaticFieldLeak")
    public void insertTask(final Location location) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                Log.e("screentimeRepo", "Inserting!!!! from Background Thread: " + Thread.currentThread().getId());
                locationDatabase.locationDaoAccess().insertTask(location);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    public void updateTask(final Location location) {

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                locationDatabase.locationDaoAccess().updateTask(location);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    public void deleteTask(final Location location) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                locationDatabase.locationDaoAccess().deleteTask(location);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private ScreenTime getTask(final int id) {
        new AsyncTask<Void, Void, Location>() {
            @Override
            protected Location doInBackground(Void... voids) {
                return locationDatabase.locationDaoAccess().getTask(id);
            }

            @Override
            protected void onPostExecute(Location location) {
                super.onPostExecute(location);
            }
        }.execute();
        return null;
    }

    @SuppressLint("StaticFieldLeak")
    public List<Location> getTasks() {
        new AsyncTask<Void, Void, List<Location>>() {
            @Override
            protected List<Location> doInBackground(Void... voids) {
                return locationDatabase.locationDaoAccess().fetchAllTasks();
            }

            @Override
            protected void onPostExecute(List<Location> locations) {
                Log.e("locationRepo1", "Db size: "+locations.size());
                for (Location element : locations) {
                    Log.e("locationRepo1", Integer.toString(element.getId()));
                }
                super.onPostExecute(locations);
            }
        }.execute();
        return null;
    }

}
