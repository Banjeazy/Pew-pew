public class PhraseOMatic {

    public static void main (String[] args) {

        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый",
                "взаимный", "обоюдный выйгрыш", "фронтенд"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт",
                "ориентированный", "центральный", "фирменный", "сетевой", "общий", "ускоренный"};
        String[] wordListThree = {"процесс", "талант", "образец", "портал", "обзор",
                "подход", "выход из положения"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
