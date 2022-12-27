package com.wahidabd.dicodingcompose.data.source

import com.wahidabd.dicodingcompose.data.model.Course

object CourseData {

    val list = listOf(
        Course(
            1,
            LearningPathData.list[0],
            "Memulai Pemrograman Dengan Kotlin",
            "https://images.unsplash.com/photo-1534665482403-a909d0d97c67?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHByb2dyYW1tZXJ8ZW58MHx8MHx8&w=1000&q=80",
            "Dasar - Pemula",
            "118 Modul",
            "5 Jam Belajar",
            "43.319 Siswa Terdaftar",
            "Kotlin merupakan bahasa utama yang digunakan dalam pengembangan Android saat ini. Hal ini karena manfaat yang diberikan seperti ringkas, cepat, dan aman. Selain itu, sifatnya yang interoperability membuat developer bisa beralih dari bahasa Java ke Kotlin dengan cepat. Tak ayal, Google pernah melaporkan hampir 80% dari 1000 aplikasi teratas di Play Store menggunakan Kotlin. Selain pengembangan Android, Kotlin dapat digunakan untuk berbagai macam pengembangan, baik itu server, back-end, maupun website.",
            AndroidSyllabusData.syllabusKotlin,
        ),

        Course(
            2,
            LearningPathData.list[0],
            "Belajar Fundamental Aplikasi Android",
            "https://miro.medium.com/max/1400/1*T8xCNPbhD9gEcQpvAK7pjQ.jpeg",
            "Menengah",
            "112 Modul",
            "150 Jam Belajar",
            "37.141 Siswa Terdaftar",
            "Android merupakan sistem operasi mobile dengan pengguna terbesar di Indonesia, yakni sekitar 90%. Karena itulah banyak perusahaan yang membuat versi Android-nya supaya lebih dekat dengan pelanggannya, seperti Youtube, Facebook, dan Twitter. Perusahaan kecil pun turut membutuhkan aplikasi Android untuk menyelesaikan masalah yang ada. Ini juga menandakan bahwa kebutuhan akan Android developer semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan. ",
            AndroidSyllabusData.syllabusFundamentalAndroid,
        ),

        Course(
            3,
            LearningPathData.list[0],
            "Belajar Pengembangan Aplikasi Android Intermediate",
            "https://images.unsplash.com/photo-1622151834677-70f982c9adef?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bWFuJTIwd2l0aCUyMGxhcHRvcHxlbnwwfHwwfHw%3D&w=1000&q=80",
            "Mahir",
            "115 Modul",
            "100 Jam Belajar",
            "2.514 Siswa Terdaftar",
            "Pernahkah terpikir di benak Anda, bagaimana Android Developer membuat aplikasi-aplikasi keren yang bisa membantu kegiatan sehari-hari. Mulai dari mengedit foto, memesan transportasi online, melacak aktivitas olahraga, sampai mencatat keuangan. Di dalam aplikasi tersebut, Android Developer perlu membuat berbagai macam fitur untuk memenuhi kebutuhan mereka. Kelas ini menjawab kebutuhan tersebut dengan membahas berbagai macam komponen yang lebih advance dengan UX yang lebih bervariasi.",
            AndroidSyllabusData.androidIntermediate
        )
    )

}