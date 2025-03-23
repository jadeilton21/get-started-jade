public class PetMachine {




    private boolean clean;

    private int water;

    private int shampoo;


    private Pet pet;


    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque um pet");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() +" ESTÁ LIMPOOO");
    }


    public void addWater(){
        if(water==30){

            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }
        water+=2;
    }
    public void addS(){
        if(water==10){

            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }
        shampoo+=2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }


    public boolean hasPet(){
        return pet!=null;
    }


    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina está suja, para colocar o pet é necessário lima-la");
        }

        if(hasPet()){
            System.out.println("O pet" + this.pet.getName() + "está na máquina nesse momento");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){

        this.clean = this.pet.getClean();
        System.out.println("O pet" + this.pet.getName() + " está LIMPOOOOOOOO");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpaaaaaaaaa");
    }
}

