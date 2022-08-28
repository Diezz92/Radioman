public class Radio {

    private int CurrentStation;
    private int CurrentVolume;

    public int getCurrentStation() {
        return CurrentStation;
    }
    public void setCurrentStation(int NewCurrentStation) {
        CurrentStation = NewCurrentStation;
    }

    public void next () {
        if (CurrentStation >= 9) {
            CurrentStation = 0;
        } else {
            CurrentStation++;
        }
    }

    public void prev () {
        if (CurrentStation == 0) {
            CurrentStation = 9;
            return;
        }
        if (CurrentStation < 0 || CurrentStation > 9) {
            CurrentStation = 0;
        }else {
            CurrentStation = CurrentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }
    public void setCurrentVolume(int NewCurrentVolume) {
        CurrentVolume = NewCurrentVolume;
    }

    public void plus () {
        if (CurrentVolume >= 10) {
            CurrentVolume = 10;
        } else {
            CurrentVolume++;
        }
    }

    public void minus () {
        if (CurrentVolume <= 0) {
            CurrentVolume = 0;
            return;
        }
        if (CurrentVolume > 10) {
            CurrentVolume = 10;
            return;
        } else {
            CurrentVolume = CurrentVolume - 1;
        }
    }
}