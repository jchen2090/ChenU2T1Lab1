public class CatRunner
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Gary", 12, 53.2);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Keith",6, 34.8);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
