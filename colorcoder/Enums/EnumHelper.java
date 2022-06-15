package colorcoder.Enums;

public class EnumHelper {
    public static <E extends ColorEnum> E fromIndex(int index, E[] values) {
        for (E e : values) {
            if (e.getIndex() == index) {
                return e;
            }
        }
        return null;
    }
}
