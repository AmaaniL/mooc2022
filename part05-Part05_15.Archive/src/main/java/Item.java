
public class Item {

    private String identifier;
    private String name;

    public Item(String initialIdentifier, String initialName) {
        this.identifier = initialIdentifier;
        this.name = initialName;
    }
    public String getIdentifier(){
        return identifier;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return this.identifier.equals(comparedItem.identifier);
    }
}
