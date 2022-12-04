package pairmatching.repository;

import pairmatching.domain.Stage;

import java.util.List;

public interface PairMatchingDB {
    boolean hasPair(Stage stage);

    void storePair(Stage stage, List<List<String>> crewList);

    List<List<String>> getPairMatch(Stage stage);

    void clear();
}
