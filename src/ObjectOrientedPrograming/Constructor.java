package ObjectOrientedPrograming;

public class Constructor {
    public static void main(String[] args) {


        Statics p1 = new Statics(23, 6778, "sneha");
        Statics p2 = new Statics(33, 4433, "Anu");
        Statics p3 = new Statics(19, 1234, "azar");

        System.out.println(Statics.distance);
//        System.out.println(p2.distance);
//        System.out.println(p3.distance);


//        Marathon p1 = new Marathon(2334, "person1");
//
//        System.out.println(p1.bibNum);
//        System.out.println(p1.name);
//        Marathon p2 = new Marathon(8990,"person2");
//        System.out.println(p2.bibNum);
//        System.out.println(p2.name);
//
//        Marathon p3 = new Marathon(p1);
//        System.out.println(p3.name);
//    }

        class Marathon {
            int bibNum;
            String name;

            Marathon(int bib, String names) {
                this.bibNum = bib;
                this.name = names;
            }

            Marathon(Marathon p1) {
                this.bibNum = p1.bibNum;
                this.name = p1.name;
            }


        }
    }
}

