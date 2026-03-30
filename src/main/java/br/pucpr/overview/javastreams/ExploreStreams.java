package br.pucpr.overview.javastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class ExploreStreams {

    public TrainerRunner findBestTrainningTime(List<TrainerRunner> trainerRunners, int distance) {

        TrainerRunner trainerRunner =  trainerRunners.stream()
                .filter(c -> c.distance() == distance)
                .min(Comparator.comparingLong(c -> c.seconds())).get();

       return trainerRunner;
    }

}
