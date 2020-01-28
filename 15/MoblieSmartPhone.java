// class MobileSmartPhone{
//     public static void main(String[] args) {
//         SmartPhone smart = new SmartPhone("010-8123-0423", "Nougat");
//         smart.answer();
//         smart.playApp();

//         MobilePhone sm = new SmartPhone("010-2859-2043","Nougat");
//         sm.answer();
//         System.out.println(sm.number);
//         // error : androidVer cannot be resolved or is not a field
//         // System.out.println(sm.androidVer);
//         // error : The method playApp() is undefined for the type MobilePhone
//         // sm.playApp();
//         // sm.getAndroidVer();

//     }

// }

// class MobilePhone{
//     protected String number;

//     MobilePhone(String number){
//         this.number = number;
//     }

//     public void answer(){
//         System.out.println("Hi~ from "+number);
//     }
// }

// class SmartPhone extends MobilePhone{
//     String androidVer;
//     public SmartPhone(String num, String andVer){
//         super(num);
//         this.androidVer = andVer;
//     }
    
//     public void playApp(){
//         System.out.println("App is running in " + androidVer);
//     }

//     /**
//      * @return the androidVer
//      */
//     public String getAndroidVer() {
//         return androidVer;
//     }

//     /**
//      * @param androidVer the androidVer to set
//      */
//     public void setAndroidVer(String androidVer) {
//         this.androidVer = androidVer;
//     }
// }
