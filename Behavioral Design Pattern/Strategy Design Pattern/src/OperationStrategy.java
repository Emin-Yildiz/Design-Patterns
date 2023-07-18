public class OperationStrategy {

    public static Process findStrategy (String operations){
        if(operations.equals(Operations.ADD)){
            return new AddOperation();
        }
        else if(operations.equals(Operations.SUBTRACT)){
            return new SubtractOperation();
        }
        else if(operations.equals(Operations.MULTIPLY)){
            return new MultiplyOperation();
        }
        else if(operations.equals(Operations.DIVIDE)){
            return new DivideOperation();
        }
        else{
            return null;
        }
    }
}
