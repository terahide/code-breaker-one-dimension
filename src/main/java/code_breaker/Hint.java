package code_breaker;

public class Hint {
    public final boolean matched;
    public final int sameNumberCount;
    public final int samePlaceCount;
    
    public Hint(boolean matched, int sameNumberCount, int samePlaceCount) {
        super();
        this.matched = matched;
        this.sameNumberCount = sameNumberCount;
        this.samePlaceCount = samePlaceCount;
    }
}
