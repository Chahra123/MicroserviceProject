package com.jihene.microevent.Entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RelevantEvent {
    private Integer idEvent;
    private String name;

    //private String campPlaceLocation;
    private byte[] image;
}
