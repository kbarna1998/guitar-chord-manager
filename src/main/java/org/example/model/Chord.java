package org.example.model;

import lombok.*;

@Data
public class Chord {
    private String root;
    private String type;
    private String modifier;
    private String bass;
    private FingeringPosition[] fingering;

    public enum FingeringPosition {
        X, O,
        F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, F13, F14, F15, F16, F17;
    }

    public String getFullName() {
        return root + (type != null ? type : "") + (bass != null ? "/" + bass : "");
    }


}
