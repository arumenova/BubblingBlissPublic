package org.example.bubblingbliss.respository;

import org.example.bubblingbliss.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
