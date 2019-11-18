package lecture.experiments.roomdatabase.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lecture.experiments.roomdatabase.Location;

@Dao
public interface LocationDaoAccess {

    @Insert
    Long insertTask(Location location);


    @Query("SELECT * FROM Location")
    List<Location> fetchAllTasks();

    @Query("SELECT * FROM Location WHERE id =:taskId")
    Location getTask(int taskId);


    @Update
    void updateTask(Location screenTime);


    @Delete
    void deleteTask(Location screenTime);
}
