package com.wahidabd.dicodingcompose.data.source

import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.data.model.LearningPath
import com.wahidabd.dicodingcompose.data.model.Syllabus

object CourseData {

    val list = listOf(
        Course(
            1,
            LearningPathData.list[0],
            "Memulai Pemrograman Dengan Kotlin",
            "https://d17ivq9b7rppb3.cloudfront.net/original/academy/memulai_pemrograman_dengan_kotlin_logo_230421132137.jpg",
            "Dasar - Pemula",
            "118 Modul",
            "5 Jam Belajar",
            "43.319 Siswa Terdaftar",
            "Kotlin merupakan bahasa utama yang digunakan dalam pengembangan Android saat ini. Hal ini karena manfaat yang diberikan seperti ringkas, cepat, dan aman. Selain itu, sifatnya yang interoperability membuat developer bisa beralih dari bahasa Java ke Kotlin dengan cepat. Tak ayal, Google pernah melaporkan hampir 80% dari 1000 aplikasi teratas di Play Store menggunakan Kotlin. Selain pengembangan Android, Kotlin dapat digunakan untuk berbagai macam pengembangan, baik itu server, back-end, maupun website.",
            SyllabusData.syllabusKotlin,
        ),

        Course(
            1,
            LearningPathData.list[0],
            "Belajar Fundamental Aplikasi Android",
            "https://d17ivq9b7rppb3.cloudfront.net/original/academy/belajar_fundamental_aplikasi_android_logo_230421132359.jpg",
            "Menengah",
            "112 Modul",
            "150 Jam Belajar",
            "37.141 Siswa Terdaftar",
            "Android merupakan sistem operasi mobile dengan pengguna terbesar di Indonesia, yakni sekitar 90%. Karena itulah banyak perusahaan yang membuat versi Android-nya supaya lebih dekat dengan pelanggannya, seperti Youtube, Facebook, dan Twitter. Perusahaan kecil pun turut membutuhkan aplikasi Android untuk menyelesaikan masalah yang ada. Ini juga menandakan bahwa kebutuhan akan Android developer semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan. ",
            SyllabusData.syllabusFundamentalAndroid,
        ),
    )

}