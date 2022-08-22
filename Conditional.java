class Conditional{

    public static void main(String[] args) {



        int age=10;


        //If
        if(age>=18){
            System.out.println("You are ready to go");
        }else {
            System.out.println("Age Restricted");
        }

        // if else-if

        if(age>=18){
            System.out.println("You are 18+");
        } else if (age>=14) {
            System.out.println("You are 14 +");
        }else{
            System.out.println("You are not 18+ neither 14+");
        }

        // swtich
        switch (age){
            case 18:
                System.out.println("You are 18+");
                break;
            case 14:
                System.out.println("You are 14 +");
                break;
            default:
                System.out.println("You are not 18+ neither 14+");
        }

    }
}