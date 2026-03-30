package br.pucpr.overview.javastreams;

import java.time.OffsetDateTime;

public record TrainerRunner(OffsetDateTime dateTime, Long seconds, int distance) {
}
