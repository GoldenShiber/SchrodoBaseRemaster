package com.basicschrodobert.schordobert.races;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Race {

    HUMAN,
    ELF,
    ORC,
    GNOME,
    UNKNOWN;

}


