package com.rizky.mypreloaddata.database

import android.provider.BaseColumns

internal object DatabaseContract {

    val TABLE_NAME = "table_mahasiswa"

    internal class MahasiswaColumns: BaseColumns {
        companion object {
            const val NAMA = "nama"
            const val NIM = "nim"
        }
    }
}