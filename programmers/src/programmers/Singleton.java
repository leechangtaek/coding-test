package programmers.src.programmers;

/**
 *
 * inner class로 인해 복잡해 보일 수 있지만 생각보다 간단합니다.
 *
 * private inner static class를 두어 싱글톤 인스턴스를 갖게 합니다.
 *
 * SingletonHelper 클래스는 Singleton 클래스가
 * Load 될 때에도 Load 되지 않다가 getInstance()가 호출됐을 때
 * 비로소 JVM 메모리에 로드되고, 인스턴스를 생성하게 됩니다.
 *
 * 아울러 synchronized를 사용하지 않기 때문에 4번에서 문제가 되었던 성능 저하 또한 해결됩니다.
 */

public class Singleton {

    private Singleton(){}

    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
