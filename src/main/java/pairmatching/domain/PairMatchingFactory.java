package pairmatching.domain;

import pairmatching.domain.enums.Course;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairMatchingFactory {
    private final Map<Course, List<Crew>> crewMap = new HashMap<>();

    public Map<Course, List<Crew>> makeCrew() {
        try {
            makeFrontEndCrew();
            makeBackEndCrew();
        } catch (IOException e) {
            System.out.println("[ERROR] 파일을 읽는 도중 오류가 발생하였습니다.");
        }
        return crewMap;
    }

    private static BufferedReader readFile(File filename) throws FileNotFoundException {
        return new BufferedReader(new FileReader(filename));
    }

    private void makeFrontEndCrew() throws IOException {
        List<Crew> frontEndCrew = new ArrayList<>();
        BufferedReader reader = readFile(new File("src/main/resources/frontend-crew.md"));
        String name;
        while ((name = reader.readLine()) != null) {
            frontEndCrew.add(new Crew(Course.FRONTEND, name));
        }
        crewMap.put(Course.FRONTEND, frontEndCrew);
        reader.close();
    }

    private void makeBackEndCrew() throws IOException {
        List<Crew> backEndCrew = new ArrayList<>();
        BufferedReader reader = readFile(new File("src/main/resources/backend-crew.md"));
        String name;
        while ((name = reader.readLine()) != null) {
            backEndCrew.add(new Crew(Course.BACKEND, name));
        }
        crewMap.put(Course.BACKEND, backEndCrew);
        reader.close();
    }
}
