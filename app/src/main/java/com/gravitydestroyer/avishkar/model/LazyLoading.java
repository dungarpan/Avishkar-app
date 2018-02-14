package com.gravitydestroyer.avishkar.model;


import com.gravitydestroyer.avishkar.enums.ItemType;

public interface LazyLoading {
    ItemType getItemType();
    void setItemType(ItemType itemType);
}
