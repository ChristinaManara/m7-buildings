package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private Boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public Boolean hasPool() {
        return mPool;
    }

    public void setPool(Boolean mPool) {
        this.mPool = mPool;
    }

    public String toString() {
        return "Owner: " + (mOwner != null ? mOwner : "n/a") +
                (hasPool() ? "; has a pool" : "") +
                (calcLotArea() > calcBuildingArea() ? "; has a big open space" : "");

    }
    public boolean equals(Object object){
        House house = (House) object;
        return object instanceof House && (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());
    }
}
