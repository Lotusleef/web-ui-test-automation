# WEB UI Test Automation
Proyek ini merupakan bagian dari tugas kursus JAYJAY yang bertujuan untuk mengimplementasikan automated testing untuk fitur login pada aplikasi web dengan menggunakan Selenium, Cucumber dan JAVA

# Tujuan Proyek
- Membangun kerangka kerja otomatisasi pengujian UI Web.
- Mengimplementasikan pola Page Object Model (POM).
- Menggunakan Cucumber dengan Gherkin sebagai syntax pengujian.
- Menjalankan test case dengan data yang valid dan tidak valid.
- Menghasilkan laporan pengujian secara otomatis.

# Struktur Proyek
```
src
├── main
│   └── java
│       └── pages
│           └── LoginPage.java
└── test
    ├── java
    │   ├── runners
    │   │   └── LoginTestRunner.java
    │   └── stepDefinitions
    │       └── LoginSteps.java
    └── resources
        └── features
            └── login.feature
```

# Cara Menjalankan Pengujian

1. Clone repositori ini:
   ```bash
   git clone https://github.com/Lotusleef/web-ui-test-automation.git
   cd web-ui-test-automation
   ```

2. Jalankan dengan IntelliJ IDEA, atau bisa via terminal dengan Gradle:
   ```bash
   ./gradlew test
   ```

3. Hasil pengujian akan tampil di bagian konsol terminal. Jika ingin membuat laporan HTML, plugin tambahan seperti Allure bisa ditambahkan.

# Skema Pengujian

Pengujian dilakukan terhadap skenario:
- Login dengan kredensial VALID
- Login dengan kredensial TIDAK VALID

Setiap skenario ditulis dengan format `Given-When-Then`.
