package com.wahidabd.dicodingcompose.data.source.syllabus

import com.wahidabd.dicodingcompose.data.model.Syllabus


object IOSSyllabusData {
    val IOSFundamental: List<Syllabus> = listOf(
        Syllabus(
            1,
            "Persiapan Belajar",
            "Memahami HAKI, mekanisme belajar, forum diskusi, glosarium, dan daftar referensi.",
            "50 Menit",
            "7 Artikel"
        ),
        Syllabus(
            2,
            "Dasar Pengembangan Aplikasi iOS",
            "Mempelajari berbagai topik tingkat pemula apa saja yang perlu dipahami pada pengembangan sebuah aplikasi iOS sebelum dapat belajar teknik yang lebih kompleks, seperti memahami alur dari sebuah aplikasi, view dan window, dan bahasa yang digunakan.",
            "140 Menit",
            "9 Artikel | 1 Ujian"
        ),
        Syllabus(
            3,
            "Mobile App Design",
            "Mempelajari pentingnya peran desain (UI/UX) dalam sebuah mobile application.",
            "280 Menit",
            "8 Artikel | 1 Ujian"
        ),
        Syllabus(
            4,
            "Concurrency",
            "Mempelajari cara kerja concurrency dalam Swift untuk menangani proses yang memakan waktu, contohnya memuat gambar dari URL.",
            "550 Menit",
            "17 Artikel | 1 Ujian"
        ),
        Syllabus(
            5,
            "Networking",
            "Mempelajari cara mendapatkan data dari network atau API dan menampilkannya. Serta memahami bahwa Networking menjadi hal penting saat membangun aplikasi iOS.",
            "595 Menit",
            "19 Artikel | 1 Ujian"
        ),
        Syllabus(
            6,
            "Multitasking",
            "Mempelajari bagaimana sebuah aplikasi dapat melakukan berbagai pekerjaan dalam satu waktu.",
            "275 Menit",
            "9 Artikel | 1 Ujian"
        ),
        Syllabus(
            7,
            "Studi Kasus Implementasi Concurrency, Networking, dan Multitasking",
            "Menguji pemahaman dalam implementasi Concurrency, Networking, dan Multitasking melalui pembuatan sebuah aplikasi iOS yang dapat menampilkan informasi dari server atau API.",
            "405 Menit",
            "1 Submission"
        ),
        Syllabus(
            8,
            "Working with Data",
            "Mempelajari bagaimana mengelola data lokal dalam aplikasi iOS seperti User Default dan Core Data.",
            "455 Menit",
            "14 Artikel | 1 Ujian"
        ),
        Syllabus(
            9,
            "Notification",
            "Mempelajari bagaimana fungsi serta cara bekerja notifikasi dalam aplikasi iOS.",
            "225 Menit",
            "7 Artikel | 1 Ujian"
        ),
        Syllabus(
            10,
            "SwiftUI",
            "Mempelajari cara modern dalam pembuatan tampilan di iOS.",
            "305 Menit",
            "11 Artikel | 1 Ujian"
        ),
        Syllabus(
            11,
            "Testing",
            "Mempelajari bagaimana pengujian, atau dinamakan testing, menjadi tahapan yang paling penting dalam pembuatan aplikasi.",
            "195 Menit",
            "5 Artikel | 1 Ujian"
        ),
        Syllabus(
            12,
            "App Store dan Apple Developer Program",
            "Mempelajari bagaimana aplikasi dapat dipasarkan dengan App Store menggunakan akun Apple Developer Program.",
            "140 Menit",
            "7 Artikel | 1 Ujian"
        ),
        Syllabus(
            13,
            "Penutup",
            "Menguji pemahaman siswa dalam implementasi teknik dan materi fundamental iOS melalui pembuatan sebuah aplikasi iOS yang terdapat fitur favorite, yakni menyimpan salah satu item tertentu ke dalam daftar favorite dan menghapusnya menggunakan local Database.",
            "585 Menit",
            "1 Artikel | 1 Submission | 1 Ujian"
        ),
    )

