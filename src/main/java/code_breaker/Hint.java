package code_breaker;

public class Hint {
    public final boolean matched;
    public final int samePlaceCount;
    public final int sameNumberCount;
    
    public Hint(boolean matched, int samePlaceCount, int sameNumberCount) {
        super();
        this.matched = matched;
        this.samePlaceCount = samePlaceCount;
        this.sameNumberCount = sameNumberCount;
    }
}
