package com.example.application;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Endpoint
@AnonymousAllowed
public class GroceryEndpoint {

    private final List<GroceryItem> groceryList = new ArrayList<>();

    public @NotNull List<@NotNull GroceryItem> getGroceries() {
        return groceryList;
    }

    public GroceryItem save(GroceryItem groceryItem) {
        groceryList.add(groceryItem);
        return groceryItem;
    }
}
