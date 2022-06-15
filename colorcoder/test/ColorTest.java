package colorcoder.test;

import colorcoder.beans.ColorPair;
import colorcoder.Enums.MajorColor;
import colorcoder.Enums.MinorColor;
import colorcoder.utils.ColorUtils;

public class ColorTest {
    public static void testNumberToPair(int pairNumber,
                                        MajorColor expectedMajor,
                                        MinorColor expectedMinor)
    {
        ColorPair colorPair = ColorUtils.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber)
    {
        int pairNumber = ColorUtils.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}
