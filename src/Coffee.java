public class Coffee {

    private int _volume;
    private int _milkVolume;

    public Coffee(int volume) {
        _volume = volume;
    }

    public void fillMilk(int milkVolume) {

        _milkVolume = milkVolume;

        _volume += milkVolume;
    }

    public int getVolume() {
        return _volume;
    }

    public boolean isWithMilk() {
        return _milkVolume > 0;
    }
}
