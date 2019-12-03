package com.kiran.pocs.api;


import com.kiran.pocs.data.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
@CrossOrigin(origins = "*")
@Slf4j
public class HelloController {
    public static final String ID = "COUNTER";
//    @Autowired
//    CounterRepo repo;


//    @GetMapping("/count")
//    public ResponseEntity<Hello> count() {
//        Counter count = null;
//         Optional<Counter> counter = repo.findById(ID);
//        if (counter.isPresent()) {
//            count = counter.get();
//            log.debug("found counter with count {}", count.toString());
//        } else {
//            count = Counter.builder().id(ID).build();
//            log.info("could not find counter, so created counter with count {}", count.getCount());
//        }
//
//        int curr = count.getCount();
//        count.setCount(++curr);
//        log.debug("counter before saving {}", count);
//        repo.save(count);
//
//        Hello hello = Hello.builder().counter(count.getCount()).greeting("all is well").build();
//
//        return new ResponseEntity<Hello>(hello, HttpStatus.OK);
//
//    }

    @GetMapping("/hi")
    public ResponseEntity<Hello> hello() {

        Hello hello = Hello.builder().greeting("Hello").build();

        return new ResponseEntity<Hello>(hello, HttpStatus.OK);

    }

}
