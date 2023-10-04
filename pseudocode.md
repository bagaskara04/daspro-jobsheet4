Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan harga barang}

Deklarasi:
harga, jumlah, jumlah_halbuku : int
dis, total, bayar, jmlDis : double
merk_buku : String
Deskripsi:

1.	Print “Masukkan merk buku yang dibeli”
2.	Read merk_buku
3.	Print “Masukkan jumlah halaman buku”
4.	Read jumlah_halbuku
5.	print "Masukkan harga barang yang dibeli”
6.	read harga
7.	print " Masukkan Jumlah jumlah barang yang dibeli”
8.	read jumlah
9.	print “Masukkan jumlah diskon”
10.	read jmlDiskon
11.	total = harga *jumlah
12.	jmlDis=total*dis
13.	bayar=total-jmlDis
14.	print jmlDiskon
15.	print "Jumlah yang harus dibayar adalah”
16.	print bayar
