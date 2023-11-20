package basic_class;
import java.util.HashMap;
public  class namePass {

    String email;
    String password;

    static HashMap<String,String>logininfo=new HashMap<String,String>();

    namePass(String userName,String password){

        logininfo.put("meaw@gmail.com","meaw");
        logininfo.put("tahsin@gmail.com","123");
        logininfo.put("mahadi@yahoo.com","NSUPS");
        logininfo.put("jahid@gmail.com","*12tyehd");
        logininfo.put("maliha@gmail.com","masu3455");
        logininfo.put("huma.quare@gmail.com","rtye345Ta");
        logininfo.put("jubo@brac.edu","ali4sa");
        logininfo.put("umama@hotmail.com","ashrat345");
        logininfo.put("waseka@gmail.com","nourin49");
        logininfo.put("emeherun@gmail.com","jkat56#90");
        logininfo.put("mithila@gmail.com","jsgdt35*");
        logininfo.put("ayan@gmail.com","asha*677");

    }
    public  HashMap<String,String>getLoginInfo(){
        return logininfo;
    }


}
