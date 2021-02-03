package pt.novasbe.exps;

public class testesStrings {

    public void teste1(){

        String xpto = "ab-cfr-fgh-dds-qqwer-4333-ssds-4555";
        String[] info = xpto.split("-");

        System.out.println("String Original -> "+xpto+"");
        for (int i = 0; i < info.length; i++){

            System.out.println("Parser -> "+info[i]+"");

            for (int j = 0; j < info.length; j++){

                System.out.println("Parser inverso -> "+info[j]+"");
            }

        }

    }

}
