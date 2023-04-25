package hw.ch11;

public class File extends Entry {
    private String name;
    private int size;
    private String date;
    private String author;


    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public File(String name, String date, int size ,String author){
        this.name = name;
        this.date =date;
        this.size = size;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
    public int getCount(){
        return 1;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this +" ["+ date +"]"+ " ["+ getCount()+"개]" + " ["+author+"]"); //앞에 경로/ 본인 파일 
    }
}
