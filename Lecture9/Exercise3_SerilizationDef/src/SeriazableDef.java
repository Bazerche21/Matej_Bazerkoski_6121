import java.io.Serializable;

public class SeriazableDef implements Serializable {
    public String productName;
    private String feature;
    private transient int featureCount;

    public SeriazableDef () {
    }

    public String getProductName () {
        return productName;
    }

    public void setProductName ( String productName ) {
        this.productName = productName;
    }

    public String getFeature () {
        return feature;
    }

    public void setFeature ( String feature ) {
        this.feature = feature;
    }

    public int getFeatureCount () {
        return featureCount;
    }

    public void setFeatureCount ( int featureCount ) {
        this.featureCount = featureCount;
    }

    @Override
    public String toString () {
        return "SeriazableDef{" +
                "productName='" + productName + '\'' +
                ", feature='" + feature + '\'' +
                ", featureCount=" + featureCount +
                '}';
    }
}
