package org.example.bubblingbliss.service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.bubblingbliss.model.Item;
import org.example.bubblingbliss.respository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ItemService {

    private final ItemRepository itemRepository;
    @Transactional
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);

    }
    @Transactional
    public Item updateItem(Item itemToUpdate, Long id) {
        var Item = itemRepository.findById(id);
        if (Item.isEmpty()) {
            return null;
        }
        itemToUpdate.setId(id);
        return itemRepository.save(itemToUpdate);
    }
    @Transactional
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

//    @Transactional
//    public Item updateStock(ModifyStockRequest modifyStockRequest,Long id) {
//        var Item = itemRepository.findById(id);
//        if (Item.isEmpty()) {
//            return null;
//        }
//        var actualStock = item.get().getStock();
//    }


    }