    val IOSExpert: List<Syllabus> = listOf(
        Syllabus(
            1,
            "Persiapan Belajar",
            "Memahami HAKI, mekanisme belajar, forum diskusi, glosarium, dan daftar referensi.",
            "70 Menit",
            "9 Artikel"
        ),
        Syllabus(
            2,
            "Clean Code",
            "Mengerti pentingnya menulis kode dengan bersih (clean code) agar program yang dibuat dapat terus dikembangkan (scalable).",
            "160 Menit",
            "11 Artikel"
        ),
        Syllabus(
            3,
            "Design Pattern",
            "Memahami cara terbaik dalam mengatasi permasalahan yang berulang menggunakan Design Pattern, yakni dengan meningkatkan kualitas rancangan aplikasi pada aspek-aspek penggunaan ulang (reusability), perluasan fungsi (extensibility), skalabilitas (scalability), dan pemeliharaan (maintainability).",
            "205 Menit",
            "11 Artikel"
        ),
        Syllabus(
            4,
            "Architecture Pattern",
            "Mengerti pentingnya menggunakan architecture pattern dalam membangun aplikasi, serta menjelaskan Clean Architecture untuk membangun aplikasi yang tertata dan mudah dipelihara.",
            "200 Menit",
            "8 Artikel"
        ),
        Syllabus(
            5,
            "Studi Kasus Project dengan Clean Architecture",
            "Cara mengimplementasikan materi Clean Code, Design Pattern, dan Architecture Pattern melalui sebuah project aplikasi iOS.",
            "210 Menit",
            "5 Artikel"
        ),
        Syllabus(
            6,
            "Reactive Programming",
            "Implementasi paradigma pemrograman deklaratif menggunakan dua library yang sudah cukup terkenal, yakni RxSwift dan Combine.",
            "570 Menit",
            "27 Artikel"
        ),
        Syllabus(
            7,
            "Studi Kasus Project dengan Reactive Programming",
            "Cara mengimplementasikan materi Reactive Programming melalui sebuah project aplikasi iOS.",
            "200 Menit",
            "4 Artikel"
        ),
        Syllabus(
            8,
            "Dependency Injection",
            "Belajar mengenai teknik membangun aplikasi yang robust, baik secara manual maupun menggunakan library seperti Swinject dan Cleanse.",
            "255 Menit",
            "11 Artikel"
        ),
        Syllabus(
            9,
            "Studi Kasus Project dengan Dependency Injection",
            "Cara mengimplementasikan materi Dependency Injection melalui sebuah project aplikasi iOS.",
            "30 Menit",
            "1 Artikel"
        ),
        Syllabus(
            10,
            "Submission Capstone Project",
            "Menguji pemahaman dalam implementasi Clean Code, Design Pattern, Architecture Pattern, Reactive Programming, dan Dependency Injection melalui pembuatan sebuah aplikasi iOS yang dapat menampilkan informasi dari server atau API dan menyimpannya ke dalam database lokal.",
            "600 Menit",
            "1 Submission"
        ),
        Syllabus(
            11,
            "Test Driven Development (TDD)",
            "Belajar menulis kode melalui pendekatan pengujian.",
            "220 Menit",
            "10 Artikel"
        ),
        Syllabus(
            12,
            "Continuous Integration",
            "Belajar mengenai proses otomatisasi untuk mempermudah pengujian aplikasi.",
            "180 Menit",
            "8 Artikel"
        ),
        Syllabus(
            13,
            "Modularization",
            "Cara membangun aplikasi berskala besar melalui paham Modularization untuk membuat module.",
            "430 Menit",
            "23 Artikel"
        ),
        Syllabus(
            14,
            "Studi Kasus Project dengan Modularization",
            "Cara mengimplementasikan materi Modularization melalui sebuah project aplikasi iOS.",
            "150 Menit",
            "5 Artikel"
        ),
        Syllabus(
            1,
            "Penutup",
            "Menguji pemahaman dalam implementasi Test Driven Development, Continuous Integration, dan Modularization melalui pembuatan sebuah aplikasi iOS yang dapat menampilkan informasi dari server atau API dan menyimpannya ke dalam database lokal.",
            "720 Menit",
            "1 Submission"
        )
    )
}