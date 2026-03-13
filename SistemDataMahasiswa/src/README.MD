# Sistem Data Mahasiswa (Java + MySQL)

## Deskripsi Program
Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk mengelola data mahasiswa. Program ini dapat melakukan operasi dasar seperti menambah data mahasiswa, menampilkan data mahasiswa, dan menghapus data mahasiswa dari database.

Program dibuat menggunakan konsep **Object Oriented Programming (OOP)** seperti class, object, inheritance, interface, dan encapsulation serta menggunakan **database MySQL** untuk menyimpan data.

---

# Fitur Program

Program memiliki beberapa fitur utama yaitu:

1. **Tambah Data Mahasiswa**
   - Menyimpan data mahasiswa ke dalam database.

2. **Tampil Data Mahasiswa**
   - Menampilkan seluruh data mahasiswa yang tersimpan di database.

3. **Hapus Data Mahasiswa**
   - Menghapus data mahasiswa berdasarkan NIM.

4. **Menu Interaktif**
   - Program berjalan dalam bentuk menu berbasis console.

---

# Struktur Package

Program dibagi menjadi beberapa package agar lebih terstruktur.
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

- **model** → berisi class model data seperti Mahasiswa dan Person  
- **service** → berisi logika program untuk mengelola data mahasiswa  
- **database** → berisi koneksi database  
- **interfacepkg** → berisi interface CRUD  
- **main** → berisi class utama untuk menjalankan program  

---

# Konsep OOP yang Digunakan

Program ini menggunakan beberapa konsep **Object Oriented Programming**, yaitu:

### 1. Class
Contoh class pada program:

- `Mahasiswa`
- `Person`
- `MahasiswaService`
- `Database`

### 2. Object
Contoh pembuatan objek pada class `Main`:

Penjelasan package:

- **model** → berisi class model data seperti Mahasiswa dan Person  
- **service** → berisi logika program untuk mengelola data mahasiswa  
- **database** → berisi koneksi database  
- **interfacepkg** → berisi interface CRUD  
- **main** → berisi class utama untuk menjalankan program  

---

# Konsep OOP yang Digunakan

Program ini menggunakan beberapa konsep **Object Oriented Programming**, yaitu:

### 1. Class
Contoh class pada program:

- `Mahasiswa`
- `Person`
- `MahasiswaService`
- `Database`

### 2. Object
Contoh pembuatan objek pada class `Main`:
MahasiswaService service = new MahasiswaService();

### 3. Inheritance
Class `Mahasiswa` mewarisi class `Person`.
public class Mahasiswa extends Person

### 4. Interface
Interface `CrudOperation` berisi method:
tambah()
tampil()
hapus()

Kemudian diimplementasikan oleh:

public class MahasiswaService implements CrudOperation

### 5. Polymorphism
Method dari interface diimplementasikan kembali pada class `MahasiswaService` menggunakan:
@Override

### 6. Encapsulation
Property dalam class dibuat `private` dan diakses menggunakan method getter.

---

# Penggunaan Array

Program menggunakan **ArrayList** untuk menyimpan data sementara seperti log data yang dimasukkan.

Contoh:
ArrayList<String> logData = new ArrayList<>();

---

# Library yang Digunakan

Program menggunakan beberapa library bawaan Java:

### java.sql
Digunakan untuk koneksi database

Class yang digunakan:
- Connection
- DriverManager
- PreparedStatement
- Statement
- ResultSet

### java.util
Digunakan untuk utilitas program seperti:

- Scanner
- ArrayList

---

# Database

Program menggunakan **MySQL Database**.

## Membuat Database
CREATE DATABASE kampus;

## Menggunakan Database
USE kampus;

## Membuat Tabel Mahasiswa
CREATE TABLE mahasiswa(
nim VARCHAR(10),
nama VARCHAR(50),
jurusan VARCHAR(50),
semester INT
);

---

# Cara Menjalankan Program

1. Install **Java JDK** / add java extension on vscode
2. Install **MySQL** & **apache**
3. Make sure xampp is ready 
4. Cari MySqlConnector.jar
5. Buat database dan tabel sesuai script di atas
6. Jalankan class `Main.java`
7. Pilih menu yang tersedia

Menu program:
Tambah Data

Tampil Data

Hapus Data

Keluar

---

# Contoh Output Program
=== SISTEM DATA MAHASISWA ===

Tambah Data

Tampil Data

Hapus Data

Keluar
Pilih: 1
NIM: 230030140
Nama: Galang
Jurusan: SI
Semester: 6

---

# Tujuan Program

Tujuan dari program ini adalah:

- Mempelajari konsep **pemrograman berorientasi objek**
- Mengimplementasikan **koneksi database menggunakan JDBC**
- Membuat aplikasi sederhana berbasis **CRUD**
- Melatih penggunaan **package, interface, dan inheritance**

---

# Author

Program dibuat untuk keperluan tugas **Pemrograman Berorientasi Objek / Software Development**.