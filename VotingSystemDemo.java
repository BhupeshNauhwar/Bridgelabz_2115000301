import java.util.*;

class VotingSystem {
    private HashMap<String, Integer> voteCount;
    private LinkedHashMap<String, Integer> voteOrder;
    private TreeMap<String, Integer> sortedResults;

    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
        sortedResults = new TreeMap<>();
    }

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
        sortedResults.put(candidate, voteCount.get(candidate));
        System.out.println("Vote casted for: " + candidate);
    }

    public void displayVoteOrder() {
        System.out.println("\nVotes in order of casting:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displaySortedResults() {
        System.out.println("\nSorted Results (Alphabetical Order):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displayResultsByVotes() {
        System.out.println("\nResults Sorted by Vote Count (Descending Order):");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(voteCount.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class VotingSystemDemo {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Charlie");
        system.castVote("Bob");
        system.castVote("Alice");

        system.displayVoteOrder();
        system.displaySortedResults();
        system.displayResultsByVotes();
    }
}
