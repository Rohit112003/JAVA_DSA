package CswClass;

public class City {
    public String name;
    public long population;

    City(String name , long population){
        this.name = name;
        this.population = population;

    }
    public String getName() {
        return name;
    }

    public Long getPopulation() {
        return population;
    }
}

class Bnode{
    City info;
    public Bnode leftChild;
    public Bnode RightChild;

    public Bnode(City newCity){
        this.info = newCity;
        this.leftChild = null;
        this.RightChild =null;

    }
    public City getInfo(){
        return info;
    }
}
class BST{
    private Bnode root;
    public BST(){
        root=null;
    }
    public void insetNode(City city){
        Bnode newNode = new Bnode(city);
        if(root==null){
            root=newNode;
        }else{
            Bnode current = root;
            while(true){
                if(city.getPopulation()<current.getInfo().getPopulation()){
                    if(current.leftChild==null){
                        current.leftChild = newNode;
                    }else{
                        current = current.leftChild;
                    }
                }else{
                    if (current.RightChild== null) {
                        current.RightChild = (newNode);
                        break;
                    } else {
                        current = current.RightChild;
                    }
                }
            }
        }
    }
}
