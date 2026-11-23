public class FactoryTest {
    public static void main(String[] args) {

        Battery bat = new Battery(5000); // 밑에 Battery 클래스와 Phone 클래스 대한 선언이 메인에서 이루어 질 수 없는건지를 모르겠습니다.
        SmartPhone myPhone = new SmartPhone("Galaxy S24", bat, "Android");
        // 위에 2줄은 왜 메인에서 선언해야하는 것인지 이해가 잘 안 됩니다.

        System.out.println(myPhone);
    }
}

class Battery {
    int capacity;

    Battery(int capacity) {
        this.capacity = capacity; // this.기능을 사용해야 하는 이유를 잘 모르겠습니다.
        // 전체적으로 this를 쓰는 부분이 왜 필요한건지 이해가 잘 안됩니다.
    }
}

class Phone {
    String model;
    Battery battery;

    Phone(String model, Battery battery) {
        this.model = model;
        this.battery = battery;
    }
}

// SmartPhone 클래스
class SmartPhone extends Phone {
    String os;

    SmartPhone(String model, Battery battery, String os) {
        super(model, battery); // 부모로 부터 상속받은 클래스인데 왜 super을 써야하는지 모르겠습니다.
        //그냥 선언된 변수를 사용하면 안 되는건지, 차이가 이해가 안 됩니다.
        this.os = os;
    }

    @Override // 왜 Override를 통해서 이미 상위 클래스에 있는 것을 하위 클래스에서 다시 재정의를 해야하는지 개념이 이해가 안 됩니다.
    public String toString() {
        return "모델: " + model + ", 배터리: " + battery.capacity + "mAh,os:" + os;
    }
}