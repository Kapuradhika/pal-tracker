package io.pivotal.pal.tracker;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TimeEntryRepository {
    TimeEntry create(TimeEntry entry);

    TimeEntry find(Long nonExistentTimeEntryId);

    List<TimeEntry> list();

    TimeEntry update(Long eq, TimeEntry entry);

    void delete(Long timeEntryId);
}
