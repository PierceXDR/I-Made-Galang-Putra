# Sistem Data Mahasiswa (Java + MySQL)

## Deskripsi
Sistem Data Mahasiswa adalah aplikasi berbasis Java yang digunakan untuk mengelola data mahasiswa. Program ini berjalan melalui console dan memiliki fitur CRUD sederhana seperti menambah data mahasiswa, menampilkan data mahasiswa, serta menghapus data mahasiswa.

Program ini menggunakan konsep **Object Oriented Programming (OOP)** seperti class, object, inheritance, interface, dan encapsulation serta menggunakan **database MySQL** sebagai media penyimpanan data.

---

# Fitur Program

Program memiliki beberapa fitur utama:

1. **Tambah Data Mahasiswa**  
   Menyimpan data mahasiswa ke dalam database.

2. **Tampil Data Mahasiswa**  
   Menampilkan seluruh data mahasiswa yang tersimpan di database.

3. **Hapus Data Mahasiswa**  
   Menghapus data mahasiswa berdasarkan NIM.

4. **Menu Console Interaktif**  
   User dapat memilih fitur melalui menu.

---

# Struktur Project
src
│
├── model
│ ├── Person.java
│ └── Mahasiswa.java
│
├── service
│ └── MahasiswaService.java
│
├── database
│ └── Database.java
│
├── interfacepkg
│ └── CrudOperation.java
│
└── main
└── Main.java

Penjelasan package:

| Package | Fungsi |
|-------|------|
| model | Menyimpan class model seperti Mahasiswa dan Person |
| service | Menyimpan logika CRUD mahasiswa |
| database | Mengatur koneksi database |
| interfacepkg | Interface operasi CRUD |
| main | Program utama |

---

# Teknologi yang Digunakan

- Java
- JDBC
- MySQL
- Apache XAMPP
- MySQL Connector/J

---

# Konsep OOP yang Digunakan

Program ini menggunakan beberapa konsep OOP:

### Class
Contoh class:
- `Mahasiswa`
- `Person`
- `MahasiswaService`
- `Database`

### Object
Contoh pembuatan objek:

```java
MahasiswaService service = new MahasiswaService();
Inheritance

Class Mahasiswa mewarisi class Person.
public class Mahasiswa extends Person
Interface

Interface CrudOperation berisi method:

tambah()

tampil()

hapus()

Implementasi:
public class MahasiswaService implements CrudOperation
Polymorphism

Menggunakan @Override untuk mengimplementasikan method interface.
Library yang Digunakan

Program menggunakan beberapa library:

java.util

Digunakan untuk input user.

Contoh:
Library yang Digunakan

Program menggunakan beberapa library:

java.util

Digunakan untuk input user.

Contoh:
import java.util.Scanner;
java.sql

Digunakan untuk koneksi database.

Contoh:
import java.sql.Connection;
import java.sql.DriverManager;
Database

Database menggunakan MySQL dari Apache XAMPP.

Menjalankan MySQL

Buka XAMPP Control Panel

Jalankan Apache

Jalankan MySQL
Membuat Database

Buka phpMyAdmin atau MySQL CLI lalu jalankan:
CREATE DATABASE kampus;
Gunakan database:
USE kampus;
Buat tabel mahasiswa:
CREATE TABLE mahasiswa(
nim VARCHAR(10),
nama VARCHAR(50),
jurusan VARCHAR(50),
semester INT
);
Konfigurasi Database

File koneksi database berada di:
database/Database.java
Konfigurasi:
String url = "jdbc:mysql://localhost:3306/kampus";
String user = "root";
String password = "";
Konfigurasi ini menggunakan default XAMPP MySQL
MySQL Connector JAR

Agar Java dapat terhubung dengan MySQL diperlukan library MySQL Connector/J.

Download di:

https://dev.mysql.com/downloads/connector/j/

Tambahkan file berikut ke project:
MySQL Connector JAR

Agar Java dapat terhubung dengan MySQL diperlukan library MySQL Connector/J.

Download di:

https://dev.mysql.com/downloads/connector/j/

Tambahkan file berikut ke project:
Kemudian masukkan ke Project Libraries / Classpath.
Contoh struktur project:
project-folder
│
├── lib
│   └── mysql-connector-j-8.x.x.jar
│
├── src
│
└── README.md
Cara Menjalankan Program

Install Java JDK

Install Apache XAMPP

Jalankan MySQL di XAMPP

Buat database dan tabel

Tambahkan MySQL Connector JAR

Jalankan file:
Main.java
Contoh Tampilan Program
=== SISTEM DATA MAHASISWA ===
1. Tambah Data
2. Tampil Data
3. Hapus Data
4. Keluar

Pilih: 1
NIM: 230030140
Nama: Galang
Jurusan: SI
Semester: 6

Data berhasil disimpan
Tujuan Program

Tujuan dari pembuatan program ini adalah:

Mempelajari konsep Object Oriented Programming

Mengimplementasikan koneksi database menggunakan JDBC

Membuat sistem CRUD sederhana

Melatih penggunaan package, interface, dan inheritance
