# Završni projekat na kursu Java Web Development (JWD64) - FTN informatika<br>

  Aplikacija koja omogućava prikaz nastupa i izvođača na različitim festivalima.<br>
  Okačen je neizmenjen projekat, u potpunosti onako kako je urađen na testu.<br>
  Za izradu projekta polaznici imaju 3 sata.<br>

 * Tehnologije <br>
  Backend- SpringBoot <br>
  Frontend- React<br>

- za pokretanje frontend dela aplikacije- npm install<br>

* Login <br>
  ROLE_ADMIN <br>
  korisničko ime: miroslav    lozinka: miroslav<br>
  
  ROLE_KORISNIK<br>
  korisničko ime: tamara      lozinka: tamara<br>

  NEPRIJAVLJENI KORISNIK<br>
  - samo prikaz i pretraga nastupa<br>

 * Izvođači:<br>
  Admin- prikaz i dodavanje novog<br>
  Korisnik- samo prikaz<br>

 * Nastupi:<br>
  Korisnik i Admin -Prikaz, dodavanje i pretraga <br>
  Admin- Brisanje<br>
  Klikom na bilo koji red iz tabele, iskače alert sa prikazom broja nastupa datog izvođača<br>
  
  Implementirana pretraga nastupa po izvođačima i festivalima <br>
  Implementirana paginacija<br>
  Implementirano dodavanje- sa ograničenjem da jedan festival ne može imati izvođače koji dolaze iz iste države (NastupiController -> @PostMapping)<br>
