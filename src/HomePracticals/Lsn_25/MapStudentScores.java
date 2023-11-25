package HomePracticals.Lsn_25;

import java.util.HashMap;
import java.util.Map;

public class MapStudentScores {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ali", 85);
        map.put("Yusuf", 77);
        map.put("Amir", 95);
        map.put("Galib", 44);
        map.put("Pasha", 57);
        map.put("Zloy Mamed", 23);
        map.put("Naomi", 89);


        float average = averageScore(map, 0);
        System.out.println("Average score: " + average);

        highestScore(map);
        lowestScore(map);
        studentsAboveThreshold(map, 80);


    }

    public static float averageScore(Map<String, Integer> map, int sum) {
        for (Map.Entry<String, Integer> mapScore : map.entrySet()) {
            sum += mapScore.getValue();
        }
        float average = (float) sum / map.size();
        return average;
    }

    public static void highestScore(Map<String, Integer> map) {
        int highestScore = 0;
        String name = "";

        for (Map.Entry<String, Integer> mapScore : map.entrySet()) {
            if (mapScore.getValue() > highestScore) {
                highestScore = mapScore.getValue();
                name = mapScore.getKey();
            }
        }
        System.out.println("Highest score: " + name + ":" + highestScore);
    }

    public static void lowestScore(Map<String, Integer> map) {
        int lowestScore = 100;
        String name = "";
        for (Map.Entry<String, Integer> mapScore : map.entrySet()) {
            if (mapScore.getValue() < lowestScore) {
                lowestScore = mapScore.getValue();
                name = mapScore.getKey();
            }
        }
        System.out.println("Lowest score: " + name + ":" + lowestScore);
    }

    public static void studentsAboveThreshold(Map<String, Integer> map, int threshold) {
        for (Map.Entry<String, Integer> highScores : map.entrySet()) {
            if (highScores.getValue() >= threshold) {
                System.out.println(highScores.getKey() + ":" + highScores.getValue());
            }
        }
    }
}
