package colorcoder;


import colorcoder.Enums.MajorColor;
import colorcoder.Enums.MinorColor;
import colorcoder.test.ColorTest;
import colorcoder.utils.ColorUtils;

public class Main {
    public static void main(String[] args) {
        ColorTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        ColorTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        System.out.println("********Reference manual*********");
        ColorUtils.printColorManual();
    }
}
