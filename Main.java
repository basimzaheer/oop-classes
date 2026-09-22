class cars {
    String Model_Name;
    String Model_code;
    int Model_id;

    public void display_name(){
        System.out.println("Model name: "+Model_Name);
    }
    public void display_code(){
        System.out.println("Model name: "+Model_code);
    }

    public void display_id(){
        System.out.println("Model id: "+Model_id);
    }
    public static void main(String[] args){
        cars c1 = new cars();
        c1.Model_Name = "Honda";
        c1.Model_code = "HD1234";
        c1.Model_id = 44;
        c1.display_name();
        c1.display_code();
        c1.display_id();
    }
}