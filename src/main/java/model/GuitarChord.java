package model;

import lombok.*;

@Data
public class GuitarChord {
    private String root;
    private String type;
    private String modifier;
    private String bass;
    private String[] fingering;
}
