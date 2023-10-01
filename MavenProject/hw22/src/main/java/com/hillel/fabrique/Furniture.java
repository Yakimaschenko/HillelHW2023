package com.hillel.fabrique;

abstract class Furniture {public abstract void assemble(); }

    // Конкретний клас для столу
    class Table extends Furniture {
        @Override public void assemble() {
            System.out.println("Зібрано стіл");
        }
    }
    // Конкретний клас для стільця
    class Chair extends Furniture {
        @Override public void assemble() {
            System.out.println("Зібрано стілець");
        }
    }
    // Фабрика для створення меблів
    class FurnitureFactory {
        public Furniture createFurniture(String type) {
            if ("стіл".equalsIgnoreCase(type)) {
                return new Table();
            } else if ("стілець".equalsIgnoreCase(type)) {
                return new Chair();
            } else { throw new IllegalArgumentException("Невідомий тип меблів: " + type);
            }
        }
    }
    // Використання фабрики public
    class FactoryPatternExample {
        public static void main(String[] args) {
            FurnitureFactory factory = new FurnitureFactory();
            Furniture table = factory.createFurniture("стіл");
            table.assemble(); Furniture chair = factory.createFurniture("стілець");
            chair.assemble();
        }
    }
    
