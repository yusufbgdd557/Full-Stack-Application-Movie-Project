# Full-Stack-Application-Movie-Project


Movie API, film bilgilerini yönetmek için kullanılan bir RESTful web servisidir. Bu servis, MongoDB veritabanını kullanarak film verilerini depolar ve çeşitli API endpoint'leri aracılığıyla erişim sağlar.

## Teknolojiler

- Spring Boot 3.2.0
- MongoDB
- Lombok

## API Endpoint'leri

- **GET /api/v1/movies:** Tüm filmleri getirir.
- **GET /api/v1/movies/{id}:** Belirtilen ID'ye sahip filmi getirir.

Notlar
- MongoDB bağlantı URI'sini application.properties dosyasında güncelleyin.
- spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<your-cluster-url>/movie-api-db
- `<username>`, `<password>`, `<your-cluster-url>` gibi yer tutucularını kendi MongoDB veritabanı bilgilerinizle değiştirin.
- API endpoint'leri bölümünü projenizin sunduğu özel endpoint'lerle güncelleyin.
- Katkıda bulunma bölümü, projenize katkıda bulunmak isteyen geliştiricilere yönelik bilgiler içermelidir.
- Lisans bölümünü projenizin lisans bilgileriyle güncelleyin.
