package type_erasure;

public class MyNode extends NodeTwo<Integer> {

    public MyNode(
        Integer data
    ) {
        super(
            data
        );
    }

    public void setData(
        Integer data
    ) {
        IO.println(
            "MyNode.setData"
        );

        super.setData(
            data
        );
    }

    public Integer getData() {
        return super.getData();
    }
}
