
class FurnitureApp{

    public static void main(String []args){

        Bed bed=new Bed();       //Bedroom Bed

        Table table=new Table(); //living room table

       List list=new List();
        
        System.out.printf("The price of %s is %d\n",bed, bed.price());
        System.out.printf("The price of %s is %d\n",table, table.price());
        
     
       
    }
}