# App
Di daiam "App.java" terdapat object Menu, dimana object ini akan memanggil method
``` java
menu.showmenu();
```
ini bertujuan untuk menampilkan menu dari program yang terdapat di class "menu. java"

# src
Terdata beberapa package, yaitu:
1. config
2. controller
3. layout
4. models

## 1. config
Terdapat file "MyConfig.java" yang memiliki beberapa variabel static dan sebuah method, yaitu :
1. DB_URL          : Alamat untuk memberikan koneksi ke database   --> "jdbc:mysql://localhost:3306/db_sisfo"
2. DB_USER         : Nama pengguna untuk mengakses database        --> "root"
3. DB_PASS         : Password untuk mengakses database             --> "" (tidak ada)
4. connect         : Untuk menyimpan koneksi ke database dan bertipe data Connection
5. getConnection() : Method yang digunakan untuk mendapatkan koneksi ke database

## 2. controller
Terdapat file "DataControllers.java" yang memnili variabel static dan beberapa method, yaitu :
1. connect       : Untuk menyimpan koneksi ke database. Memanggil method getConnection() dari file "MyConfig.java"
2. statement     : Variabel untuk menyimpan statement pada method
3. resultSet     : Variabel untuk menyimpan nilai hasil dari method
4. getDatabase() : Method yang digunakan untuk membaca data dari database
5. insertData()  : Method yang digunakan untuk memasukkan data baru ke database
6. deleteData()  : Method yang digunakan untuk menghapus data dari database
7. getProdukByNama : Method yang digunakan unttuk mencari nama produk
8. updateNama() : Method yang digunakan untuk memperbarui nama produk
9. updateHarga() : Method yang digunakan untuk memperbarui harga produk

## 3. layout
Terdapat beberapa file di dalamnya, yaitu :
1. Read.java
   Terdapat method showReadData untuk membaca data yang tersimpan
   ''' java
   showReadData();
   '''
2. Insert.java 
   Terdapat method showInsertData untuk menambahkan data 
   ''' java
   showInsertData();
   '''   
3. Edit.java
   Terdapat method showEditData untuk mengubah nilai
   ''' java
   showEditNama(String nama);
   showEditHarga(String nama);
   showEditJumlah(String nama);
   '''
4. Delete.java
   Terdapat method showDeleteData menghapus data 
   ''' java
   showDeleteData();
   '''
5. Menu.java
   Terdapat method showMenu untuk menampilkan menu yang ingin dipilih
   ''' java
   showMenu();
   selectMenu();
   '''

## 4. models
Terdapat Produk.java  yang memiliki properti, konstruktor, dan metode akses untuk mengatur dan mengambil nilai properti tersebut. Kode ini memungkinkan pembuatan objek Produk dengan inisialisasi nilai properti yang diinginkan dan memberikan akses untuk membaca atau mengubah nilai properti secara terpisah melalui metode getter dan setter.