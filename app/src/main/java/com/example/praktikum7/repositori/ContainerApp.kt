package com.example.praktikum7.repositori

import com.example.praktikum7.repositori.RepositoriSiswa
import com.example.praktikum7.repositori.OfflineRepositoriSiswa
import com.example.praktikum7.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}