package factory;

/**
 *
 * @author miguelangel
 */
class Util {
    
    private static boolean testMode = true;

    public static boolean isTestMode() {
        return testMode;
    }

    public static void setTestMode(boolean tMode) {
        testMode = tMode;
    }
    
}
