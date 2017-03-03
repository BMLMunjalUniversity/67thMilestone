package com.bml67.android.a67thmilestonebml;

class favouritesdatabase {
    private int _id;
    private String _name,_time,_place;
    favouritesdatabase()
    {

    }
    favouritesdatabase(String name,String time,String place)
    {
        _name = name;
        _time = time;
        _place = place;
    }
    public int get_id() {
        return _id;
    }

    String get_name() {
        return _name;
    }

    String get_time() {
        return _time;
    }

    String get_place() {
        return _place;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_time(String _time) {
        this._time = _time;
    }

    public void set_place(String _place) {
        this._place = _place;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

}

