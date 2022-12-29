package com.wahidabd.dicodingcompose.data.source

import com.wahidabd.dicodingcompose.data.model.Course
import com.wahidabd.dicodingcompose.data.source.syllabus.AndroidSyllabusData
import com.wahidabd.dicodingcompose.data.source.syllabus.IOSSyllabusData
import com.wahidabd.dicodingcompose.data.source.syllabus.MLSyllabusData
import com.wahidabd.dicodingcompose.data.source.syllabus.ReactSyllabusData

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
        ),

        Course(
            4,
            LearningPathData.list[0],
            "Menjadi Android Developer Expert",
            "https://images.unsplash.com/photo-1617870952348-7524edfb61b7?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fG1hbiUyMGFuZCUyMGNvbXB1dGVyfGVufDB8fDB8fA%3D%3D&w=1000&q=80",
            "Professional",
            "87 Modul",
            "90 Jam Belajar",
            "3.525 Siswa Terdaftar",
            "Perusahaan berlomba membuat aplikasi Android agar dapat menjangkau pasar. Namun kesuksesan sebuah aplikasi terbentur kompetisi dan mahalnya biaya akuisisi user. Maka diperlukan aplikasi dengan performa tinggi supaya dapat bersaing dan tidak dihapus oleh user. Minimnya bug, keamanan, dan ukuran aplikasi adalah faktor lain yang perlu diperhatikan untuk kenyamanan user. Maka, pelajarilah di kelas ini cara membuat kode yang mudah diubah untuk mengikuti kebutuhan bisnis dan tidak rapuh ketika dikembangkan.",
            AndroidSyllabusData.androidExpert
        ),

        Course(
            5,
            LearningPathData.list[1],
            "Belajar Fundamental Aplikasi iOS",
            "https://images.unsplash.com/photo-1486312338219-ce68d2c6f44d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cGVvcGxlJTIwY29tcHV0ZXJ8ZW58MHx8MHx8&w=1000&q=80",
            "Menengah",
            "127 Modul",
            "70 Jam Belajar",
            "1.004 Siswa Terdaftar",
            "Menjadi iOS developer merupakan pekerjaan yang diimpikan bagi banyak orang. Menurut data dari Indeed, salah satu job platform terbesar di dunia, tingkat kepuasan menjadi iOS developer itu 13% lebih tinggi dibandingkan dengan profesi Android Developer. Sedangkan dari sisi kebutuhan Industri, masih banyak yang menginginkan codebase terpisah ketika aplikasinya perlu dijalankan di platform yang berbeda (seperti OS Android dan iOS). Oleh karena itu, permintaan untuk seorang iOS Developer masih sangatlah tinggi.",
            IOSSyllabusData.IOSFundamental
        ),

        Course(
            6,
            LearningPathData.list[1],
            "Belajar Fundamental Aplikasi iOS",
            "https://images.unsplash.com/photo-1622463461333-611830d028bd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWFuJTIwbGFwdG9wfGVufDB8fDB8fA%3D%3D&w=1000&q=80",
            "Mahir - Professional",
            "135 Modul",
            "70 Jam Belajar",
            "647 Siswa Terdaftar",
            "Banyak perusahaan berkompetisi untuk menjangkau pasar iOS sebanyak mungkin. Namun, mahalnya biaya akuisisi pengguna menjadi kendala dalam membangun aplikasi. Maka diperlukan aplikasi dengan performa tinggi agar dapat bersaing dan meningkatkan retensi pengguna. Minimnya bug, keamanan, dan ukuran aplikasi adalah faktor yang perlu diperhatikan untuk kenyamanan user. Pelajarilah kelas ini untuk mengetahui cara membuat kode yang dapat mengikuti kebutuhan bisnis serta tidak rapuh ketika dikembangkan.",
            IOSSyllabusData.IOSExpert
        ),

        Course(
            7,
            LearningPathData.list[3],
            "Belajar Pengembangan Machine Learning",
            "https://images.unsplash.com/photo-1454165804606-c3d57bc86b40?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fG1hY2hpbmUlMjBsZWFybmluZ3xlbnwwfHwwfHw%3D&w=1000&q=80",
            "Menengah",
            "70 Modul",
            "40 Jam Belajar",
            "5.793 Siswa Terdaftar",
            "Posisi pengembang ML (machine learning) sangat dicari sehingga seorang ahli bisa mendapatkan pekerjaan senilai Rp 1,9 miliar per tahun (data Kompas). Hal ini karena otomatisasi telah mengubah cara orang hidup dan bekerja orang setiap harinya, sehingga pekerjaan dengan kecerdasan buatan terbukti menjadi peluang karir terbesar di zaman ini. Sebagai contoh, 75% dari pengguna Netflix memilih film berdasarkan rekomendasi algoritma machine learning aplikasi tersebut.",
            MLSyllabusData.pengembanganML
        ),

        Course(
            8,
            LearningPathData.list[3],
            "Machine Learning Operations (MLOps)",
            "https://images.unsplash.com/photo-1612831197310-ff5cf7a211b6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE2fHx8ZW58MHx8fHw%3D&w=1000&q=80",
            "Mahir",
            "72 Modul",
            "45 Jam Belajar",
            "163 Siswa Terdaftar",
            "MLOps merupakan sebuah best practice untuk melakukan standardisasi terhadap proses pengembangan sistem machine learning dan pengoperasiannya di sistem produksi. Pada lingkup industri, standaridisasi terhadap keseluruhan proses ini merupakan kunci utama dalam menghasilkan sistem machine learning yang bersifat reliable, scalable, adaptable, dan maintainable. Selain itu, penerapan MLOps dapat membantu kita dalam mencegah resiko munculnya technical debt dan memastikan akuntabilitas dari sistem yang dibuat.",
            MLSyllabusData.MLOps
        ),

        Course(
            9,
            LearningPathData.list[4],
            "Belajar Membuat Aplikasi Web dengan React",
            "https://media.istockphoto.com/id/1390307383/photo/a-day-at-the-office.jpg?b=1&s=170667a&w=0&k=20&c=zVB0jv6bZxrrnoeYwfeoZintZjWxjhUxV9XEixCO0ZQ=",
            "Pemula",
            "56 Modul",
            "35 Jam Belajar",
            "8.207 Siswa Terdaftar",
            "Tuntutan dalam mengembangkan aplikasi web semakin hari semakin kompleks. Pasalnya, aplikasi web saat ini dapat berperan layaknya aplikasi native. Seiring rumitnya permintaan, semakin canggih juga tools dalam mengembangkan web. Penggunaan React sebagai tools membangun UI mendominasi mulai dari perusahaan rintisan hingga perusahaan besar berskala multinasional. Di Indonesia sendiri React telah dipercaya dan digunakan oleh perusahaan besar seperti Tokopedia, Traveloka, dan lainnya.",
            ReactSyllabusData.reactDasar
        ),

        Course(
            10,
            LearningPathData.list[4],
            "Belajar Fundamental Aplikasi Web dengan React",
            "https://st2.depositphotos.com/1637787/11518/i/950/depositphotos_115185558-stock-photo-happy-man-working-on-laptop.jpg",
            "Menengah",
            "66 Modul",
            "55 Jam Belajar",
            "8.207 Siswa Terdaftar",
            "Tuntutan dalam mengembangkan aplikasi web semakin hari semakin kompleks. Pasalnya, aplikasi web saat ini dapat berperan layaknya aplikasi native. Seiring rumitnya permintaan, semakin canggih juga tools dalam mengembangkan web. Penggunaan React sebagai tools membangun UI mendominasi mulai dari perusahaan rintisan hingga perusahaan besar berskala multinasional. Di Indonesia sendiri React telah dipercaya dan digunakan oleh perusahaan besar seperti Tokopedia, Traveloka, dan lainnya.",
            ReactSyllabusData.reactDasar
        )
    )

}