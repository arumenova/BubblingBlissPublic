package org.example.bubblingbliss.demo;

import lombok.RequiredArgsConstructor;
import org.example.bubblingbliss.model.Item;
import org.example.bubblingbliss.respository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {

        itemRepository.saveAll(List.of(
                new Item("Mango", "Mango flavor", 12, new BigDecimal("9.99")),
                new Item("Ananas", "Ananas flavor", 5, new BigDecimal("12.99")),
                new Item("Cocos", "Cocos flavor", 6, new BigDecimal("6.99"))

        ));


    }
}
