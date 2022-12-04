package pairmatching.service;

import pairmatching.domain.Stage;
import pairmatching.domain.enums.Course;
import pairmatching.domain.enums.Level;
import pairmatching.repository.PairMatchingRepository;

public class PairMatchingService {
    private final PairMatchingRepository pairMatchingRepository = new PairMatchingRepository();
    Stage stage;

    public boolean isAlreadyMatched(String input) {
        String[] stageArr = input.split(", ");
        stage = new Stage(Course.findCourse(stageArr[0]), Level.findLevel(stageArr[1]), stageArr[2]);
        return pairMatchingRepository.hasPair(stage);
    }
}
