package pairmatching.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairMatchingDB {
    private final Map<Crew, List<String>> pair;

    public PairMatchingDB() {
        this.pair = new HashMap<>();
    }

    public void storePair(Map<Crew, List<String>> pair) {

    }

}