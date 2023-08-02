package JWD64.Test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import JWD64.Test.enumeration.KorisnickaUloga;
import JWD64.Test.model.Korisnik;
import JWD64.Test.repository.KorisnikRepository;
import JWD64.Test.service.KorisnikService;

@Service
public class JpaKorisnikService implements KorisnikService {

    @Autowired
    private KorisnikRepository korisnikRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Optional<Korisnik> findOne(Long id) {
        return korisnikRepository.findById(id);
    }

    @Override
    public List<Korisnik> findAll() {
        return korisnikRepository.findAll();
    }

    @Override
    public Page<Korisnik> findAll(int brojStranice) {
        return korisnikRepository.findAll(PageRequest.of(brojStranice,10));
    }

    @Override
    public Korisnik save(Korisnik korisnik) {
        korisnik.setUloga(KorisnickaUloga.KORISNIK);
        return korisnikRepository.save(korisnik);
    }

    @Override
    public void delete(Long id) {
        korisnikRepository.deleteById(id);
    }

    @Override
    public Optional<Korisnik> findbyKorisnickoIme(String korisnickoIme) {
        return korisnikRepository.findFirstByKorisnickoIme(korisnickoIme);
    }

//    @Override
//    public boolean changePassword(Long id, KorisnikPromenaLozinkeDto korisnikPromenaLozinkeDto) {
//        Optional<Korisnik> rezultat = korisnikRepository.findById(id);
//
//        if(!rezultat.isPresent()) {
//            throw new EntityNotFoundException();
//        }
//
//        Korisnik korisnik = rezultat.get();
//
//        boolean passwordsMatch = BCrypt.checkpw(korisnikPromenaLozinkeDto.getStaraLozinka(), korisnik.getLozinka());
//        if(!korisnik.getKorisnickoIme().equals(korisnikPromenaLozinkeDto.getKorisnickoIme()) || !passwordsMatch){
//            return false;
//        }
//
//        // dodatak za zadatak 2
//        String password = korisnikPromenaLozinkeDto.getLozinka();
//        if (!korisnikPromenaLozinkeDto.getLozinka().equals("")) {
//            password = passwordEncoder.encode(korisnikPromenaLozinkeDto.getLozinka());
//        }
//
//        korisnik.setLozinka(password);
//
//        korisnikRepository.save(korisnik);
//
//        return true;
//    }
}
