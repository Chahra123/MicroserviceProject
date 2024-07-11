package com.jihene.microevent.Services;

import com.jihene.microevent.Entity.Event;
import com.jihene.microevent.Entity.EventCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface IEventService {

    List<Event>  getAllEvents();
    Page<Event> getFilteredEvents(
            List<EventCategory> categories,
            Double minPrice,
            Double maxPrice,
            Date startDate,
            Date endDate,
            String search,
            Pageable pageable);
    Event getEventById(int id);

    Event addEvent(Event event);

    void updateEvent(Event event);

    void deleteEvent(int id);
    List<EventCategory> getCategories();

    long eventCount();
}
