//Strong HAS-A relationship

class Room {
    int area;

    Room(int area) {
        this.area = area;
    }
}

class House {
    private Room room;

    House() {
        room = new Room(200);
    }
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine = new Engine();

    void drive() {
        engine.start();
    }
}
