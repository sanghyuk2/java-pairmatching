package pairmatching.repository;

import pairmatching.domain.Crew;
import pairmatching.domain.Stage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairMatchingRepository {
    private Map<Stage, List<List<String>>> pairMatch = new HashMap<>();

    public boolean hasPair(Stage stage) {
        return pairMatch.containsKey(stage);
    }

    public void storePair(Stage stage, List<List<String>> crewList) {
        pairMatch.put(stage, crewList);
    }

    public List<List<String>> getPairMatch(Stage stage) {
        return pairMatch.get(stage);
    }

    public void clear() {
        pairMatch.clear();
    }

}
