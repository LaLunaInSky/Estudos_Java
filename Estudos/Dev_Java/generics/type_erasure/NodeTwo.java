package type_erasure;

public class NodeTwo<T> {

    private T data;
    
    public NodeTwo(
        T data
    ) {
        this.data = data;
    }

    public void setData(
        T data
    ) {
        IO.println(
            "Node.setData"
        );

        this.data = data;
    }

    public T getData() {
        return data;
    }
}
