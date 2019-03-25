# Tugas 2 - Spring Form dan Model

a) Deskripsi singkat jalannya aplikasi

- Data yang harus dientry di dalam form merupakan data yang berobjek String
    - ID Dokter (iddoc)
    - Nama (name)
    - Alamat (address)
    - E-mail (email)

- Bagaimana data diproses pada controller (sebutkan pula route URL dan fungsi yang memproses form tersebut)

![image](https://user-images.githubusercontent.com/32873347/54914778-597a8a80-4f28-11e9-938a-998260e9207c.png)

Data diproses pada controller melalui fungsi GET yang telah dideklarasikan pada artibut class yang telah dibuat, sehingga pada JSP Form kita mendeklarasikan modelAttribute ke arah class yang telah kita buat tadi, lalu pada controller memanggil fungsi dengan parameter form serta class nya. modelAttribute ini sangat penting karena mengarahkan kemana data class yang akan diproses oleh controller serta fungsi requestMethod GET dipergunakan untuk mengambil data oleh controller pada class yang dituju melalui JSP Form.

- Bagaimana controller mengirimkan data ke view ke halaman yang lain.

![image](https://user-images.githubusercontent.com/32873347/54914781-5e3f3e80-4f28-11e9-9012-75315147be09.png)

Controller mengirimkan data pada halaman lain menggunakan requestMethod POST yang sebelumnya juga telah dideklarasikan dalam JSP Form yang berfungsi untuk mengambil data dan menampilkan pada halaman lain. Pada controller ini juga mengarahkan ke URL mana yang akan menampilkan keluaran dr POST.
Controller mengirimkan data ke view halaman lain menggunakan fungsi POST yang telah dideklarasikan pada JSP

b) Screenshot form entry

![image](https://user-images.githubusercontent.com/32873347/54914039-ab221580-4f26-11e9-8d71-e126b53675b2.png)

c) Screenshot output hasil entry data

![image](https://user-images.githubusercontent.com/32873347/54914088-c2f99980-4f26-11e9-8eef-1c8d38422332.png)
