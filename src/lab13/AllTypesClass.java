package lab13;

public class AllTypesClass {
    private Object[] elements;

    public AllTypesClass () {}

    public AllTypesClass(Object[] elements) {
        this.elements = elements;
    }

    public Object[] getElements() {
        return elements;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("OutOfBounds!");
        }
        return elements[index];
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
