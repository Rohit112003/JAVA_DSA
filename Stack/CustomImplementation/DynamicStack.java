package Stack.CustomImplementation;

public class DynamicStack extends Stack{
    public DynamicStack(){
        super();// it will call stack()
    }
    public DynamicStack(int size){
        super();// it will call stack(size)
    }

    @Override
    public boolean push(int item) {
        //this take cares of it being full
      if(this.isFull()){
            //double the array sizze
          int[] temp = new int[data.length*2];
          //copy all the prevoius item in new data
          for (int i = 0; i < data.length; i++) {
              temp[i] = data[i];

          }
          data = temp;
      }
      //at this point we know that array is not full
        //insert item
        return super.push(item);
    }
}
