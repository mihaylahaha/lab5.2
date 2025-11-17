package ua.lviv.tariffs.repository;

import ua.lviv.tariffs.model.Tariff;

import java.util.*;

public class TariffRepository {

    private final Map<UUID, Tariff> store = new LinkedHashMap<>();

    public void add(Tariff tariff) {
        store.put(tariff.getId(), tariff);
    }

    public void remove(UUID id) {
        store.remove(id);
    }

    public Collection<Tariff> all() {
        return store.values();
    }

    public Tariff findById(UUID id) {
        return store.get(id);
    }

    public void clear() {
        store.clear();
    }

    public boolean isEmpty() {
        return store.isEmpty();
    }
}
