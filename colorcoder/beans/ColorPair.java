package colorcoder.beans;

import colorcoder.Constants.ColorConstants;
import colorcoder.Enums.MajorColor;
import colorcoder.Enums.MinorColor;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    public String ToString() {
        String colorPairStr = ColorConstants.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += ColorConstants.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
