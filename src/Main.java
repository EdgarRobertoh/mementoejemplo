public class Main {
    public static void main(String[] args) {
        // Crear el objeto Origen
        Originator originator = new Originator();
        originator.setState("Estado 1");

        // Crear el objeto Cuidador y guardar el estado actual
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(originator.saveStateToMemento());

        // Cambiar el estado del objeto Origen
        originator.setState("Estado 1");

        // Restaurar el estado anterior desde el objeto Memento
        originator.restoreStateFromMemento(caretaker.getMemento());

        System.out.println("Estado actual del objeto Origen: " + originator.getState());
    }
}