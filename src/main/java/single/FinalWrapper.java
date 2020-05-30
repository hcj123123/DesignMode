package single;

/**
 * @author Jackey
 * @date 2020/5/30
 */


class FinalWrapper<T> {

    public final T value;

    public FinalWrapper(T value) {
        this.value = value;
    }

}

class FinalSingleton {

    private FinalWrapper<FinalSingleton> helperWrapper = null;

    public FinalSingleton getHelper() {
        FinalWrapper<FinalSingleton> wrapper = helperWrapper;
        if (wrapper == null) {
            synchronized (this) {
                if (helperWrapper == null) {
                    helperWrapper = new FinalWrapper<FinalSingleton>(new FinalSingleton());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;

    }

}
