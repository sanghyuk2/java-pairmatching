package pairmatching.service;

import pairmatching.domain.Stage;
import pairmatching.domain.enums.Course;
import pairmatching.domain.enums.Level;
import pairmatching.repository.PairMatchingRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static camp.nextstep.edu.missionutils.Randoms.shuffle;

public class PairMatchingService {
    private final PairMatchingRepository pairMatchingRepository = new PairMatchingRepository();
    Stage stage;

    public boolean isAlreadyMatched(String input) {
        String[] stageArr = input.split(", ");
        stage = new Stage(Course.findCourse(stageArr[0]), Level.findLevel(stageArr[1]), stageArr[2]);
        return pairMatchingRepository.hasPair(stage);
    }

    public void pairMatching(Map<Course, List<String>> courseListMap) {
        List<String> shuffledCrewList = shuffle(courseListMap.get(stage.getCourse()));

        if (shuffledCrewList.size() % 2 == 0) {
            pairMatchingRepository.storePair(stage, makeEven(shuffledCrewList));
        }
        if (shuffledCrewList.size() % 2 != 0) {
            pairMatchingRepository.storePair(stage, makeOdd(shuffledCrewList));
        }
    }

    private List<List<String>> makeEven(List<String> shuffledCrewList) {
        List<List<String>> evenPair = new ArrayList<>();

        for (int i = 0; i < shuffledCrewList.size(); i += 2) {
            evenPair.add(shuffledCrewList.subList(i, Math.min(i + 2, shuffledCrewList.size())));
        }

        return evenPair;
    }

    private List<List<String>> makeOdd(List<String> shuffledCrewList) {
        List<List<String>> oddPair = new ArrayList<>();

        for (int i = 0; i < shuffledCrewList.size() - 3; i += 2) {
            oddPair.add(shuffledCrewList.subList(i, Math.min(i + 2, shuffledCrewList.size() - 3)));
        }

        oddPair.add(shuffledCrewList.subList(shuffledCrewList.size() - 3, shuffledCrewList.size()));

        return oddPair;
    }

    public List<List<String>> searchPair(Stage stage) {
        return pairMatchingRepository.getPairMatch(stage);
    }

    public List<List<String>> getPair() {
        return pairMatchingRepository.getPairMatch(stage);
    }

    public void clearAll() {
        pairMatchingRepository.clear();
    }
}
