package com.step.assignments.jewelrybox;

public class JewelryBox {

    private JewelryBox box;
    private Jewelry jewelry;
    private int jewelryCount;

    public JewelryBox() {
        this.jewelryCount = 0;
    }

    public JewelryBox(JewelryBox box) {
        this.box = box;
        this.jewelryCount += box.getJewelryCount();
    }

    public JewelryBox(Jewelry jewelry) {
        this.jewelry = jewelry;
        this.jewelryCount += 1;
    }

    public JewelryBox(JewelryBox box, Jewelry jewelry) {
        this.box = box;
        this.jewelry = jewelry;
        this.jewelryCount+=1;
        this.jewelryCount += box.getJewelryCount();
    }

    public void addJewelry(Jewelry jewelry) {
        if (this.box != null) {
            this.box.addJewelry(jewelry);
            this.jewelryCount++;
        }
    }

    public void addBox(JewelryBox box){
        this.jewelryCount+=box.getJewelryCount();
        this.box.addBox(box);
    }

    public int getJewelryCount(){
        return this.jewelryCount;
    }

}
