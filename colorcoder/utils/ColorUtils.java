package colorcoder.utils;


import colorcoder.Enums.EnumHelper;
import colorcoder.beans.ColorPair;
import colorcoder.Constants.ColorConstants;
import colorcoder.Enums.MajorColor;
import colorcoder.Enums.MinorColor;

public class ColorUtils {
    public static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
                EnumHelper.fromIndex(zeroBasedPairNumber / ColorConstants.numberOfMinorColors, MajorColor.values());
        MinorColor minorColor =
                EnumHelper.fromIndex(zeroBasedPairNumber % ColorConstants.numberOfMinorColors, MinorColor.values());

        return new ColorPair(majorColor, minorColor);
    }
    public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorConstants.numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void printColorManual() {
        for(int i = 1; i<=25; i++){
            ColorPair pair = ColorUtils.GetColorFromPairNumber(i);
            System.out.println(String.format("Pair Number: %d Major color: %s Minor color: %s", i, pair.getMajor(), pair.getMinor()));
        }

    }
}
