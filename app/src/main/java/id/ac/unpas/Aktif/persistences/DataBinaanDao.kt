package id.ac.unpas.hmtif.divisi.kaderisasi.Mahasiswa.Aktif.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.hmtif.divisi.kaderisasi.Mahasiswa.Aktif.model.databinaan

@Dao
interface databinaanDao {
    @Query("SELECT * FROM databinaan")
    fun loadAll(): LiveData<List<databinaan>>

    @Query("SELECT * FROM databinaan WHERE npm = :npm")
    fun find(npm: String): databinaan?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: databinaan)

    @Delete
    fun delete(item: databinaan)
}

@Database(entities = [databinaan::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databinaanDao(): databinaanDao
}