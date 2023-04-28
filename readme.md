# Belajar Spring Dasar
- source : programmer Zaman now


### Inversion of Control (IoC)
- merupakan prinsip dalam pembuatan perangkat lunak, dimana kita  melakukan pemindahan kontrol untuk objek atau program ke sebuah container di framework.
- memiliki kontrol untuk melakukan eksekusi program kita, memanajemen object  pada program kita dan melakukan abstraction terhadap program kita

### Application Context
- interface representasi container IoC di Spring
- inti dari Spring framework
- ApplicationContext banyak sekali class implementasinya, secara garis besar dibagi menjadi 2 jenis implementasi, XML dan Annotation


### Configuration 
- Untuk membuat ApplicationContext menggunakan Annotation, pertama kita bisa perlu membuat Configuration class
- Configuration Class adalah sebuah class yang memiliki annotation @Configuration 

### Bean
- Object yang dimasukan ke dalam Spring Container disebut bean
- Secara default, bean merupakan singelton. JIka kita mengakses bean yang sama, maka akan mengembalikan object yang sama



### Dependency Injection
- teknik dimana kita bisa mengotomatisasi proses pembuatan object yang tergantung dengan object lain, atau kita sebut dependencies
- Dependencies akan secara otomatis di-inject (dimasukkan) kedalam object yang membutuhkannya
- Spring Framework sejak awal dibilang sebuah framework IoC yang memang cara kerjanya menggunakan Dependency Injection

### circular dependency 
- ketika bean A membutuhkan bean B
- dan bean B memnutuhkan bean A
- spring akan memunculkan error creating bean

### Depends On Bean
- kita ingin sebuah bean dibuat setelah bean lain dibuat