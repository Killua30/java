package ru.bank.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.bank.entity.Client;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/v1/clients")
public class DeveloperRestControllerV1 {
    public List<Client> CLIENTS = Stream.of(
            new Client(1, "Ivan", "13356",25.3),
            new Client(2, "Marat", "223462",1000000.0),
            new Client(3, "Petya", "4436",1.5),
            new Client(4, "Vova", "42346",270.55),
            new Client(5, "Dima", "5535",52.3),
            new Client(6, "Dasha", "62865",550000.0),
            new Client(7, "Alya", "723572",2341.1),
            new Client(8, "Polina", "85724",500.0),
            new Client(9, "Stepa", "95217",0.0),
            new Client(10, "Andrey", "10245852",66666.6)
    ).collect(Collectors.toList());
    Client[] Clients = {new Client(1, "Ivan", "13356",25.3),
            new Client(2, "Marat", "223462",1000000.0),
            new Client(3, "Petya", "4436",1.5),
            new Client(4, "Vova", "42346",270.55),
            new Client(5, "Dima", "5535",52.3),
            new Client(6, "Dasha", "62865",550000.0),
            new Client(7, "Alya", "723572",2341.1),
            new Client(8, "Polina", "85724",500.0),
            new Client(9, "Stepa", "95217",0.0),
            new Client(10, "Andrey", "10245852",66666.6) };

@RequestMapping("p1")
public String page1(){
    return "Name: " +Clients[0].getName() + "\r\n" + "Balance: " +Clients[0].getBalance();

    }
    @RequestMapping("p2")
    public String page2(){
        return "Name: " +Clients[1].getName() + "\r\n" + "Balance: " +Clients[1].getBalance();

    }
    @RequestMapping("p3")
    public String page3(){
        return "Name: " +Clients[2].getName() + "\r\n" + "Balance: " +Clients[2].getBalance();

    }
    @RequestMapping("p4")
    public String page4(){
        return "Name: " +Clients[3].getName() + "\r\n" + "Balance: " +Clients[3].getBalance();

    }
    @RequestMapping("p5")
    public String page5(){
        return "Name: " +Clients[4].getName() + "\r\n" + "Balance: " +Clients[4].getBalance();

    }
    @RequestMapping("p6")
    public String page6(){
        return "Name: " +Clients[5].getName() + "\r\n" + "Balance: " +Clients[5].getBalance();

    }
    @RequestMapping("p7")
    public String page7(){
        return "Name: " +Clients[6].getName() + "\r\n" + "Balance: " +Clients[6].getBalance();

    }
    @RequestMapping("p8")
    public String page8(){
        return "Name: " +Clients[7].getName() + "\r\n" + "Balance: " +Clients[7].getBalance();

    }
    @RequestMapping("p9")
    public String page9(){
        return "Name: " +Clients[8].getName() + "\r\n" + "Balance: " +Clients[8].getBalance();

    }
    @RequestMapping("p10")
    public String page10(){
        return "Name: " +Clients[9].getName() + "\r\n" + "Balance: " +Clients[9].getBalance();

    }





    @GetMapping
    public List<Client> getAll() {
        return CLIENTS;
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('developers:read')")
    public Client getById(@PathVariable int id) {
       return CLIENTS.stream().filter(client -> client.getId()==(id))
               .findFirst()
                .orElse(null);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('developers:write')")
    public Client create(@RequestBody Client client) {
      this.CLIENTS.add(client);
       return client;
   }




}
