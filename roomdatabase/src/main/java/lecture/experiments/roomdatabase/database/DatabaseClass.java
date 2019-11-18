package lecture.experiments.roomdatabase.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import lecture.experiments.roomdatabase.Location;
import lecture.experiments.roomdatabase.ScreenTime;
import lecture.experiments.roomdatabase.dao.LocationDaoAccess;
import lecture.experiments.roomdatabase.dao.ScreentimeDaoAccess;

@Database(entities = {ScreenTime.class, Location.class}, version = 1, exportSchema = false)
public abstract class DatabaseClass extends RoomDatabase {

    public abstract ScreentimeDaoAccess screentimeDaoAccess();
    public abstract LocationDaoAccess locationDaoAccess();
}