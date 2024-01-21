

Cara Menggunakan
Pastikan Anda telah menginstal backend  Java Development Kit (JDK), Apache Maven, Database MySQL di perangkat Anda.
Clone repositori ke perangkat lokal Anda.

Langkah-langkah Instalasi
Back-End (Spring Boot):

Clone repositori proyek.

git clone https://github.com/hafizs08/TugasJavan
cd perpustakaan-digital/demo

Konfigurasi basis data MySQL di file application.properties.

tambahkan database di mysql dengan nama javan

Jalankan aplikasi Spring Boot.

mvn spring-boot:run

endpoint nya
Link dasar : http://localhost:8181/
GET /books: Mendapatkan daftar semua buku dalam perpustakaan.
GET /books/{id}: Mendapatkan detail buku berdasarkan ID.
POST /books: Menambahkan buku baru ke dalam perpustakaan.
PUT /books/{id}: Memperbarui informasi buku berdasarkan ID.
DELETE /books/{id}: Menghapus buku dari perpustakaan berdasarkan ID.

