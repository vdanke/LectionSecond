package org.step.api.stream.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalLiveExample {

    private Map<Integer, String> database;

    public OptionalLiveExample() {
        database = new HashMap<>();
        database.put(1, "Egor");
        database.put(2, "Nursultan");
        database.put(3, "Taron");
    }

    public Optional<String> getNameOfUser(Integer key) {
        return Optional.ofNullable(database.get(key));
    }

    public static void main(String[] args) {
        OptionalLiveExample optionalLiveExample = new OptionalLiveExample();

        try {
            int key = 5;
            String username = optionalLiveExample.getNameOfUser(key)
                    .orElseThrow(() -> new NotFoundException(String.format("User not found with ID %d", key)));
            System.out.println(username);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

//        if (nameOfUser.isPresent()) {
//            System.out.println(nameOfUser.get());
//        } else {
//            System.out.println("No user");
//        }
    }
}
