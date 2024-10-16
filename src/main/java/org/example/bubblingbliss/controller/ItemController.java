package org.example.bubblingbliss.controller;

import lombok.RequiredArgsConstructor;
import org.example.bubblingbliss.model.Item;
import org.example.bubblingbliss.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bubbling")
@RequiredArgsConstructor

public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public List<Item> getItems() {
        return itemService.getAllItems();
    }
    @GetMapping("/{id}")

    public Item getItem(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item createItem(@RequestBody Item item) {
        return itemService.createItem(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        return itemService.updateItem(item, id);
    }
//
//    @PatchMapping("/{id}")
//    public Item updateStock (@RequestBody @Valid ModifyStockRequest modifyStockRequest,@PathVariable Long id) {
//
//        return itemService.updateStock(modifyStockRequest,id);
//    }

    @GetMapping("/formatted")
    public List<String> getFormattedItems() {
        return itemService.getFormattedPrice();
    }




}


