public class Todolist {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testViewRemoveTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi kasus Todolist";
        showTodoList();
    }

    /**
     * Menambah todo list
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for(int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        // Tambahkan ke posisi yang data array nya NULL
        for(var i = 0; i < model.length; i++){
            if(model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for(int i = 0; i < 25; i++){
            addTodoList("Contoh todo ke - "  + i);
        }
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number){
        if((number - 1) >= model.length){
            return false;
        }

        if(model[number - 1] == null){
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for(int i = (number - 1); i < model.length; i++){
                if(i == (model.length -1)){
                    model[i] = null;
                }else{
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("HI " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = input("Pilih");
            if(input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();
    }

    /**
     * Menampilkan view add todo list
     */
    public static void viewAddTodoList(){
        System.out.println("Menambah Todolist");
        var todo = input("Todo (x jika batal)");

        if(todo.equals("x")){
            //batal
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view remove todo list
     */
    public static void viewRemoveTodoList(){
        System.out.println("Menghapus Todolist");
        var number = input("Nomor yang dihapus (x jika batal)");

        if(number.equals("x")){
            //batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
