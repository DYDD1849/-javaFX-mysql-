package Item;

public class grades {
    String term;
    String cls;
    String schollnum;
    String name;
    int pe;
    int math;
    int engish;
    int computer;
    int all;
    int aver;
    public void setschollnum(String a){
    this.schollnum=a;
    }
    public void setname(String a) {
        this.name=a;
    }
    public void setpe(int a) {
     this.pe=a;   
    }
    public void setmath(int a) {
        this.math=a;
    }
    public void setenglish(int a) {
        this.engish=a;
    }
    public void setcomputer(int a) {
        this.computer=a;
    }
public void start(){
    this.all=this.pe+this.math+this.engish+this.computer;
    this.aver=this.all/4;
}
}
