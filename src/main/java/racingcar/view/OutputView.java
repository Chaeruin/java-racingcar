package racingcar.view;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OutputView {

    public void printRace(Map<String, Integer> races) {
        for (Entry<String, Integer> race: races.entrySet()) {
            System.out.print(race.getKey() + " : ");
            System.out.print("-".repeat(race.getValue()) + "\n");
        }
    }

    public void printRacingResult(List<Map<String, Integer>> racing, List<String> winner) {
        for (Map<String, Integer> races: racing) {
            printRace(races);
        }
        printWinner(winner);
    }

    public void printWinner(List<String> winner) {
        System.out.print("최종 우승자 : ");
        for (String w : winner) {
            System.out.print(w);
            if (winner.indexOf(w) != winner.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
