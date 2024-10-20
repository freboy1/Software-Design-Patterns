package assignment_3;


import assignment_3.Assignment3.Chain.*;
import assignment_3.Assignment3.Command.*;
import assignment_3.Assignment3.Iterator.*;
import assignment_3.Assignment3.Mediator.*;
import assignment_3.Assignment3.Memento.*;

public class Main {
    /**
     * The Main class demonstrates the Chain of Responsibility,
     * Command, Iterator, Mediator and Memento patterns.
     */
        public static void main(String[] args) {
            // Chain
            PaymentHandler paymentMethods = new PaymentA();
            paymentMethods  .setNext(new PaymentB())
                    .setNext(new PaymentC());

            paymentMethods.handle(210);

            System.out.println();
            //Command
            Television television = new Television();
            RemoteControl remoteControl = new RemoteControl();
            remoteControl   .setCommand("VolumeUp", new VolumeUpCommand(television))
                    .setCommand("VolumeDown", new VolumeDownCommand(television))
                    .setCommand("TurnOn", new TurnOnCommand(television))
                    .setCommand("TurnOff", new TurnOffCommand(television))
                    .setCommand("NextChannel", new NextChannelCommand(television))
                    .setCommand("PrevChannel", new PreviousChannelCommand(television));

            remoteControl   .buttonPressed("TurnOn")
                    .buttonPressed("VolumeUp")
                    .buttonPressed("NextChannel")
                    .buttonPressed("VolumeDown")
                    .buttonPressed("PrevChannel")
                    .buttonPressed("TurnOff")
                    .buttonPressed("Unknown Command");

            System.out.println();

            //Iterator
            ListMovieCollection listCollection = new ListMovieCollection();
            listCollection  .addMovie("Inception")
                    .addMovie("The Matrix")
                    .addMovie("Interstellar");

            ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
            arrayCollection .addMovie("The Godfather")
                    .addMovie("Pulp Fiction")
                    .addMovie("The Dark Knight");

            Iterator<String> listIterator = listCollection.createIterator();
            System.out.println("Movies from List:");
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }

            Iterator<String> arrayIterator = arrayCollection.createIterator();
            System.out.println("\nMovies from Array:");
            while (arrayIterator.hasNext()) {
                System.out.println(arrayIterator.next());
            }

            System.out.println();

            //Mediator

            HomeMediator mediator = new HomeMediatorImpl();

            Sensor temperatureSensor = new TemperatureSensor(mediator);
            Sensor humiditySensor = new HumiditySensor(mediator);
            Sensor lightSensor = new LightSensor(mediator);

            temperatureSensor.sendData();
            humiditySensor.sendData();
            lightSensor.sendData();

            mediator.printReport();

            System.out.println();

            // Memento

            TextEditor editor = new TextEditor();
            Caretaker caretaker = new Caretaker();

            editor.addText("Hello, world!");
            editor.showText();

            caretaker.save(editor);

            editor.addText(" This is the second sentence.");
            editor.showText();

            caretaker.restore(editor);
            editor.showText();
        }
    }