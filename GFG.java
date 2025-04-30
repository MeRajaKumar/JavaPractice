class GFG {
    public static void revStg(String Param1) {
        String rev = "";
        for (int i = Param1.length() - 1; i >= 0; i--) {
            rev = rev + Param1.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String args[]) {
        revStg("zomsmart is hiring!");

    // String Param1="Zop kumar";
    // String rev="";
    // for(int i=Param1.length()-1;i>=0;i--){
    //     rev=rev+Param1.charAt(i);
    // };
    // System.out.println(rev);

    }
}


    

