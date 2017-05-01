package com.example.anita.walkietalkie;
//TODO
public enum ClientOperation {
    SIGNIN((byte)0),
    SIGNUP((byte)1),
    ADDCONTACT((byte)2),
    CREATEROOM((byte)3),
    ADDPARTICIPANT((byte)4),
    SENDCURRROOM((byte)5),
    GETCONTACTS((byte)6),
    GETROOMS((byte)7),
    GETPARTICIPANTS((byte)8),
    SENDRECORD((byte)9),
    EXITROOM((byte)12),
    DELETEPARTICIPANT((byte)13),
    SENDCURRCHAT((byte)14),
    GET_ABOUT_INFO((byte)16);

    private byte value;

    ClientOperation(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }
}