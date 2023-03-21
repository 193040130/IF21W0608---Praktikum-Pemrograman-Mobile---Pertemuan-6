package id.ac.unpas.hmtif.divisi.kaderisasi.Mahasiswa.Aktif.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class databinaan(
    @PrimaryKey val id: String,
    val npm: String,
    val nama: String,
    val tingkat: String,
    val jumlahpertemuan: String,
    val tglmulaibinaan: String,
    val tglselesaibinaan: String
)
